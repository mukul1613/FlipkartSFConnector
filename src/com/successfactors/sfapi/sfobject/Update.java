/**
 * Update.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class Update  implements java.io.Serializable {
    private java.lang.String type;

    private com.successfactors.sfapi.sfobject.SFObject[] sfobject;

    private com.successfactors.sfapi.sfobject.SFParameter[] processingParam;

    public Update() {
    }

    public Update(
           java.lang.String type,
           com.successfactors.sfapi.sfobject.SFObject[] sfobject,
           com.successfactors.sfapi.sfobject.SFParameter[] processingParam) {
           this.type = type;
           this.sfobject = sfobject;
           this.processingParam = processingParam;
    }


    /**
     * Gets the type value for this Update.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Update.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the sfobject value for this Update.
     * 
     * @return sfobject
     */
    public com.successfactors.sfapi.sfobject.SFObject[] getSfobject() {
        return sfobject;
    }


    /**
     * Sets the sfobject value for this Update.
     * 
     * @param sfobject
     */
    public void setSfobject(com.successfactors.sfapi.sfobject.SFObject[] sfobject) {
        this.sfobject = sfobject;
    }

    public com.successfactors.sfapi.sfobject.SFObject getSfobject(int i) {
        return this.sfobject[i];
    }

    public void setSfobject(int i, com.successfactors.sfapi.sfobject.SFObject _value) {
        this.sfobject[i] = _value;
    }


    /**
     * Gets the processingParam value for this Update.
     * 
     * @return processingParam
     */
    public com.successfactors.sfapi.sfobject.SFParameter[] getProcessingParam() {
        return processingParam;
    }


    /**
     * Sets the processingParam value for this Update.
     * 
     * @param processingParam
     */
    public void setProcessingParam(com.successfactors.sfapi.sfobject.SFParameter[] processingParam) {
        this.processingParam = processingParam;
    }

    public com.successfactors.sfapi.sfobject.SFParameter getProcessingParam(int i) {
        return this.processingParam[i];
    }

    public void setProcessingParam(int i, com.successfactors.sfapi.sfobject.SFParameter _value) {
        this.processingParam[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Update)) return false;
        Update other = (Update) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.sfobject==null && other.getSfobject()==null) || 
             (this.sfobject!=null &&
              java.util.Arrays.equals(this.sfobject, other.getSfobject()))) &&
            ((this.processingParam==null && other.getProcessingParam()==null) || 
             (this.processingParam!=null &&
              java.util.Arrays.equals(this.processingParam, other.getProcessingParam())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSfobject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSfobject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSfobject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessingParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessingParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessingParam(), i);
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
        new org.apache.axis.description.TypeDesc(Update.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">update"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sfobject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "sfobject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFObject"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingParam");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "processingParam"));
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
