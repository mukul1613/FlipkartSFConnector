package com.creativeprobers.service;

import java.rmi.RemoteException;
import java.util.Properties;

import javax.xml.rpc.ServiceException;
import org.apache.log4j.Logger;

import com.creativeprobers.util.SFConstants;
import com.successfactors.sfapi.fault.SFWebServiceFaultException;
import com.successfactors.sfapi.server.SFAPI;
import com.successfactors.sfapi.server.SFAPIServiceLocator;
import com.successfactors.sfapi.sfobject.LoginResult;
import com.successfactors.sfapi.sfobject.SFCredential;

public class LoginToSF {
	static Logger Log = Logger.getLogger(LoginToSF.class);
	private LoginResult result=null;
	
	public SFAPI getProxy(){
		//LoginToSF lsf = new LoginToSF();
		//String endpointURL="https://api8.successfactors.com:443/sfapi/v1/soap";		
		SFAPIServiceLocator sfloc = new SFAPIServiceLocator();
		SFAPI stub = null;
		
		try {
			sfloc.setSFAPIEndpointAddress(SFConstants.ENDPOINT_URL);
			Properties systemProperties = System.getProperties();
			systemProperties.setProperty("https.proxyHost",
					SFConstants.PROXY_HOST);
			systemProperties.setProperty("https.proxyPort",
					SFConstants.PROXY_PORT);
			Log.info("proxyHost: "+SFConstants.PROXY_HOST);
			Log.info("proxyPort: "+SFConstants.PROXY_PORT);
			
			SFCredential credential = new SFCredential(SFConstants.COMPANY_ID, SFConstants.ADMIN_USER_NAME, SFConstants.ADMIN_PASSWORD, null);
			stub = sfloc.getSFAPI();
			sfloc.setMaintainSession(true);
		/*	Map<String, Object> requestContext = (sfloc.setM).getRequestContext();
			// Need to set the property to maintain the http session.
			requestContext.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);
		*/	
			result = stub.login(credential, null);
			
			//Log.info(result.getSessionId());
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SFWebServiceFaultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stub;	
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LoginToSF lsf = new LoginToSF();
		String endpointURL=SFConstants.ENDPOINT_URL;		
		SFAPIServiceLocator sfloc = new SFAPIServiceLocator();
		try {
		Properties systemProperties = System.getProperties();
		systemProperties.setProperty("https.proxyHost",
				SFConstants.PROXY_HOST);
		systemProperties.setProperty("https.proxyPort",
				SFConstants.PROXY_PORT);
		Log.info("proxyHost: "+SFConstants.PROXY_HOST);
		Log.info("proxyPort: "+SFConstants.PROXY_PORT);
		
		SFCredential credential = new SFCredential(SFConstants.COMPANY_ID, SFConstants.ADMIN_USER_NAME, SFConstants.ADMIN_PASSWORD, null);
	/*	credential.setCompanyId("C0017935023T1");
		credential.setUsername("PSADMIN");
		credential.setPassword("PSADMIN");*/
		//SFConstants.COMPANY_ID, SFConstants.ADMIN_USER_NAME, SFConstants.ADMIN_PASSWORD, null);
		SFAPI stub = sfloc.getSFAPI();
		
		sfloc.setMaintainSession(true);
		LoginResult result = stub.login(credential, null);
		//Log.info("result: "+result);
		Log.info(result.getSessionId());
		
	/*
			SFCredential credential = new SFCredential(SFConstants.COMPANY_ID, SFConstants.ADMIN_USER_NAME, SFConstants.ADMIN_PASSWORD, null);
			
			SFAPI stub = sfloc.getSFAPI();
			LoginResult result = stub.login(credential, null);
			Log.info(result.getSessionId());*/
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SFWebServiceFaultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}
