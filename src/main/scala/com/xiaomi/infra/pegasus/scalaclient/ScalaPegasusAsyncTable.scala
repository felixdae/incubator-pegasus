package com.xiaomi.infra.pegasus.scalaclient
import com.xiaomi.infra.pegasus.client.{PException, PegasusTableInterface => ITable}
import com.xiaomi.infra.pegasus.scalaclient.{Serializer => SER}
import io.netty.util.concurrent.{GenericFutureListener, Future => NFuture}

import scala.collection.JavaConversions._
import scala.concurrent.duration._
import scala.concurrent.{Future, Promise}

trait ScalaPegasusAsyncTable extends PegasusUtil {
    private[scalaclient] val table: ITable

    @throws[PException]
    def exists[H, S](hashKey: H, sortKey: S, timeout: Duration = 0 milli)
            (implicit hSer: SER[H], sSer: SER[S]): Future[Boolean] = {
        toScala(table.asyncExist(hashKey, sortKey, timeout))
    }

    @throws[PException]
    def sortKeyCount[H](hashKey: H, timeout: Duration = 0 milli)
            (implicit hSer: SER[H]): Future[Long] = {
        toScala(table.asyncSortKeyCount(hSer.serialize(hashKey), timeout))
    }

    @throws[PException]
    def get[H, S](hashKey: H, sortKey: S, timeout: Duration = 0 milli)
            (implicit hSer: SER[H], sSer: SER[S]): Future[PegasusResult] = {
        val result = table.asyncGet(hSer.serialize(hashKey), sSer.serialize(sortKey), timeout)
        toScala(result)(PegasusResult.apply)
    }

    @throws[PException]
    def multiGet[H, S](hashKey: H, sortKeys: Seq[S], maxFetchCount: Int = 100, maxFetchSize: Int = 1000000, timeout: Duration = 0 milli)
            (implicit hSer: SER[H], sSer: SER[S]): Future[MultiGetResult[S, Array[Byte]]] = {
        val result = table.asyncMultiGet(hashKey, sortKeys, maxFetchCount, maxFetchSize, timeout)
        toScala(result)(convertMultiGetResult[S])
    }

    @throws[PException]
    def multiGetRange[H, S](hashKey: H, startSortKey: S, stopSortKey: S, options: Options.MultiGet,
            maxFetchCount: Int = 100, maxFetchSize: Int = 1000000, timeout: Duration = 0 milli)
            (implicit hSer: SER[H], sSer: SER[S]): Future[MultiGetResult[S, Array[Byte]]] = {
        val result = table.asyncMultiGet(hashKey, startSortKey, stopSortKey, options, maxFetchCount, maxFetchSize, timeout)
        toScala(result)(convertMultiGetResult[S])
    }

    @throws[PException]
    def multiGetSortKeys[H](hashKey: H, maxFetchCount: Int = 100, maxFetchSize: Int = 1000000, timeout: Duration = 0 milli)
            (implicit hSer: SER[H]): Future[MultiGetSortKeysResult[Array[Byte]]] = {
        val result = table.asyncMultiGetSortKeys(hashKey, maxFetchCount, maxFetchSize, timeout)
        toScala(result)(r => MultiGetSortKeysResult(r.allFetched, r.keys.toList))
    }

    @throws[PException]
    def set[H, S, V](hashKey: H, sortKey: S, value: V, ttl: Duration = 0 second, timeout: Duration = 0 milli)
            (implicit hSer: SER[H], sSer: SER[S], vSer: SER[V]): Future[Void] = {
        toScala(table.asyncSet(hashKey, sortKey, value, ttl.toSeconds.toInt, timeout))
    }

    @throws[PException]
    def multiSet[H, S, V](hashKey: H, values: Seq[(S, V)], ttl: Duration = 0 second, timeout: Duration = 0 milli)
            (implicit hSer: SER[H], sSer: SER[S], vSer: SER[V]): Future[Void] = {
        toScala(table.asyncMultiSet(hashKey, values.map(tupleToBytesPair(_)), ttl.toSeconds.toInt, timeout))
    }

    @throws[PException]
    def del[H, S](hashKey: H, sortKey: S,timeout: Duration = 0 milli)
            (implicit hSer: SER[H], sSer: SER[S]): Future[Void] = {
        toScala(table.asyncDel(hashKey, sortKey, timeout))
    }

    @throws[PException]
    def multiDel[H, S](hashKey: H, sortKeys: Seq[S], timeout: Duration = 0 milli)
            (implicit hSer: SER[H], sSer: SER[S]): Future[Void] = {
        toScala(table.asyncMultiDel(hashKey, sortKeys, timeout))
    }

    @throws[PException]
    def ttl[H, S](hashKey: H, sortKey: S, timeout: Duration = 0 milli)
            (implicit hSer: SER[H], sSer: SER[S]): Future[Integer] = {
        toScala(table.asyncTTL(hashKey, sortKey, timeout))
    }

    implicit private [scalaclient] def toScala[A, B](future: NFuture[A])(implicit f: A => B): Future[B] = {
        val promise = Promise[B]()
        future.addListener(new GenericFutureListener[NFuture[_ >: A]] {
            override def operationComplete(future: NFuture[_ >: A]): Unit = {
                if (future.isSuccess) {
                    promise.success(f(future.get.asInstanceOf[A]))
                } else {
                    promise.failure(future.cause())
                }
            }
        })
        promise.future
    }
}


class ScalaPegasusAsyncTableImpl(val table: ITable) extends ScalaPegasusAsyncTable