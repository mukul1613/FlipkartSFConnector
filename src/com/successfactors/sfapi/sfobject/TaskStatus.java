/**
 * TaskStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class TaskStatus  implements java.io.Serializable {
    private java.lang.String taskId;

    private java.lang.String taskName;

    private java.lang.String createDate;

    private com.successfactors.sfapi.sfobject.TaskStatusEnum status;

    private com.successfactors.sfapi.sfobject.TaskResultStatus taskResult;

    public TaskStatus() {
    }

    public TaskStatus(
           java.lang.String taskId,
           java.lang.String taskName,
           java.lang.String createDate,
           com.successfactors.sfapi.sfobject.TaskStatusEnum status,
           com.successfactors.sfapi.sfobject.TaskResultStatus taskResult) {
           this.taskId = taskId;
           this.taskName = taskName;
           this.createDate = createDate;
           this.status = status;
           this.taskResult = taskResult;
    }


    /**
     * Gets the taskId value for this TaskStatus.
     * 
     * @return taskId
     */
    public java.lang.String getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this TaskStatus.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.String taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the taskName value for this TaskStatus.
     * 
     * @return taskName
     */
    public java.lang.String getTaskName() {
        return taskName;
    }


    /**
     * Sets the taskName value for this TaskStatus.
     * 
     * @param taskName
     */
    public void setTaskName(java.lang.String taskName) {
        this.taskName = taskName;
    }


    /**
     * Gets the createDate value for this TaskStatus.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this TaskStatus.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the status value for this TaskStatus.
     * 
     * @return status
     */
    public com.successfactors.sfapi.sfobject.TaskStatusEnum getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TaskStatus.
     * 
     * @param status
     */
    public void setStatus(com.successfactors.sfapi.sfobject.TaskStatusEnum status) {
        this.status = status;
    }


    /**
     * Gets the taskResult value for this TaskStatus.
     * 
     * @return taskResult
     */
    public com.successfactors.sfapi.sfobject.TaskResultStatus getTaskResult() {
        return taskResult;
    }


    /**
     * Sets the taskResult value for this TaskStatus.
     * 
     * @param taskResult
     */
    public void setTaskResult(com.successfactors.sfapi.sfobject.TaskResultStatus taskResult) {
        this.taskResult = taskResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskStatus)) return false;
        TaskStatus other = (TaskStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.taskName==null && other.getTaskName()==null) || 
             (this.taskName!=null &&
              this.taskName.equals(other.getTaskName()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.taskResult==null && other.getTaskResult()==null) || 
             (this.taskResult!=null &&
              this.taskResult.equals(other.getTaskResult())));
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
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getTaskName() != null) {
            _hashCode += getTaskName().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTaskResult() != null) {
            _hashCode += getTaskResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "taskName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatusEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "taskResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskResultStatus"));
        elemField.setMinOccurs(0);
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
