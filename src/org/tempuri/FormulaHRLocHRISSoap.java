/**
 * FormulaHRLocHRISSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface FormulaHRLocHRISSoap extends java.rmi.Remote {
    public org.tempuri.ArrayOfEmpLocDetails getBulkEmpDetails(java.lang.String APPID, java.lang.String empType) throws java.rmi.RemoteException;
    public org.tempuri.EmpLocDetails getEmpDetails(java.lang.String APPID, java.lang.String empid) throws java.rmi.RemoteException;
}
