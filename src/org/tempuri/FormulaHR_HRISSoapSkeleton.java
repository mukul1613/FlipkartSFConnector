/**
 * FormulaHR_HRISSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class FormulaHR_HRISSoapSkeleton implements org.tempuri.FormulaHR_HRISSoap, org.apache.axis.wsdl.Skeleton {
    private org.tempuri.FormulaHR_HRISSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "APPID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("empAuthenticationCheck", _params, new javax.xml.namespace.QName("http://tempuri.org/", "EmpAuthenticationCheckResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "EmpAuthenticationDetail"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "EmpAuthenticationCheck"));
        _oper.setSoapAction("http://tempuri.org/EmpAuthenticationCheck");
        _myOperationsList.add(_oper);
        if (_myOperations.get("empAuthenticationCheck") == null) {
            _myOperations.put("empAuthenticationCheck", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("empAuthenticationCheck")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "APPID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "EmpType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getBulkEmpDetails", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetBulkEmpDetailsResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfEmpDetails"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBulkEmpDetails"));
        _oper.setSoapAction("http://tempuri.org/GetBulkEmpDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getBulkEmpDetails") == null) {
            _myOperations.put("getBulkEmpDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getBulkEmpDetails")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "APPID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Empid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getEmpDetails", _params, new javax.xml.namespace.QName("http://tempuri.org/", "GetEmpDetailsResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "EmpDetails"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetEmpDetails"));
        _oper.setSoapAction("http://tempuri.org/GetEmpDetails");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getEmpDetails") == null) {
            _myOperations.put("getEmpDetails", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getEmpDetails")).add(_oper);
    }

    public FormulaHR_HRISSoapSkeleton() {
        this.impl = new org.tempuri.FormulaHR_HRISSoapImpl();
    }

    public FormulaHR_HRISSoapSkeleton(org.tempuri.FormulaHR_HRISSoap impl) {
        this.impl = impl;
    }
    public org.tempuri.EmpAuthenticationDetail empAuthenticationCheck(java.lang.String APPID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException
    {
        org.tempuri.EmpAuthenticationDetail ret = impl.empAuthenticationCheck(APPID, username, password);
        return ret;
    }

    public org.tempuri.ArrayOfEmpDetails getBulkEmpDetails(java.lang.String APPID, java.lang.String empType) throws java.rmi.RemoteException
    {
        org.tempuri.ArrayOfEmpDetails ret = impl.getBulkEmpDetails(APPID, empType);
        return ret;
    }

    public org.tempuri.EmpDetails getEmpDetails(java.lang.String APPID, java.lang.String empid) throws java.rmi.RemoteException
    {
        org.tempuri.EmpDetails ret = impl.getEmpDetails(APPID, empid);
        return ret;
    }

}
