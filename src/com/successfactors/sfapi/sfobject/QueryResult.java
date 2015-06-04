/**
 * QueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.sfobject;

public class QueryResult  implements java.io.Serializable {
    private com.successfactors.sfapi.sfobject.SFObject[] sfobject;

    private int numResults;

    private boolean hasMore;

    private java.lang.String querySessionId;

    public QueryResult() {
    }

    public QueryResult(
           com.successfactors.sfapi.sfobject.SFObject[] sfobject,
           int numResults,
           boolean hasMore,
           java.lang.String querySessionId) {
           this.sfobject = sfobject;
           this.numResults = numResults;
           this.hasMore = hasMore;
           this.querySessionId = querySessionId;
    }


    /**
     * Gets the sfobject value for this QueryResult.
     * 
     * @return sfobject
     */
    public com.successfactors.sfapi.sfobject.SFObject[] getSfobject() {
        return sfobject;
    }


    /**
     * Sets the sfobject value for this QueryResult.
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
     * Gets the numResults value for this QueryResult.
     * 
     * @return numResults
     */
    public int getNumResults() {
        return numResults;
    }


    /**
     * Sets the numResults value for this QueryResult.
     * 
     * @param numResults
     */
    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }


    /**
     * Gets the hasMore value for this QueryResult.
     * 
     * @return hasMore
     */
    public boolean isHasMore() {
        return hasMore;
    }


    /**
     * Sets the hasMore value for this QueryResult.
     * 
     * @param hasMore
     */
    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }


    /**
     * Gets the querySessionId value for this QueryResult.
     * 
     * @return querySessionId
     */
    public java.lang.String getQuerySessionId() {
        return querySessionId;
    }


    /**
     * Sets the querySessionId value for this QueryResult.
     * 
     * @param querySessionId
     */
    public void setQuerySessionId(java.lang.String querySessionId) {
        this.querySessionId = querySessionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryResult)) return false;
        QueryResult other = (QueryResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sfobject==null && other.getSfobject()==null) || 
             (this.sfobject!=null &&
              java.util.Arrays.equals(this.sfobject, other.getSfobject()))) &&
            this.numResults == other.getNumResults() &&
            this.hasMore == other.isHasMore() &&
            ((this.querySessionId==null && other.getQuerySessionId()==null) || 
             (this.querySessionId!=null &&
              this.querySessionId.equals(other.getQuerySessionId())));
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
        _hashCode += getNumResults();
        _hashCode += (isHasMore() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getQuerySessionId() != null) {
            _hashCode += getQuerySessionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "QueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sfobject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "sfobject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numResults");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "numResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasMore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "hasMore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "querySessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
