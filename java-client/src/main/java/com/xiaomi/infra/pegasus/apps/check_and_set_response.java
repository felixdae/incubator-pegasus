// Copyright (c) 2017, Xiaomi, Inc.  All rights reserved.
// This source code is licensed under the Apache License Version 2.0, which
// can be found in the LICENSE file in the root directory of this source tree.
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.pegasus.apps;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2020-04-13")
public class check_and_set_response implements org.apache.thrift.TBase<check_and_set_response, check_and_set_response._Fields>, java.io.Serializable, Cloneable, Comparable<check_and_set_response> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("check_and_set_response");

  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CHECK_VALUE_RETURNED_FIELD_DESC = new org.apache.thrift.protocol.TField("check_value_returned", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField CHECK_VALUE_EXIST_FIELD_DESC = new org.apache.thrift.protocol.TField("check_value_exist", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField CHECK_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("check_value", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("app_id", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField PARTITION_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_index", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField DECREE_FIELD_DESC = new org.apache.thrift.protocol.TField("decree", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField SERVER_FIELD_DESC = new org.apache.thrift.protocol.TField("server", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new check_and_set_responseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new check_and_set_responseTupleSchemeFactory();

  public int error; // required
  public boolean check_value_returned; // required
  public boolean check_value_exist; // required
  public com.xiaomi.infra.pegasus.base.blob check_value; // required
  public int app_id; // required
  public int partition_index; // required
  public long decree; // required
  public java.lang.String server; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR((short)1, "error"),
    CHECK_VALUE_RETURNED((short)2, "check_value_returned"),
    CHECK_VALUE_EXIST((short)3, "check_value_exist"),
    CHECK_VALUE((short)4, "check_value"),
    APP_ID((short)5, "app_id"),
    PARTITION_INDEX((short)6, "partition_index"),
    DECREE((short)7, "decree"),
    SERVER((short)8, "server");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR
          return ERROR;
        case 2: // CHECK_VALUE_RETURNED
          return CHECK_VALUE_RETURNED;
        case 3: // CHECK_VALUE_EXIST
          return CHECK_VALUE_EXIST;
        case 4: // CHECK_VALUE
          return CHECK_VALUE;
        case 5: // APP_ID
          return APP_ID;
        case 6: // PARTITION_INDEX
          return PARTITION_INDEX;
        case 7: // DECREE
          return DECREE;
        case 8: // SERVER
          return SERVER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERROR_ISSET_ID = 0;
  private static final int __CHECK_VALUE_RETURNED_ISSET_ID = 1;
  private static final int __CHECK_VALUE_EXIST_ISSET_ID = 2;
  private static final int __APP_ID_ISSET_ID = 3;
  private static final int __PARTITION_INDEX_ISSET_ID = 4;
  private static final int __DECREE_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CHECK_VALUE_RETURNED, new org.apache.thrift.meta_data.FieldMetaData("check_value_returned", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CHECK_VALUE_EXIST, new org.apache.thrift.meta_data.FieldMetaData("check_value_exist", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CHECK_VALUE, new org.apache.thrift.meta_data.FieldMetaData("check_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.xiaomi.infra.pegasus.base.blob.class)));
    tmpMap.put(_Fields.APP_ID, new org.apache.thrift.meta_data.FieldMetaData("app_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PARTITION_INDEX, new org.apache.thrift.meta_data.FieldMetaData("partition_index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DECREE, new org.apache.thrift.meta_data.FieldMetaData("decree", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SERVER, new org.apache.thrift.meta_data.FieldMetaData("server", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(check_and_set_response.class, metaDataMap);
  }

  public check_and_set_response() {
  }

  public check_and_set_response(
    int error,
    boolean check_value_returned,
    boolean check_value_exist,
    com.xiaomi.infra.pegasus.base.blob check_value,
    int app_id,
    int partition_index,
    long decree,
    java.lang.String server)
  {
    this();
    this.error = error;
    setErrorIsSet(true);
    this.check_value_returned = check_value_returned;
    setCheck_value_returnedIsSet(true);
    this.check_value_exist = check_value_exist;
    setCheck_value_existIsSet(true);
    this.check_value = check_value;
    this.app_id = app_id;
    setApp_idIsSet(true);
    this.partition_index = partition_index;
    setPartition_indexIsSet(true);
    this.decree = decree;
    setDecreeIsSet(true);
    this.server = server;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public check_and_set_response(check_and_set_response other) {
    __isset_bitfield = other.__isset_bitfield;
    this.error = other.error;
    this.check_value_returned = other.check_value_returned;
    this.check_value_exist = other.check_value_exist;
    if (other.isSetCheck_value()) {
      this.check_value = new com.xiaomi.infra.pegasus.base.blob(other.check_value);
    }
    this.app_id = other.app_id;
    this.partition_index = other.partition_index;
    this.decree = other.decree;
    if (other.isSetServer()) {
      this.server = other.server;
    }
  }

  public check_and_set_response deepCopy() {
    return new check_and_set_response(this);
  }

  @Override
  public void clear() {
    setErrorIsSet(false);
    this.error = 0;
    setCheck_value_returnedIsSet(false);
    this.check_value_returned = false;
    setCheck_value_existIsSet(false);
    this.check_value_exist = false;
    this.check_value = null;
    setApp_idIsSet(false);
    this.app_id = 0;
    setPartition_indexIsSet(false);
    this.partition_index = 0;
    setDecreeIsSet(false);
    this.decree = 0;
    this.server = null;
  }

  public int getError() {
    return this.error;
  }

  public check_and_set_response setError(int error) {
    this.error = error;
    setErrorIsSet(true);
    return this;
  }

  public void unsetError() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERROR_ISSET_ID);
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERROR_ISSET_ID);
  }

  public void setErrorIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERROR_ISSET_ID, value);
  }

  public boolean isCheck_value_returned() {
    return this.check_value_returned;
  }

  public check_and_set_response setCheck_value_returned(boolean check_value_returned) {
    this.check_value_returned = check_value_returned;
    setCheck_value_returnedIsSet(true);
    return this;
  }

  public void unsetCheck_value_returned() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHECK_VALUE_RETURNED_ISSET_ID);
  }

  /** Returns true if field check_value_returned is set (has been assigned a value) and false otherwise */
  public boolean isSetCheck_value_returned() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHECK_VALUE_RETURNED_ISSET_ID);
  }

  public void setCheck_value_returnedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHECK_VALUE_RETURNED_ISSET_ID, value);
  }

  public boolean isCheck_value_exist() {
    return this.check_value_exist;
  }

  public check_and_set_response setCheck_value_exist(boolean check_value_exist) {
    this.check_value_exist = check_value_exist;
    setCheck_value_existIsSet(true);
    return this;
  }

  public void unsetCheck_value_exist() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHECK_VALUE_EXIST_ISSET_ID);
  }

  /** Returns true if field check_value_exist is set (has been assigned a value) and false otherwise */
  public boolean isSetCheck_value_exist() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHECK_VALUE_EXIST_ISSET_ID);
  }

  public void setCheck_value_existIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHECK_VALUE_EXIST_ISSET_ID, value);
  }

  public com.xiaomi.infra.pegasus.base.blob getCheck_value() {
    return this.check_value;
  }

  public check_and_set_response setCheck_value(com.xiaomi.infra.pegasus.base.blob check_value) {
    this.check_value = check_value;
    return this;
  }

  public void unsetCheck_value() {
    this.check_value = null;
  }

  /** Returns true if field check_value is set (has been assigned a value) and false otherwise */
  public boolean isSetCheck_value() {
    return this.check_value != null;
  }

  public void setCheck_valueIsSet(boolean value) {
    if (!value) {
      this.check_value = null;
    }
  }

  public int getApp_id() {
    return this.app_id;
  }

  public check_and_set_response setApp_id(int app_id) {
    this.app_id = app_id;
    setApp_idIsSet(true);
    return this;
  }

  public void unsetApp_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __APP_ID_ISSET_ID);
  }

  /** Returns true if field app_id is set (has been assigned a value) and false otherwise */
  public boolean isSetApp_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __APP_ID_ISSET_ID);
  }

  public void setApp_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __APP_ID_ISSET_ID, value);
  }

  public int getPartition_index() {
    return this.partition_index;
  }

  public check_and_set_response setPartition_index(int partition_index) {
    this.partition_index = partition_index;
    setPartition_indexIsSet(true);
    return this;
  }

  public void unsetPartition_index() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PARTITION_INDEX_ISSET_ID);
  }

  /** Returns true if field partition_index is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_index() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PARTITION_INDEX_ISSET_ID);
  }

  public void setPartition_indexIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PARTITION_INDEX_ISSET_ID, value);
  }

  public long getDecree() {
    return this.decree;
  }

  public check_and_set_response setDecree(long decree) {
    this.decree = decree;
    setDecreeIsSet(true);
    return this;
  }

  public void unsetDecree() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DECREE_ISSET_ID);
  }

  /** Returns true if field decree is set (has been assigned a value) and false otherwise */
  public boolean isSetDecree() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DECREE_ISSET_ID);
  }

  public void setDecreeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DECREE_ISSET_ID, value);
  }

  public java.lang.String getServer() {
    return this.server;
  }

  public check_and_set_response setServer(java.lang.String server) {
    this.server = server;
    return this;
  }

  public void unsetServer() {
    this.server = null;
  }

  /** Returns true if field server is set (has been assigned a value) and false otherwise */
  public boolean isSetServer() {
    return this.server != null;
  }

  public void setServerIsSet(boolean value) {
    if (!value) {
      this.server = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((java.lang.Integer)value);
      }
      break;

    case CHECK_VALUE_RETURNED:
      if (value == null) {
        unsetCheck_value_returned();
      } else {
        setCheck_value_returned((java.lang.Boolean)value);
      }
      break;

    case CHECK_VALUE_EXIST:
      if (value == null) {
        unsetCheck_value_exist();
      } else {
        setCheck_value_exist((java.lang.Boolean)value);
      }
      break;

    case CHECK_VALUE:
      if (value == null) {
        unsetCheck_value();
      } else {
        setCheck_value((com.xiaomi.infra.pegasus.base.blob)value);
      }
      break;

    case APP_ID:
      if (value == null) {
        unsetApp_id();
      } else {
        setApp_id((java.lang.Integer)value);
      }
      break;

    case PARTITION_INDEX:
      if (value == null) {
        unsetPartition_index();
      } else {
        setPartition_index((java.lang.Integer)value);
      }
      break;

    case DECREE:
      if (value == null) {
        unsetDecree();
      } else {
        setDecree((java.lang.Long)value);
      }
      break;

    case SERVER:
      if (value == null) {
        unsetServer();
      } else {
        setServer((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR:
      return getError();

    case CHECK_VALUE_RETURNED:
      return isCheck_value_returned();

    case CHECK_VALUE_EXIST:
      return isCheck_value_exist();

    case CHECK_VALUE:
      return getCheck_value();

    case APP_ID:
      return getApp_id();

    case PARTITION_INDEX:
      return getPartition_index();

    case DECREE:
      return getDecree();

    case SERVER:
      return getServer();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERROR:
      return isSetError();
    case CHECK_VALUE_RETURNED:
      return isSetCheck_value_returned();
    case CHECK_VALUE_EXIST:
      return isSetCheck_value_exist();
    case CHECK_VALUE:
      return isSetCheck_value();
    case APP_ID:
      return isSetApp_id();
    case PARTITION_INDEX:
      return isSetPartition_index();
    case DECREE:
      return isSetDecree();
    case SERVER:
      return isSetServer();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof check_and_set_response)
      return this.equals((check_and_set_response)that);
    return false;
  }

  public boolean equals(check_and_set_response that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_error = true;
    boolean that_present_error = true;
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (this.error != that.error)
        return false;
    }

    boolean this_present_check_value_returned = true;
    boolean that_present_check_value_returned = true;
    if (this_present_check_value_returned || that_present_check_value_returned) {
      if (!(this_present_check_value_returned && that_present_check_value_returned))
        return false;
      if (this.check_value_returned != that.check_value_returned)
        return false;
    }

    boolean this_present_check_value_exist = true;
    boolean that_present_check_value_exist = true;
    if (this_present_check_value_exist || that_present_check_value_exist) {
      if (!(this_present_check_value_exist && that_present_check_value_exist))
        return false;
      if (this.check_value_exist != that.check_value_exist)
        return false;
    }

    boolean this_present_check_value = true && this.isSetCheck_value();
    boolean that_present_check_value = true && that.isSetCheck_value();
    if (this_present_check_value || that_present_check_value) {
      if (!(this_present_check_value && that_present_check_value))
        return false;
      if (!this.check_value.equals(that.check_value))
        return false;
    }

    boolean this_present_app_id = true;
    boolean that_present_app_id = true;
    if (this_present_app_id || that_present_app_id) {
      if (!(this_present_app_id && that_present_app_id))
        return false;
      if (this.app_id != that.app_id)
        return false;
    }

    boolean this_present_partition_index = true;
    boolean that_present_partition_index = true;
    if (this_present_partition_index || that_present_partition_index) {
      if (!(this_present_partition_index && that_present_partition_index))
        return false;
      if (this.partition_index != that.partition_index)
        return false;
    }

    boolean this_present_decree = true;
    boolean that_present_decree = true;
    if (this_present_decree || that_present_decree) {
      if (!(this_present_decree && that_present_decree))
        return false;
      if (this.decree != that.decree)
        return false;
    }

    boolean this_present_server = true && this.isSetServer();
    boolean that_present_server = true && that.isSetServer();
    if (this_present_server || that_present_server) {
      if (!(this_present_server && that_present_server))
        return false;
      if (!this.server.equals(that.server))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + error;

    hashCode = hashCode * 8191 + ((check_value_returned) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((check_value_exist) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetCheck_value()) ? 131071 : 524287);
    if (isSetCheck_value())
      hashCode = hashCode * 8191 + check_value.hashCode();

    hashCode = hashCode * 8191 + app_id;

    hashCode = hashCode * 8191 + partition_index;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(decree);

    hashCode = hashCode * 8191 + ((isSetServer()) ? 131071 : 524287);
    if (isSetServer())
      hashCode = hashCode * 8191 + server.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(check_and_set_response other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetError()).compareTo(other.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCheck_value_returned()).compareTo(other.isSetCheck_value_returned());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheck_value_returned()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.check_value_returned, other.check_value_returned);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCheck_value_exist()).compareTo(other.isSetCheck_value_exist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheck_value_exist()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.check_value_exist, other.check_value_exist);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCheck_value()).compareTo(other.isSetCheck_value());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCheck_value()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.check_value, other.check_value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApp_id()).compareTo(other.isSetApp_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApp_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.app_id, other.app_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPartition_index()).compareTo(other.isSetPartition_index());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_index()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_index, other.partition_index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDecree()).compareTo(other.isSetDecree());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDecree()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.decree, other.decree);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetServer()).compareTo(other.isSetServer());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServer()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.server, other.server);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("check_and_set_response(");
    boolean first = true;

    sb.append("error:");
    sb.append(this.error);
    first = false;
    if (!first) sb.append(", ");
    sb.append("check_value_returned:");
    sb.append(this.check_value_returned);
    first = false;
    if (!first) sb.append(", ");
    sb.append("check_value_exist:");
    sb.append(this.check_value_exist);
    first = false;
    if (!first) sb.append(", ");
    sb.append("check_value:");
    if (this.check_value == null) {
      sb.append("null");
    } else {
      sb.append(this.check_value);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("app_id:");
    sb.append(this.app_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("partition_index:");
    sb.append(this.partition_index);
    first = false;
    if (!first) sb.append(", ");
    sb.append("decree:");
    sb.append(this.decree);
    first = false;
    if (!first) sb.append(", ");
    sb.append("server:");
    if (this.server == null) {
      sb.append("null");
    } else {
      sb.append(this.server);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (check_value != null) {
      check_value.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class check_and_set_responseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public check_and_set_responseStandardScheme getScheme() {
      return new check_and_set_responseStandardScheme();
    }
  }

  private static class check_and_set_responseStandardScheme extends org.apache.thrift.scheme.StandardScheme<check_and_set_response> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, check_and_set_response struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.error = iprot.readI32();
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHECK_VALUE_RETURNED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.check_value_returned = iprot.readBool();
              struct.setCheck_value_returnedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CHECK_VALUE_EXIST
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.check_value_exist = iprot.readBool();
              struct.setCheck_value_existIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CHECK_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.check_value = new com.xiaomi.infra.pegasus.base.blob();
              struct.check_value.read(iprot);
              struct.setCheck_valueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.app_id = iprot.readI32();
              struct.setApp_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PARTITION_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.partition_index = iprot.readI32();
              struct.setPartition_indexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DECREE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.decree = iprot.readI64();
              struct.setDecreeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // SERVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.server = iprot.readString();
              struct.setServerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, check_and_set_response struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERROR_FIELD_DESC);
      oprot.writeI32(struct.error);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHECK_VALUE_RETURNED_FIELD_DESC);
      oprot.writeBool(struct.check_value_returned);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHECK_VALUE_EXIST_FIELD_DESC);
      oprot.writeBool(struct.check_value_exist);
      oprot.writeFieldEnd();
      if (struct.check_value != null) {
        oprot.writeFieldBegin(CHECK_VALUE_FIELD_DESC);
        struct.check_value.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(APP_ID_FIELD_DESC);
      oprot.writeI32(struct.app_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PARTITION_INDEX_FIELD_DESC);
      oprot.writeI32(struct.partition_index);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DECREE_FIELD_DESC);
      oprot.writeI64(struct.decree);
      oprot.writeFieldEnd();
      if (struct.server != null) {
        oprot.writeFieldBegin(SERVER_FIELD_DESC);
        oprot.writeString(struct.server);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class check_and_set_responseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public check_and_set_responseTupleScheme getScheme() {
      return new check_and_set_responseTupleScheme();
    }
  }

  private static class check_and_set_responseTupleScheme extends org.apache.thrift.scheme.TupleScheme<check_and_set_response> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, check_and_set_response struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetError()) {
        optionals.set(0);
      }
      if (struct.isSetCheck_value_returned()) {
        optionals.set(1);
      }
      if (struct.isSetCheck_value_exist()) {
        optionals.set(2);
      }
      if (struct.isSetCheck_value()) {
        optionals.set(3);
      }
      if (struct.isSetApp_id()) {
        optionals.set(4);
      }
      if (struct.isSetPartition_index()) {
        optionals.set(5);
      }
      if (struct.isSetDecree()) {
        optionals.set(6);
      }
      if (struct.isSetServer()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetError()) {
        oprot.writeI32(struct.error);
      }
      if (struct.isSetCheck_value_returned()) {
        oprot.writeBool(struct.check_value_returned);
      }
      if (struct.isSetCheck_value_exist()) {
        oprot.writeBool(struct.check_value_exist);
      }
      if (struct.isSetCheck_value()) {
        struct.check_value.write(oprot);
      }
      if (struct.isSetApp_id()) {
        oprot.writeI32(struct.app_id);
      }
      if (struct.isSetPartition_index()) {
        oprot.writeI32(struct.partition_index);
      }
      if (struct.isSetDecree()) {
        oprot.writeI64(struct.decree);
      }
      if (struct.isSetServer()) {
        oprot.writeString(struct.server);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, check_and_set_response struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.error = iprot.readI32();
        struct.setErrorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.check_value_returned = iprot.readBool();
        struct.setCheck_value_returnedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.check_value_exist = iprot.readBool();
        struct.setCheck_value_existIsSet(true);
      }
      if (incoming.get(3)) {
        struct.check_value = new com.xiaomi.infra.pegasus.base.blob();
        struct.check_value.read(iprot);
        struct.setCheck_valueIsSet(true);
      }
      if (incoming.get(4)) {
        struct.app_id = iprot.readI32();
        struct.setApp_idIsSet(true);
      }
      if (incoming.get(5)) {
        struct.partition_index = iprot.readI32();
        struct.setPartition_indexIsSet(true);
      }
      if (incoming.get(6)) {
        struct.decree = iprot.readI64();
        struct.setDecreeIsSet(true);
      }
      if (incoming.get(7)) {
        struct.server = iprot.readString();
        struct.setServerIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

