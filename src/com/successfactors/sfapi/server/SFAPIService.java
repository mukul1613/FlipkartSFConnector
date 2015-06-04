/**
 * SFAPIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.server;

public interface SFAPIService extends javax.xml.rpc.Service {
    public java.lang.String getSFAPIAddress();

    public com.successfactors.sfapi.server.SFAPI getSFAPI() throws javax.xml.rpc.ServiceException;

    public com.successfactors.sfapi.server.SFAPI getSFAPI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
