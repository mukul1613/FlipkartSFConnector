/**
 * TaskStatusEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class TaskStatusEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TaskStatusEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _unsubmitted = "unsubmitted";
    public static final java.lang.String _submitted = "submitted";
    public static final java.lang.String _processing = "processing";
    public static final java.lang.String _finished = "finished";
    public static final java.lang.String _failed = "failed";
    public static final java.lang.String _undefined = "undefined";
    public static final java.lang.String _cancelled = "cancelled";
    public static final java.lang.String _deleted = "deleted";
    public static final TaskStatusEnum unsubmitted = new TaskStatusEnum(_unsubmitted);
    public static final TaskStatusEnum submitted = new TaskStatusEnum(_submitted);
    public static final TaskStatusEnum processing = new TaskStatusEnum(_processing);
    public static final TaskStatusEnum finished = new TaskStatusEnum(_finished);
    public static final TaskStatusEnum failed = new TaskStatusEnum(_failed);
    public static final TaskStatusEnum undefined = new TaskStatusEnum(_undefined);
    public static final TaskStatusEnum cancelled = new TaskStatusEnum(_cancelled);
    public static final TaskStatusEnum deleted = new TaskStatusEnum(_deleted);
    public java.lang.String getValue() { return _value_;}
    public static TaskStatusEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TaskStatusEnum enumeration = (TaskStatusEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TaskStatusEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskStatusEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatusEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
