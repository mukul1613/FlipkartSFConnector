/**
 * TaskResultStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class TaskResultStatus  implements java.io.Serializable {
    private java.lang.String taskResultId;

    private java.lang.String lastFinishTime;

    private java.lang.String lastStartTime;

    private java.lang.String validUntil;

    private java.lang.String errorCode;

    private java.lang.String message;

    private com.successfactors.sfapi.sfobject.TaskResultStatusEnum status;

    public TaskResultStatus() {
    }

    public TaskResultStatus(
           java.lang.String taskResultId,
           java.lang.String lastFinishTime,
           java.lang.String lastStartTime,
           java.lang.String validUntil,
           java.lang.String errorCode,
           java.lang.String message,
           com.successfactors.sfapi.sfobject.TaskResultStatusEnum status) {
           this.taskResultId = taskResultId;
           this.lastFinishTime = lastFinishTime;
           this.lastStartTime = lastStartTime;
           this.validUntil = validUntil;
           this.errorCode = errorCode;
           this.message = message;
           this.status = status;
    }


    /**
     * Gets the taskResultId value for this TaskResultStatus.
     * 
     * @return taskResultId
     */
    public java.lang.String getTaskResultId() {
        return taskResultId;
    }


    /**
     * Sets the taskResultId value for this TaskResultStatus.
     * 
     * @param taskResultId
     */
    public void setTaskResultId(java.lang.String taskResultId) {
        this.taskResultId = taskResultId;
    }


    /**
     * Gets the lastFinishTime value for this TaskResultStatus.
     * 
     * @return lastFinishTime
     */
    public java.lang.String getLastFinishTime() {
        return lastFinishTime;
    }


    /**
     * Sets the lastFinishTime value for this TaskResultStatus.
     * 
     * @param lastFinishTime
     */
    public void setLastFinishTime(java.lang.String lastFinishTime) {
        this.lastFinishTime = lastFinishTime;
    }


    /**
     * Gets the lastStartTime value for this TaskResultStatus.
     * 
     * @return lastStartTime
     */
    public java.lang.String getLastStartTime() {
        return lastStartTime;
    }


    /**
     * Sets the lastStartTime value for this TaskResultStatus.
     * 
     * @param lastStartTime
     */
    public void setLastStartTime(java.lang.String lastStartTime) {
        this.lastStartTime = lastStartTime;
    }


    /**
     * Gets the validUntil value for this TaskResultStatus.
     * 
     * @return validUntil
     */
    public java.lang.String getValidUntil() {
        return validUntil;
    }


    /**
     * Sets the validUntil value for this TaskResultStatus.
     * 
     * @param validUntil
     */
    public void setValidUntil(java.lang.String validUntil) {
        this.validUntil = validUntil;
    }


    /**
     * Gets the errorCode value for this TaskResultStatus.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this TaskResultStatus.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the message value for this TaskResultStatus.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TaskResultStatus.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the status value for this TaskResultStatus.
     * 
     * @return status
     */
    public com.successfactors.sfapi.sfobject.TaskResultStatusEnum getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TaskResultStatus.
     * 
     * @param status
     */
    public void setStatus(com.successfactors.sfapi.sfobject.TaskResultStatusEnum status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskResultStatus)) return false;
        TaskResultStatus other = (TaskResultStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taskResultId==null && other.getTaskResultId()==null) || 
             (this.taskResultId!=null &&
              this.taskResultId.equals(other.getTaskResultId()))) &&
            ((this.lastFinishTime==null && other.getLastFinishTime()==null) || 
             (this.lastFinishTime!=null &&
              this.lastFinishTime.equals(other.getLastFinishTime()))) &&
            ((this.lastStartTime==null && other.getLastStartTime()==null) || 
             (this.lastStartTime!=null &&
              this.lastStartTime.equals(other.getLastStartTime()))) &&
            ((this.validUntil==null && other.getValidUntil()==null) || 
             (this.validUntil!=null &&
              this.validUntil.equals(other.getValidUntil()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getTaskResultId() != null) {
            _hashCode += getTaskResultId().hashCode();
        }
        if (getLastFinishTime() != null) {
            _hashCode += getLastFinishTime().hashCode();
        }
        if (getLastStartTime() != null) {
            _hashCode += getLastStartTime().hashCode();
        }
        if (getValidUntil() != null) {
            _hashCode += getValidUntil().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskResultStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskResultStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskResultId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "taskResultId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastFinishTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "lastFinishTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "lastStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "validUntil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskResultStatusEnum"));
        elemField.setNillable(false);
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
