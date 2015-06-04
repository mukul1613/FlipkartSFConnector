/**
 * InsertResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class InsertResult  implements java.io.Serializable {
    private java.lang.String jobStatus;

    private java.lang.String message;

    private com.successfactors.sfapi.sfobject.ObjectEditResult[] objectEditResult;

    public InsertResult() {
    }

    public InsertResult(
           java.lang.String jobStatus,
           java.lang.String message,
           com.successfactors.sfapi.sfobject.ObjectEditResult[] objectEditResult) {
           this.jobStatus = jobStatus;
           this.message = message;
           this.objectEditResult = objectEditResult;
    }


    /**
     * Gets the jobStatus value for this InsertResult.
     * 
     * @return jobStatus
     */
    public java.lang.String getJobStatus() {
        return jobStatus;
    }


    /**
     * Sets the jobStatus value for this InsertResult.
     * 
     * @param jobStatus
     */
    public void setJobStatus(java.lang.String jobStatus) {
        this.jobStatus = jobStatus;
    }


    /**
     * Gets the message value for this InsertResult.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this InsertResult.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the objectEditResult value for this InsertResult.
     * 
     * @return objectEditResult
     */
    public com.successfactors.sfapi.sfobject.ObjectEditResult[] getObjectEditResult() {
        return objectEditResult;
    }


    /**
     * Sets the objectEditResult value for this InsertResult.
     * 
     * @param objectEditResult
     */
    public void setObjectEditResult(com.successfactors.sfapi.sfobject.ObjectEditResult[] objectEditResult) {
        this.objectEditResult = objectEditResult;
    }

    public com.successfactors.sfapi.sfobject.ObjectEditResult getObjectEditResult(int i) {
        return this.objectEditResult[i];
    }

    public void setObjectEditResult(int i, com.successfactors.sfapi.sfobject.ObjectEditResult _value) {
        this.objectEditResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertResult)) return false;
        InsertResult other = (InsertResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobStatus==null && other.getJobStatus()==null) || 
             (this.jobStatus!=null &&
              this.jobStatus.equals(other.getJobStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.objectEditResult==null && other.getObjectEditResult()==null) || 
             (this.objectEditResult!=null &&
              java.util.Arrays.equals(this.objectEditResult, other.getObjectEditResult())));
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
        if (getJobStatus() != null) {
            _hashCode += getJobStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getObjectEditResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectEditResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectEditResult(), i);
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
        new org.apache.axis.description.TypeDesc(InsertResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "InsertResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "jobStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectEditResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "objectEditResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "ObjectEditResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
