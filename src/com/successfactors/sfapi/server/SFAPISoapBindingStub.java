/**
 * SFAPISoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.server;

public class SFAPISoapBindingStub extends org.apache.axis.client.Stub implements com.successfactors.sfapi.server.SFAPI {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[18];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "credential"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFCredential"), com.successfactors.sfapi.sfobject.SFCredential.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"), com.successfactors.sfapi.sfobject.SFParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "LoginResult"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.LoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isValidSession");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describe");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"), com.successfactors.sfapi.sfobject.SFParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "DescribeResult"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.DescribeResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"), com.successfactors.sfapi.sfobject.SFParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "DescribeExResult"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.DescribeExResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("list");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "name"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"), com.successfactors.sfapi.sfobject.SFParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "QueryResult"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryMore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "querySessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "QueryResult"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "sfobject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFObject"), com.successfactors.sfapi.sfobject.SFObject[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "processingParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"), com.successfactors.sfapi.sfobject.SFParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "InsertResult"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.InsertResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "sfobject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFObject"), com.successfactors.sfapi.sfobject.SFObject[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "processingParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"), com.successfactors.sfapi.sfobject.SFParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "UpdateResult"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.UpdateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "sfobject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFObject"), com.successfactors.sfapi.sfobject.SFObject[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "processingParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"), com.successfactors.sfapi.sfobject.SFParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "UpsertResult"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.UpsertResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "sfobject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFObject"), com.successfactors.sfapi.sfobject.SFObject[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "processingParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"), com.successfactors.sfapi.sfobject.SFParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "DeleteResult"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.DeleteResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitQueryJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "param"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter"), com.successfactors.sfapi.sfobject.SFParameter[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatus"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.TaskStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJobResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "taskId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "octet-stream"), org.apache.axis.attachments.OctetStream.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "format"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "octet-stream"), org.apache.axis.attachments.OctetStream.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "octet-stream"));
        oper.setReturnClass(org.apache.axis.attachments.OctetStream.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "getJobResultResponse"));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJobResultEmbedded");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "taskId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "getJobResultEmbeddedResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getJobStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "taskId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatus"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.TaskStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listJobs");
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatus"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.TaskStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "taskId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatus"));
        oper.setReturnClass(com.successfactors.sfapi.sfobject.TaskStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFault"),
                      "com.successfactors.sfapi.fault.SFWebServiceFaultException",
                      new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException"), 
                      true
                     ));
        _operations[17] = oper;

    }

    public SFAPISoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SFAPISoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SFAPISoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            java.lang.Class mimesf = org.apache.axis.encoding.ser.JAFDataHandlerSerializerFactory.class;
            java.lang.Class mimedf = org.apache.axis.encoding.ser.JAFDataHandlerDeserializerFactory.class;

            qName = new javax.xml.namespace.QName("urn:server.sfapi.successfactors.com", "DataHandler");
            cachedSerQNames.add(qName);
            cls = javax.activation.DataHandler.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(mimesf);
            cachedDeserFactories.add(mimedf);

            qName = new javax.xml.namespace.QName("urn:fault.sfapi.successfactors.com", "SFWebServiceFaultException");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.fault.SFWebServiceFaultException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">cancelJob");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.CancelJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">cancelJobResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.CancelJobResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">delete");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Delete.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">deleteResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.DeleteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">describeSFObjects");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.DescribeSFObjects.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">describeSFObjectsEx");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.DescribeSFObjectsEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">describeSFObjectsExResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.DescribeExResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "DescribeExResult");
            qName2 = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">describeSFObjectsResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.DescribeResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "DescribeResult");
            qName2 = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">getJobResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.GetJobResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">getJobResultEmbedded");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.GetJobResultEmbedded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">getJobResultMTOMRQ");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.GetJobResultMTOMRQ.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">getJobResultMTOMRS");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.GetJobResultMTOMRS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">getJobStatus");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.GetJobStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">getJobStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.GetJobStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">insert");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Insert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">insertResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.InsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">isValidSession");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.IsValidSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">isValidSessionResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.IsValidSessionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">listJobs");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.ListJobs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">listJobsResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.TaskStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatus");
            qName2 = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">listSFObjects");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.ListSFObjects.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">listSFObjectsResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "name");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">login");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">loginResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">logout");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Logout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">logoutResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">query");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">queryMore");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.QueryMore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">queryMoreResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.QueryMoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">queryResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.QueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">submitQueryJob");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.SubmitQueryJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">submitQueryJobResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.SubmitQueryJobResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">update");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Update.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">updateResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.UpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">upsert");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Upsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", ">upsertResponse");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.UpsertResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "BusinessKeys");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.BusinessKeys.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "dataType");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.DataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "DeleteResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.DeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "DescribeExResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.DescribeExResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "DescribeResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.DescribeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "EntityInfo");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.EntityInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "Error");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "featureType");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.FeatureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "Field");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Field.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "FieldEx");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.FieldEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "InsertResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.InsertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "Label");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Label.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "LoginResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.LoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "ObjectEditResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.ObjectEditResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "Picklist");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.Picklist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "PicklistOption");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.PicklistOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "QueryResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.QueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFCredential");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.SFCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFObject");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.SFObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "SFParameter");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.SFParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskResultStatus");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.TaskResultStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskResultStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.TaskResultStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatus");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.TaskStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "TaskStatusEnum");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.TaskStatusEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "UpdateResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.UpdateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "UpsertResult");
            cachedSerQNames.add(qName);
            cls = com.successfactors.sfapi.sfobject.UpsertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.successfactors.sfapi.sfobject.LoginResult login(com.successfactors.sfapi.sfobject.SFCredential credential, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credential, param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.LoginResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.LoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.LoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isValidSession() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "isValidSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.DescribeResult[] describe(java.lang.String[] type, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "describeSFObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.DescribeResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.DescribeResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.DescribeResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.DescribeExResult[] describeEx(java.lang.String[] type, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "describeSFObjectsEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.DescribeExResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.DescribeExResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.DescribeExResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean logout() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] list() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "listSFObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.QueryResult query(java.lang.String queryString, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString, param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.QueryResult queryMore(java.lang.String querySessionId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "queryMore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {querySessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.InsertResult insert(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "insert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, sfobject, processingParam});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.InsertResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.InsertResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.InsertResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.UpdateResult update(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, sfobject, processingParam});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.UpdateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.UpdateResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.UpdateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.UpsertResult upsert(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "upsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, sfobject, processingParam});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.UpsertResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.UpsertResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.UpsertResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.DeleteResult delete(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {type, sfobject, processingParam});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.DeleteResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.DeleteResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.DeleteResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.TaskStatus submitQueryJob(java.lang.String queryString, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "submitQueryJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString, param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.TaskStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.TaskStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.TaskStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.apache.axis.attachments.OctetStream getJobResult(org.apache.axis.attachments.OctetStream taskId, org.apache.axis.attachments.OctetStream format) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "getJobResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskId, format});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.apache.axis.attachments.OctetStream) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.attachments.OctetStream) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] getJobResultEmbedded(java.lang.String taskId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "getJobResultEmbedded"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.TaskStatus getJobStatus(java.lang.String taskId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "getJobStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.TaskStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.TaskStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.TaskStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.TaskStatus[] listJobs() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "listJobs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.TaskStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.TaskStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.TaskStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.successfactors.sfapi.sfobject.TaskStatus cancelJob(java.lang.String taskId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:sfobject.sfapi.successfactors.com", "cancelJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.successfactors.sfapi.sfobject.TaskStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.successfactors.sfapi.sfobject.TaskStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.successfactors.sfapi.sfobject.TaskStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.successfactors.sfapi.fault.SFWebServiceFaultException) {
              throw (com.successfactors.sfapi.fault.SFWebServiceFaultException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
