/**
 * SFAPIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.server;

public class SFAPIServiceLocator extends org.apache.axis.client.Service implements com.successfactors.sfapi.server.SFAPIService {

    public SFAPIServiceLocator() {
    }


    public SFAPIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SFAPIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SFAPI
    private java.lang.String SFAPI_address = "https://api10.successfactors.com:443/sfapi/v1/soap";

    public java.lang.String getSFAPIAddress() {
        return SFAPI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SFAPIWSDDServiceName = "SFAPI";

    public java.lang.String getSFAPIWSDDServiceName() {
        return SFAPIWSDDServiceName;
    }

    public void setSFAPIWSDDServiceName(java.lang.String name) {
        SFAPIWSDDServiceName = name;
    }

    public com.successfactors.sfapi.server.SFAPI getSFAPI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SFAPI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSFAPI(endpoint);
    }

    public com.successfactors.sfapi.server.SFAPI getSFAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.successfactors.sfapi.server.SFAPISoapBindingStub _stub = new com.successfactors.sfapi.server.SFAPISoapBindingStub(portAddress, this);
            _stub.setPortName(getSFAPIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSFAPIEndpointAddress(java.lang.String address) {
        SFAPI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.successfactors.sfapi.server.SFAPI.class.isAssignableFrom(serviceEndpointInterface)) {
                com.successfactors.sfapi.server.SFAPISoapBindingStub _stub = new com.successfactors.sfapi.server.SFAPISoapBindingStub(new java.net.URL(SFAPI_address), this);
                _stub.setPortName(getSFAPIWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SFAPI".equals(inputPortName)) {
            return getSFAPI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:server.sfapi.successfactors.com", "SFAPIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:server.sfapi.successfactors.com", "SFAPI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SFAPI".equals(portName)) {
            setSFAPIEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
