package com.creativeprobers.service;

import java.rmi.RemoteException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

import com.successfactors.sfapi.server.SFAPI;
import com.successfactors.sfapi.sfobject.ObjectEditResult;
import com.successfactors.sfapi.sfobject.SFObject;

public class DeleteResult {
	
	private static Logger logger = Logger.getLogger(DeleteResult.class);	
	public static void main(String[] args) {
		//String[] Ids={"PEM-11148","PEM-11147","PEM-11146","PEM-11145"};
		//deletePerEmail(Ids);
	}
	
	public ArrayList<String> deletePerEmail(ArrayList<String> Ids) {
		ArrayList<String> arrayList = new ArrayList<String>();		
		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = false;
		try {
			isValidLogin = stub.isValidSession();
		} catch (RemoteException e1) {
		
			e1.printStackTrace();
		}
		if (isValidLogin) {
			try {			
				SFObject[] sfobjects = new SFObject[Ids.size()];
				for(int i=0;i<Ids.size();i++)
				{
					SFObject user = new SFObject();
					user.setType("PerEmail");
					user.setId(Ids.get(i));				
					sfobjects[i] = user;
				}
									
				com.successfactors.sfapi.sfobject.DeleteResult result = stub.delete("PerEmail", sfobjects, null);
					logger.info("JobStatus : " + result.getJobStatus());
					logger.info("Message   : " + result.getMessage());
					for (ObjectEditResult objectEditResult : result.getObjectEditResult()) 
					{ 
						logger.info("index : " + objectEditResult.getIndex());
						logger.info("Id : " + objectEditResult.getId());
						logger.info("EditStatus  : " + objectEditResult.getEditStatus());
						logger.info("ErrorStatus : " + objectEditResult.getErrorStatus()); 
					} 
				
				//String srObjectarr = qResult.getJobStatus();				
				
			}catch(Exception e){
				e.printStackTrace();
			}
		} 
			LogoutOfSF logSF = new LogoutOfSF();
			logSF.logout(stub);
		
		return arrayList;
	}

}
