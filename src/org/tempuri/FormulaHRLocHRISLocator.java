/**
 * FormulaHRLocHRISLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class FormulaHRLocHRISLocator extends org.apache.axis.client.Service implements org.tempuri.FormulaHRLocHRIS {

    public FormulaHRLocHRISLocator() {
    }


    public FormulaHRLocHRISLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FormulaHRLocHRISLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FormulaHRLocHRISSoap12
    private java.lang.String FormulaHRLocHRISSoap12_address = "https://wsr.formulahr.com/services/FormulaHRLocHRIS.asmx";

    public java.lang.String getFormulaHRLocHRISSoap12Address() {
        return FormulaHRLocHRISSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FormulaHRLocHRISSoap12WSDDServiceName = "FormulaHRLocHRISSoap12";

    public java.lang.String getFormulaHRLocHRISSoap12WSDDServiceName() {
        return FormulaHRLocHRISSoap12WSDDServiceName;
    }

    public void setFormulaHRLocHRISSoap12WSDDServiceName(java.lang.String name) {
        FormulaHRLocHRISSoap12WSDDServiceName = name;
    }

    public org.tempuri.FormulaHRLocHRISSoap getFormulaHRLocHRISSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FormulaHRLocHRISSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFormulaHRLocHRISSoap12(endpoint);
    }

    public org.tempuri.FormulaHRLocHRISSoap getFormulaHRLocHRISSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.FormulaHRLocHRISSoap12Stub _stub = new org.tempuri.FormulaHRLocHRISSoap12Stub(portAddress, this);
            _stub.setPortName(getFormulaHRLocHRISSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFormulaHRLocHRISSoap12EndpointAddress(java.lang.String address) {
        FormulaHRLocHRISSoap12_address = address;
    }


    // Use to get a proxy class for FormulaHRLocHRISSoap
    private java.lang.String FormulaHRLocHRISSoap_address = "https://wsr.formulahr.com/services/FormulaHRLocHRIS.asmx";

    public java.lang.String getFormulaHRLocHRISSoapAddress() {
        return FormulaHRLocHRISSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FormulaHRLocHRISSoapWSDDServiceName = "FormulaHRLocHRISSoap";

    public java.lang.String getFormulaHRLocHRISSoapWSDDServiceName() {
        return FormulaHRLocHRISSoapWSDDServiceName;
    }

    public void setFormulaHRLocHRISSoapWSDDServiceName(java.lang.String name) {
        FormulaHRLocHRISSoapWSDDServiceName = name;
    }

    public org.tempuri.FormulaHRLocHRISSoap getFormulaHRLocHRISSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FormulaHRLocHRISSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFormulaHRLocHRISSoap(endpoint);
    }

    public org.tempuri.FormulaHRLocHRISSoap getFormulaHRLocHRISSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.FormulaHRLocHRISSoapStub _stub = new org.tempuri.FormulaHRLocHRISSoapStub(portAddress, this);
            _stub.setPortName(getFormulaHRLocHRISSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFormulaHRLocHRISSoapEndpointAddress(java.lang.String address) {
        FormulaHRLocHRISSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.FormulaHRLocHRISSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.FormulaHRLocHRISSoap12Stub _stub = new org.tempuri.FormulaHRLocHRISSoap12Stub(new java.net.URL(FormulaHRLocHRISSoap12_address), this);
                _stub.setPortName(getFormulaHRLocHRISSoap12WSDDServiceName());
                return _stub;
            }
            if (org.tempuri.FormulaHRLocHRISSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.FormulaHRLocHRISSoapStub _stub = new org.tempuri.FormulaHRLocHRISSoapStub(new java.net.URL(FormulaHRLocHRISSoap_address), this);
                _stub.setPortName(getFormulaHRLocHRISSoapWSDDServiceName());
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
        if ("FormulaHRLocHRISSoap12".equals(inputPortName)) {
            return getFormulaHRLocHRISSoap12();
        }
        else if ("FormulaHRLocHRISSoap".equals(inputPortName)) {
            return getFormulaHRLocHRISSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "FormulaHRLocHRIS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "FormulaHRLocHRISSoap12"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "FormulaHRLocHRISSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FormulaHRLocHRISSoap12".equals(portName)) {
            setFormulaHRLocHRISSoap12EndpointAddress(address);
        }
        else 
if ("FormulaHRLocHRISSoap".equals(portName)) {
            setFormulaHRLocHRISSoapEndpointAddress(address);
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
