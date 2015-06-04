/**
 * SubmitQueryJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class SubmitQueryJob  implements java.io.Serializable {
    private java.lang.String queryString;

    private com.successfactors.sfapi.sfobject.SFParameter[] param;

    public SubmitQueryJob() {
    }

    public SubmitQueryJob(
           java.lang.String queryString,
           com.successfactors.sfapi.sfobject.SFParameter[] param) {
           this.queryString = queryString;
           this.param = param;
    }


    /**
     * Gets the queryString value for this SubmitQueryJob.
     * 
     * @return queryString
     */
    public java.lang.String getQueryString() {
        return queryString;
    }


    /**
     * Sets the queryString value for this SubmitQueryJob.
     * 
     * @param queryString
     */
    public void setQueryString(java.lang.String queryString) {
        this.queryString = queryString;
    }


    /**
     * Gets the param value for this SubmitQueryJob.
     * 
     * @return param
     */
    public com.successfactors.sfapi.sfobject.SFParameter[] getParam() {
        return param;
    }


    /**
     * Sets the param value for this SubmitQueryJob.
     * 
     * @param param
     */
    public void setParam(com.successfactors.sfapi.sfobject.SFParameter[] param) {
        this.param = param;
    }

    public com.successfactors.sfapi.sfobject.SFParameter getParam(int i) {
        return this.param[i];
    }

    public void setParam(int i, com.successfactors.sfapi.sfobject.SFParameter _value) {
        this.param[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitQueryJob)) return false;
        SubmitQueryJob other = (SubmitQueryJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryString==null && other.getQueryString()==null) || 
             (this.queryString!=null &&
              this.queryString.equals(other.getQueryString()))) &&
            ((this.param==null && other.getParam()==null) || 
             (this.param!=null &&
              java.util.Arrays.equals(this.param, other.getParam())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getQueryString() != null) {
            _hashCode += getQueryString().hashCode();
        }
        if (getParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitQueryJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">submitQueryJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "queryString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("param");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "param"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
