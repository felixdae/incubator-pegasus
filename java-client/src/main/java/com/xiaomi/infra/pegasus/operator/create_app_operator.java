/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.xiaomi.infra.pegasus.operator;

import com.xiaomi.infra.pegasus.apps.meta;
import com.xiaomi.infra.pegasus.base.gpid;
import com.xiaomi.infra.pegasus.replication.configuration_create_app_request;
import com.xiaomi.infra.pegasus.replication.configuration_create_app_response;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TMessageType;
import org.apache.thrift.protocol.TProtocol;

public class create_app_operator extends client_operator {
  public create_app_operator(String appName, configuration_create_app_request reqeust) {
    super(new gpid(), appName, 0);
    this.request = reqeust;
  }

  @Override
  public String name() {
    return "create_app_operator";
  }

  @Override
  public void send_data(TProtocol oprot, int sequence_id) throws TException {
    TMessage msg = new TMessage("RPC_CM_CREATE_APP", TMessageType.CALL, sequence_id);
    oprot.writeMessageBegin(msg);
    com.xiaomi.infra.pegasus.apps.meta.create_app_args args = new meta.create_app_args(request);
    args.write(oprot);
    oprot.writeMessageEnd();
  }

  @Override
  public void recv_data(TProtocol iprot) throws TException {
    meta.create_app_result result = new meta.create_app_result();
    result.read(iprot);
    if (result.isSetSuccess()) response = result.success;
    else
      throw new org.apache.thrift.TApplicationException(
          org.apache.thrift.TApplicationException.MISSING_RESULT,
          "create app failed: unknown result");
  }

  public configuration_create_app_response get_response() {
    return response;
  }

  private configuration_create_app_request request;
  private configuration_create_app_response response;
}
