/**
 * FormulaHR_HRISSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface FormulaHR_HRISSoap extends java.rmi.Remote {
    public org.tempuri.EmpAuthenticationDetail empAuthenticationCheck(java.lang.String APPID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public org.tempuri.ArrayOfEmpDetails getBulkEmpDetails(java.lang.String APPID, java.lang.String empType) throws java.rmi.RemoteException;
    public org.tempuri.EmpDetails getEmpDetails(java.lang.String APPID, java.lang.String empid) throws java.rmi.RemoteException;
}
