package com.creativeprobers.service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.Text;
import org.apache.log4j.Logger;
import com.creativeprobers.service.*;

import com.creativeprobers.util.SFConstants;
import com.successfactors.sfapi.fault.SFWebServiceFaultException;
import com.successfactors.sfapi.server.SFAPI;

import com.successfactors.sfapi.sfobject.SFObject;
import com.successfactors.sfapi.sfobject.SFParameter;

public class QueryResult {

	private static Logger logger = Logger
			.getLogger(QueryResult.class);
	private static SFParameter[] paramList = null;
	private static final String MAX_ROWS = "maxRows";
	private static String bulkEmpDetailsMapQuery = "SELECT id from PerEmail";
	private HashMap<String, PerEmail> empDetailsMapList = new HashMap<String, PerEmail>();
	
	private void setEmpDetailsMapList() throws SFWebServiceFaultException, RemoteException {
		DeleteResult deleteResult = new DeleteResult();
		PerEmail perEmail=new PerEmail();
		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = stub.isValidSession();
		ArrayList<String> perEmailIdList= new ArrayList<String>();
		if (isValidLogin) {
			String newbaseQueryString = null;
			newbaseQueryString = bulkEmpDetailsMapQuery;
			logger.info(newbaseQueryString);			
			paramList = new SFParameter[1];
			SFParameter param = new SFParameter();
			param.setValue(SFConstants.PAGE_SIZE);
			param.setName(MAX_ROWS);
			paramList[0] = param;
			com.successfactors.sfapi.sfobject.QueryResult qResult = stub.query(newbaseQueryString, paramList);
			
			SFObject[] srObjectarr = qResult.getSfobject();
			if (srObjectarr != null) {
				logger.info("NumberResult" + qResult.getNumResults());				
				for (int i = 0; i < srObjectarr.length; i++) {
					String id = srObjectarr[i].getId();
					//System.out.println("Id Removed:: "+id);
					/*perEmail = getQueryResultForEmpDetailsMap(
							srObjectarr, i);*/
					//empDetailsMapList.put(perEmail.getId(), perEmail);
					perEmailIdList.add(id);					
				}
				/*
				 * Call delete method
				 */
				
				deleteResult.deletePerEmail(perEmailIdList);				
				logger.info("perEmailIdList ::"+perEmailIdList.size());
				//logger.info("empDetailsMapList::"+empDetailsMapList.size());
			}else{
				System.out.println("NO database found !!!");
			}
			
	}
	
	}	
	public static void main(String[] args) throws SFWebServiceFaultException, RemoteException {
		QueryResult queryResult=new QueryResult();
		queryResult.setEmpDetailsMapList();
	}
}
