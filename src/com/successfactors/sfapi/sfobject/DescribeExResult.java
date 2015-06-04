/**
 * DescribeExResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class DescribeExResult  implements java.io.Serializable {
    private java.lang.String type;

    private com.successfactors.sfapi.sfobject.EntityInfo entityInfo;

    private com.successfactors.sfapi.sfobject.FieldEx[] field;

    private com.successfactors.sfapi.sfobject.FeatureType[] feature;

    private com.successfactors.sfapi.sfobject.Error[] error;

    public DescribeExResult() {
    }

    public DescribeExResult(
           java.lang.String type,
           com.successfactors.sfapi.sfobject.EntityInfo entityInfo,
           com.successfactors.sfapi.sfobject.FieldEx[] field,
           com.successfactors.sfapi.sfobject.FeatureType[] feature,
           com.successfactors.sfapi.sfobject.Error[] error) {
           this.type = type;
           this.entityInfo = entityInfo;
           this.field = field;
           this.feature = feature;
           this.error = error;
    }


    /**
     * Gets the type value for this DescribeExResult.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DescribeExResult.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the entityInfo value for this DescribeExResult.
     * 
     * @return entityInfo
     */
    public com.successfactors.sfapi.sfobject.EntityInfo getEntityInfo() {
        return entityInfo;
    }


    /**
     * Sets the entityInfo value for this DescribeExResult.
     * 
     * @param entityInfo
     */
    public void setEntityInfo(com.successfactors.sfapi.sfobject.EntityInfo entityInfo) {
        this.entityInfo = entityInfo;
    }


    /**
     * Gets the field value for this DescribeExResult.
     * 
     * @return field
     */
    public com.successfactors.sfapi.sfobject.FieldEx[] getField() {
        return field;
    }


    /**
     * Sets the field value for this DescribeExResult.
     * 
     * @param field
     */
    public void setField(com.successfactors.sfapi.sfobject.FieldEx[] field) {
        this.field = field;
    }

    public com.successfactors.sfapi.sfobject.FieldEx getField(int i) {
        return this.field[i];
    }

    public void setField(int i, com.successfactors.sfapi.sfobject.FieldEx _value) {
        this.field[i] = _value;
    }


    /**
     * Gets the feature value for this DescribeExResult.
     * 
     * @return feature
     */
    public com.successfactors.sfapi.sfobject.FeatureType[] getFeature() {
        return feature;
    }


    /**
     * Sets the feature value for this DescribeExResult.
     * 
     * @param feature
     */
    public void setFeature(com.successfactors.sfapi.sfobject.FeatureType[] feature) {
        this.feature = feature;
    }

    public com.successfactors.sfapi.sfobject.FeatureType getFeature(int i) {
        return this.feature[i];
    }

    public void setFeature(int i, com.successfactors.sfapi.sfobject.FeatureType _value) {
        this.feature[i] = _value;
    }


    /**
     * Gets the error value for this DescribeExResult.
     * 
     * @return error
     */
    public com.successfactors.sfapi.sfobject.Error[] getError() {
        return error;
    }


    /**
     * Sets the error value for this DescribeExResult.
     * 
     * @param error
     */
    public void setError(com.successfactors.sfapi.sfobject.Error[] error) {
        this.error = error;
    }

    public com.successfactors.sfapi.sfobject.Error getError(int i) {
        return this.error[i];
    }

    public void setError(int i, com.successfactors.sfapi.sfobject.Error _value) {
        this.error[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeExResult)) return false;
        DescribeExResult other = (DescribeExResult) obj;
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
            ((this.entityInfo==null && other.getEntityInfo()==null) || 
             (this.entityInfo!=null &&
              this.entityInfo.equals(other.getEntityInfo()))) &&
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              java.util.Arrays.equals(this.field, other.getField()))) &&
            ((this.feature==null && other.getFeature()==null) || 
             (this.feature!=null &&
              java.util.Arrays.equals(this.feature, other.getFeature()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              java.util.Arrays.equals(this.error, other.getError())));
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
        if (getEntityInfo() != null) {
            _hashCode += getEntityInfo().hashCode();
        }
        if (getField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeature(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getError(), i);
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
        new org.apache.axis.description.TypeDesc(DescribeExResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "DescribeExResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "entityInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "EntityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "FieldEx"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "feature"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "featureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "Error"));
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
