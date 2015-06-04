/**
 * Field.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class Field  implements java.io.Serializable {
    private java.lang.String name;

    private com.successfactors.sfapi.sfobject.DataType dataType;

    private com.successfactors.sfapi.sfobject.Picklist picklist;

    private com.successfactors.sfapi.sfobject.Label[] label;

    private java.lang.Integer maxlength;

    private boolean required;

    public Field() {
    }

    public Field(
           java.lang.String name,
           com.successfactors.sfapi.sfobject.DataType dataType,
           com.successfactors.sfapi.sfobject.Picklist picklist,
           com.successfactors.sfapi.sfobject.Label[] label,
           java.lang.Integer maxlength,
           boolean required) {
           this.name = name;
           this.dataType = dataType;
           this.picklist = picklist;
           this.label = label;
           this.maxlength = maxlength;
           this.required = required;
    }


    /**
     * Gets the name value for this Field.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Field.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the dataType value for this Field.
     * 
     * @return dataType
     */
    public com.successfactors.sfapi.sfobject.DataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this Field.
     * 
     * @param dataType
     */
    public void setDataType(com.successfactors.sfapi.sfobject.DataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the picklist value for this Field.
     * 
     * @return picklist
     */
    public com.successfactors.sfapi.sfobject.Picklist getPicklist() {
        return picklist;
    }


    /**
     * Sets the picklist value for this Field.
     * 
     * @param picklist
     */
    public void setPicklist(com.successfactors.sfapi.sfobject.Picklist picklist) {
        this.picklist = picklist;
    }


    /**
     * Gets the label value for this Field.
     * 
     * @return label
     */
    public com.successfactors.sfapi.sfobject.Label[] getLabel() {
        return label;
    }


    /**
     * Sets the label value for this Field.
     * 
     * @param label
     */
    public void setLabel(com.successfactors.sfapi.sfobject.Label[] label) {
        this.label = label;
    }

    public com.successfactors.sfapi.sfobject.Label getLabel(int i) {
        return this.label[i];
    }

    public void setLabel(int i, com.successfactors.sfapi.sfobject.Label _value) {
        this.label[i] = _value;
    }


    /**
     * Gets the maxlength value for this Field.
     * 
     * @return maxlength
     */
    public java.lang.Integer getMaxlength() {
        return maxlength;
    }


    /**
     * Sets the maxlength value for this Field.
     * 
     * @param maxlength
     */
    public void setMaxlength(java.lang.Integer maxlength) {
        this.maxlength = maxlength;
    }


    /**
     * Gets the required value for this Field.
     * 
     * @return required
     */
    public boolean isRequired() {
        return required;
    }


    /**
     * Sets the required value for this Field.
     * 
     * @param required
     */
    public void setRequired(boolean required) {
        this.required = required;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Field)) return false;
        Field other = (Field) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.picklist==null && other.getPicklist()==null) || 
             (this.picklist!=null &&
              this.picklist.equals(other.getPicklist()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              java.util.Arrays.equals(this.label, other.getLabel()))) &&
            ((this.maxlength==null && other.getMaxlength()==null) || 
             (this.maxlength!=null &&
              this.maxlength.equals(other.getMaxlength()))) &&
            this.required == other.isRequired();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getPicklist() != null) {
            _hashCode += getPicklist().hashCode();
        }
        if (getLabel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxlength() != null) {
            _hashCode += getMaxlength().hashCode();
        }
        _hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Field.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "Field"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "dataType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklist");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "picklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "Picklist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "Label"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxlength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "maxlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
