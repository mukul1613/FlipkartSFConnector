/**
 * FormulaHR_HRISLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class FormulaHR_HRISLocator extends org.apache.axis.client.Service implements org.tempuri.FormulaHR_HRIS {

    public FormulaHR_HRISLocator() {
    }


    public FormulaHR_HRISLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FormulaHR_HRISLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FormulaHR_HRISSoap
    private java.lang.String FormulaHR_HRISSoap_address = "http://sboxflipkart.formulahr.com/Services/FormulaHR_HRIS.asmx";

    public java.lang.String getFormulaHR_HRISSoapAddress() {
        return FormulaHR_HRISSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FormulaHR_HRISSoapWSDDServiceName = "FormulaHR_HRISSoap";

    public java.lang.String getFormulaHR_HRISSoapWSDDServiceName() {
        return FormulaHR_HRISSoapWSDDServiceName;
    }

    public void setFormulaHR_HRISSoapWSDDServiceName(java.lang.String name) {
        FormulaHR_HRISSoapWSDDServiceName = name;
    }

    public org.tempuri.FormulaHR_HRISSoap getFormulaHR_HRISSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FormulaHR_HRISSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFormulaHR_HRISSoap(endpoint);
    }

    public org.tempuri.FormulaHR_HRISSoap getFormulaHR_HRISSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.FormulaHR_HRISSoapStub _stub = new org.tempuri.FormulaHR_HRISSoapStub(portAddress, this);
            _stub.setPortName(getFormulaHR_HRISSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFormulaHR_HRISSoapEndpointAddress(java.lang.String address) {
        FormulaHR_HRISSoap_address = address;
    }


    // Use to get a proxy class for FormulaHR_HRISSoap12
    private java.lang.String FormulaHR_HRISSoap12_address = "http://sboxflipkart.formulahr.com/Services/FormulaHR_HRIS.asmx";

    public java.lang.String getFormulaHR_HRISSoap12Address() {
        return FormulaHR_HRISSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FormulaHR_HRISSoap12WSDDServiceName = "FormulaHR_HRISSoap12";

    public java.lang.String getFormulaHR_HRISSoap12WSDDServiceName() {
        return FormulaHR_HRISSoap12WSDDServiceName;
    }

    public void setFormulaHR_HRISSoap12WSDDServiceName(java.lang.String name) {
        FormulaHR_HRISSoap12WSDDServiceName = name;
    }

    public org.tempuri.FormulaHR_HRISSoap getFormulaHR_HRISSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FormulaHR_HRISSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFormulaHR_HRISSoap12(endpoint);
    }

    public org.tempuri.FormulaHR_HRISSoap getFormulaHR_HRISSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.FormulaHR_HRISSoap12Stub _stub = new org.tempuri.FormulaHR_HRISSoap12Stub(portAddress, this);
            _stub.setPortName(getFormulaHR_HRISSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFormulaHR_HRISSoap12EndpointAddress(java.lang.String address) {
        FormulaHR_HRISSoap12_address = address;
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
            if (org.tempuri.FormulaHR_HRISSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.FormulaHR_HRISSoapStub _stub = new org.tempuri.FormulaHR_HRISSoapStub(new java.net.URL(FormulaHR_HRISSoap_address), this);
                _stub.setPortName(getFormulaHR_HRISSoapWSDDServiceName());
                return _stub;
            }
            if (org.tempuri.FormulaHR_HRISSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.FormulaHR_HRISSoap12Stub _stub = new org.tempuri.FormulaHR_HRISSoap12Stub(new java.net.URL(FormulaHR_HRISSoap12_address), this);
                _stub.setPortName(getFormulaHR_HRISSoap12WSDDServiceName());
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
        if ("FormulaHR_HRISSoap".equals(inputPortName)) {
            return getFormulaHR_HRISSoap();
        }
        else if ("FormulaHR_HRISSoap12".equals(inputPortName)) {
            return getFormulaHR_HRISSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "FormulaHR_HRIS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "FormulaHR_HRISSoap"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "FormulaHR_HRISSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FormulaHR_HRISSoap".equals(portName)) {
            setFormulaHR_HRISSoapEndpointAddress(address);
        }
        else 
if ("FormulaHR_HRISSoap12".equals(portName)) {
            setFormulaHR_HRISSoap12EndpointAddress(address);
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
