package com.successfactors.sfapi.server;

public class SFAPIProxy implements com.successfactors.sfapi.server.SFAPI {
  private String _endpoint = null;
  private com.successfactors.sfapi.server.SFAPI sFAPI = null;
  
  public SFAPIProxy() {
    _initSFAPIProxy();
  }
  
  public SFAPIProxy(String endpoint) {
    _endpoint = endpoint;
    _initSFAPIProxy();
  }
  
  private void _initSFAPIProxy() {
    try {
      sFAPI = (new com.successfactors.sfapi.server.SFAPIServiceLocator()).getSFAPI();
      if (sFAPI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sFAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sFAPI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sFAPI != null)
      ((javax.xml.rpc.Stub)sFAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.successfactors.sfapi.server.SFAPI getSFAPI() {
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI;
  }
  
  public com.successfactors.sfapi.sfobject.LoginResult login(com.successfactors.sfapi.sfobject.SFCredential credential, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.login(credential, param);
  }
  
  public boolean isValidSession() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.isValidSession();
  }
  
  public com.successfactors.sfapi.sfobject.DescribeResult[] describe(java.lang.String[] type, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.describe(type, param);
  }
  
  public com.successfactors.sfapi.sfobject.DescribeExResult[] describeEx(java.lang.String[] type, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.describeEx(type, param);
  }
  
  public boolean logout() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.logout();
  }
  
  public java.lang.String[] list() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.list();
  }
  
  public com.successfactors.sfapi.sfobject.QueryResult query(java.lang.String queryString, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.query(queryString, param);
  }
  
  public com.successfactors.sfapi.sfobject.QueryResult queryMore(java.lang.String querySessionId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.queryMore(querySessionId);
  }
  
  public com.successfactors.sfapi.sfobject.InsertResult insert(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.insert(type, sfobject, processingParam);
  }
  
  public com.successfactors.sfapi.sfobject.UpdateResult update(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.update(type, sfobject, processingParam);
  }
  
  public com.successfactors.sfapi.sfobject.UpsertResult upsert(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.upsert(type, sfobject, processingParam);
  }
  
  public com.successfactors.sfapi.sfobject.DeleteResult delete(java.lang.String type, com.successfactors.sfapi.sfobject.SFObject[] sfobject, com.successfactors.sfapi.sfobject.SFParameter[] processingParam) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.delete(type, sfobject, processingParam);
  }
  
  public com.successfactors.sfapi.sfobject.TaskStatus submitQueryJob(java.lang.String queryString, com.successfactors.sfapi.sfobject.SFParameter[] param) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.submitQueryJob(queryString, param);
  }
  
  public org.apache.axis.attachments.OctetStream getJobResult(org.apache.axis.attachments.OctetStream taskId, org.apache.axis.attachments.OctetStream format) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.getJobResult(taskId, format);
  }
  
  public byte[] getJobResultEmbedded(java.lang.String taskId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.getJobResultEmbedded(taskId);
  }
  
  public com.successfactors.sfapi.sfobject.TaskStatus getJobStatus(java.lang.String taskId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.getJobStatus(taskId);
  }
  
  public com.successfactors.sfapi.sfobject.TaskStatus[] listJobs() throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.listJobs();
  }
  
  public com.successfactors.sfapi.sfobject.TaskStatus cancelJob(java.lang.String taskId) throws java.rmi.RemoteException, com.successfactors.sfapi.fault.SFWebServiceFaultException{
    if (sFAPI == null)
      _initSFAPIProxy();
    return sFAPI.cancelJob(taskId);
  }
  
  
}