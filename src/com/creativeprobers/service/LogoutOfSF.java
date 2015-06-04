package com.creativeprobers.service;

import java.rmi.RemoteException;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;

import com.successfactors.sfapi.fault.SFWebServiceFaultException;
import com.successfactors.sfapi.server.SFAPI;
import com.successfactors.sfapi.server.SFAPIProxy;
import com.successfactors.sfapi.server.SFAPIService;
import com.successfactors.sfapi.server.SFAPIServiceLocator;
import com.successfactors.sfapi.server.SFAPISoapBindingStub;
import com.successfactors.sfapi.sfobject.LoginResult;
import com.successfactors.sfapi.sfobject.SFCredential;

public class LogoutOfSF {
	static Logger Log = Logger.getLogger(LogoutOfSF.class);
	public void logout(SFAPI stub){

		try {
			stub.logout();
			Log.info("logged out....");
		} catch (SFWebServiceFaultException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
