/**
 * FeatureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class FeatureType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeatureType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _insert = "insert";
    public static final java.lang.String _update = "update";
    public static final java.lang.String _upsert = "upsert";
    public static final java.lang.String _delete = "delete";
    public static final java.lang.String _query = "query";
    public static final java.lang.String _queryMore = "queryMore";
    public static final FeatureType insert = new FeatureType(_insert);
    public static final FeatureType update = new FeatureType(_update);
    public static final FeatureType upsert = new FeatureType(_upsert);
    public static final FeatureType delete = new FeatureType(_delete);
    public static final FeatureType query = new FeatureType(_query);
    public static final FeatureType queryMore = new FeatureType(_queryMore);
    public java.lang.String getValue() { return _value_;}
    public static FeatureType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeatureType enumeration = (FeatureType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeatureType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeatureType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "featureType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
