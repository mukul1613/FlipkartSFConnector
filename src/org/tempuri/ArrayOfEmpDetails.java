/**
 * ArrayOfEmpDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ArrayOfEmpDetails  implements java.io.Serializable {
    private org.tempuri.EmpDetails[] empDetails;

    public ArrayOfEmpDetails() {
    }

    public ArrayOfEmpDetails(
           org.tempuri.EmpDetails[] empDetails) {
           this.empDetails = empDetails;
    }


    /**
     * Gets the empDetails value for this ArrayOfEmpDetails.
     * 
     * @return empDetails
     */
    public org.tempuri.EmpDetails[] getEmpDetails() {
        return empDetails;
    }


    /**
     * Sets the empDetails value for this ArrayOfEmpDetails.
     * 
     * @param empDetails
     */
    public void setEmpDetails(org.tempuri.EmpDetails[] empDetails) {
        this.empDetails = empDetails;
    }

    public org.tempuri.EmpDetails getEmpDetails(int i) {
        return this.empDetails[i];
    }

    public void setEmpDetails(int i, org.tempuri.EmpDetails _value) {
        this.empDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfEmpDetails)) return false;
        ArrayOfEmpDetails other = (ArrayOfEmpDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.empDetails==null && other.getEmpDetails()==null) || 
             (this.empDetails!=null &&
              java.util.Arrays.equals(this.empDetails, other.getEmpDetails())));
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
        if (getEmpDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpDetails(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfEmpDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfEmpDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EmpDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "EmpDetails"));
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
