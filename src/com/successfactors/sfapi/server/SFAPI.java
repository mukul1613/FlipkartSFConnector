/**
 * SFAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.successfactors.sfapi.server;

public interface SFAPI extends java.rmi.Remote {
    public com.successfactors.sfapi.sfobject.LoginResult login(com.successfactors.sfapi.sfobject.SFCredential credential, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public boolean isValidSession() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.DescribeResult[] describe(java.lang.String[] type, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.DescribeExResult[] describeEx(java.lang.String[] type, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public boolean logout() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public java.lang.String[] list() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.QueryResult query(java.lang.String queryString, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.QueryResult queryMore(java.lang.String querySessionId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.InsertResult insert(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.UpdateResult update(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.UpsertResult upsert(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.DeleteResult delete(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.TaskStatus submitQueryJob(java.lang.String queryString, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public org.apache.axis.attachments.OctetStream getJobResult(org.apache.axis.attachments.OctetStream taskId, org.apache.axis.attachments.OctetStream format) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public byte[] getJobResultEmbedded(java.lang.String taskId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.TaskStatus getJobStatus(java.lang.String taskId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.TaskStatus[] listJobs() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
    public com.successfactors.sfapi.sfobject.TaskStatus cancelJob(java.lang.String taskId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException;
}
