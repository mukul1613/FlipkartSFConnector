/**
 * FormulaHR_HRISSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

import java.rmi.RemoteException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.Text;
import org.apache.log4j.Logger;

import com.creativeprobers.service.BulkEmpDetailsImpl;
import com.creativeprobers.service.LoginToSF;
import com.creativeprobers.service.LogoutOfSF;
import com.creativeprobers.util.SFConstants;
import com.creativeprobers.util.commonUtils;
import com.successfactors.sfapi.fault.SFWebServiceFaultException;
import com.successfactors.sfapi.server.SFAPI;
import com.successfactors.sfapi.sfobject.QueryResult;
import com.successfactors.sfapi.sfobject.SFObject;
import com.successfactors.sfapi.sfobject.SFParameter;

/**
 * @author Rajasekhar Reddy
 *
 */
public class FormulaHR_HRISSoapImpl implements org.tempuri.FormulaHR_HRISSoap {
	private static Logger logger = Logger
			.getLogger(FormulaHR_HRISSoapImpl.class);
	private static String baseQueryString = "SELECT status,firstName,lastName,externalId FROM User where externalId=";
	private static String empDetailsQueryString = "SELECT empId,firstName,mi,lastName,gender,dateOfBirth,email,addressLine1,addressLine2,cellPhone,hireDate,custom03,custom02,custom10,state,city,location,department,division,custom07,jobCode,title,payGrade,managerExternalId FROM User where externalId=";
	private static String getSkipLevelManagerDetails = "SELECT firstName,mi,lastName FROM User where externalId=";
	private static String getManagerDetails = "SELECT firstName,mi,lastName,managerExternalId FROM User where externalId=";
	private static String getPicklistDetails = "SELECT id,en_US FROM PicklistOption WHERE id =";
	private static SFParameter[] paramList = null;
	private static final String MAX_ROWS = "maxRows";

	public org.tempuri.EmpAuthenticationDetail empAuthenticationCheck(
			java.lang.String APPID, java.lang.String username,
			java.lang.String password) throws java.rmi.RemoteException {
		EmpAuthenticationDetail authenticationDetail = new EmpAuthenticationDetail();

		try {
			username = "'" + username + "'";
			ArrayList<String> arrayList = getEmployeeStatus(username);
			if (arrayList.size() == 0) {
				/*
				 * If not found in database
				 */
				authenticationDetail = new EmpAuthenticationDetail();
				authenticationDetail.setStatus(false);
				authenticationDetail.setErrorMsg(username
						+ " is not found in the database!");
				logger.info("Error::" + username + " "
						+ " is not found in the database!");
				return authenticationDetail;
			}
			String status = arrayList.get(0);
			String firstName = arrayList.get(1);
			String lastName = arrayList.get(2);
			String externalId = arrayList.get(3);
			logger.info(status);// status
			logger.info(firstName);// fn
			logger.info(lastName);// ln
			logger.info(externalId);// externalId

			if (status.equalsIgnoreCase("active")) {
				authenticationDetail.setStatus(true);
				authenticationDetail.setErrorMsg(username + " is Active!");
				logger.info(username + " is Active!");
			} else {
				authenticationDetail.setStatus(false);
				authenticationDetail.setErrorMsg(username + " is not Active!");
				logger.info(username + " is not Active!");
			}
		} catch (SFWebServiceFaultException e) {
			authenticationDetail = new EmpAuthenticationDetail();
			authenticationDetail.setStatus(false);
			authenticationDetail.setErrorMsg(username + " "
					+ "is not found in the database!");
		} catch (RemoteException e) {
			authenticationDetail = new EmpAuthenticationDetail();
			authenticationDetail.setStatus(false);
			authenticationDetail.setErrorMsg(username + " "
					+ "is not found in the database!");
		} catch (Exception e) {
			throw new RemoteException("Error!");
			/*
			 * authenticationDetail = new EmpAuthenticationDetail();
			 * authenticationDetail.setStatus(false);
			 * authenticationDetail.setErrorMsg(username +
			 * "is not found in the database!"); logger.info(username +
			 * "is not found in the database!");
			 */
		}
		return authenticationDetail;
	}

	private ArrayList<String> getEmployeeStatus(java.lang.String username)
			throws RemoteException, SFWebServiceFaultException {
		ArrayList<String> arrayList = new ArrayList<String>();
		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = stub.isValidSession();
		if (isValidLogin) {
			try {
				String newbaseQueryString = null;
				// logger.info("username::"+username);
				if (username != null)
					newbaseQueryString = baseQueryString + username;
				logger.info(newbaseQueryString);
				paramList = new SFParameter[1];
				SFParameter param = new SFParameter();
				param.setValue(SFConstants.PAGE_SIZE);
				param.setName(MAX_ROWS);
				paramList[0] = param;
				QueryResult qResult = stub.query(newbaseQueryString, paramList);
				SFObject[] srObjectarr = qResult.getSfobject();

				if (srObjectarr != null) {
					if (srObjectarr.length > 0) {
						arrayList = getQueryResult(srObjectarr, 0);
					}
				}

			} catch (SFWebServiceFaultException e) {
				throw new SFWebServiceFaultException();
			} catch (Exception e) {
				e.printStackTrace();
				throw new SFWebServiceFaultException();
			} finally {
				LogoutOfSF logSF = new LogoutOfSF();
				logSF.logout(stub);
			}

		} else {
			throw new RemoteException("Session is not valid!");
		}
		return arrayList;
	}

	private ArrayList<String> getQueryResult(SFObject[] srObjectarr, int i) {
		ArrayList<String> arrayList = new ArrayList<String>();
		while (i < srObjectarr.length) {

			logger.info("(Id:" + srObjectarr[i].getId() + ", Type:"
					+ srObjectarr[i].getType() + ")");

			MessageElement[] me = srObjectarr[i].get_any();
			for (int j = 0; j < me.length; j++) {
				try {

					String nodeString = me[j].getAsString();
					logger.info("Element " + me[j].getAsString());
					Iterator iter = me[j].getChildElements();

					while (iter.hasNext()) {
						Text object = (Text) iter.next();

						if (nodeString.contains("status")) {
							String status = object.getNodeValue();
							arrayList.add(status);
						}

						if (nodeString.contains("firstName")) {
							String firstName = object.getNodeValue();
							arrayList.add(firstName);
						}

						if (nodeString.contains("lastName")) {
							String lastName = object.getNodeValue();
							arrayList.add(lastName);
						}
						if (nodeString.contains("externalId")) {
							String externalId = object.getNodeValue();
							arrayList.add(externalId);
						}
					}

				} catch (Exception e) {

					e.printStackTrace();
				}

			}

			i++;
		}
		return arrayList;
	}

	public org.tempuri.ArrayOfEmpDetails getBulkEmpDetails(java.lang.String APPID,
			java.lang.String empType) throws java.rmi.RemoteException {
		BulkEmpDetailsImpl bulkEmpDetailsImpl = new BulkEmpDetailsImpl();
		EmpDetails[] empDetailsList = bulkEmpDetailsImpl
				.getBulkEmpDetails_from_csv("", empType);

		ArrayOfEmpDetails arrayOfEmpDetails = new ArrayOfEmpDetails();
		arrayOfEmpDetails.setEmpDetails(empDetailsList);
		return arrayOfEmpDetails;

	}

	public org.tempuri.EmpDetails getEmpDetails(java.lang.String APPID,
			java.lang.String empid) throws java.rmi.RemoteException {
		EmpDetails empDetails = new EmpDetails();
		try {
			logger.info("ENTER getEmpDetails");
			empid = "'" + empid + "'";
			empDetails = getEmployeeDetails(empid);
			logger.info("EXIT getEmpDetails");

		} catch (SFWebServiceFaultException sfe) {
			// This exception is expected for an invalid externalId

		} catch (RemoteException re) {
			// This exception is expected for an invalid externalId
		} catch (Exception e) {
			throw new RemoteException("Error!");
		}
		return empDetails;
	}

	private EmpDetails getEmployeeDetails(java.lang.String username)
			throws RemoteException, SFWebServiceFaultException {
		EmpDetails empDetails = new EmpDetails();
		HashMap<String, String> arrayList = new HashMap<String, String>();
		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = stub.isValidSession();
		if (isValidLogin) {
			try {
				String newbaseQueryString = null;
				// logger.info("username::"+username);
				if (username != null)
					newbaseQueryString = empDetailsQueryString + username;
				logger.info(newbaseQueryString);
				paramList = new SFParameter[1];
				SFParameter param = new SFParameter();
				// Set query page size to retrieve 10 records per page
				// param.setName("maxRows");
				param.setValue(SFConstants.PAGE_SIZE);
				param.setName(MAX_ROWS);
				paramList[0] = param;
				// logger.info("paramList: :" + paramList);
				QueryResult qResult = stub.query(newbaseQueryString, paramList);
				logger.debug("qResult:" + qResult);
				logger.debug(qResult.getSfobject().length);
				SFObject[] srObjectarr = qResult.getSfobject();
				if (srObjectarr != null) {
					if (srObjectarr.length > 0) {
						empDetails = getQueryResultForEmpDetails(srObjectarr, 0);
						System.out.println("empDetails::" + empDetails);
					}
				} else {
					logger.info("Nofound in the Database!!!");

				}

			} catch (SFWebServiceFaultException e) {
				throw new SFWebServiceFaultException();
			} catch (Exception e) {
				e.printStackTrace();
				throw new SFWebServiceFaultException();
			} finally {
				LogoutOfSF logSF = new LogoutOfSF();
				logSF.logout(stub);
			}

		} else {
			throw new RemoteException("Session is not valid!");
		}
		return empDetails;
	}

	private EmpDetails getManagerDetails(java.lang.String username)
			throws RemoteException, SFWebServiceFaultException {
		EmpDetails managerDetails = new EmpDetails();

		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = stub.isValidSession();
		if (isValidLogin) {
			try {
				String newbaseQueryString = null;
				if (username != null)
					newbaseQueryString = getManagerDetails + username;
				logger.info(newbaseQueryString);
				paramList = new SFParameter[1];
				SFParameter param = new SFParameter();
				param.setValue(SFConstants.PAGE_SIZE);
				param.setName(MAX_ROWS);
				paramList[0] = param;
				QueryResult qResult = stub.query(newbaseQueryString, paramList);
				SFObject[] srObjectarr = qResult.getSfobject();
				if (srObjectarr != null) {
					if (srObjectarr.length > 0) {
						managerDetails = getQueryResultForManagerDetails(
								srObjectarr, 0);
					}
				} else {
					logger.info("Nofound in the Database!!!");

				}

			} catch (SFWebServiceFaultException e) {
				throw new SFWebServiceFaultException();
			} catch (Exception e) {
				e.printStackTrace();
				throw new SFWebServiceFaultException();
			} finally {
				LogoutOfSF logSF = new LogoutOfSF();
				logSF.logout(stub);
			}

		} else {
			throw new RemoteException("Session is not valid!");
		}
		return managerDetails;
	}

	private EmpDetails getSkipLevelManagerDetails(java.lang.String username)
			throws RemoteException, SFWebServiceFaultException {
		EmpDetails managerDetails = new EmpDetails();

		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = stub.isValidSession();
		if (isValidLogin) {
			try {
				String newbaseQueryString = null;
				if (username != null)
					username = "'" + username + "'";
				newbaseQueryString = getSkipLevelManagerDetails + username;
				logger.info(newbaseQueryString);
				paramList = new SFParameter[1];
				SFParameter param = new SFParameter();
				param.setValue(SFConstants.PAGE_SIZE);
				param.setName(MAX_ROWS);
				paramList[0] = param;
				QueryResult qResult = stub.query(newbaseQueryString, paramList);
				SFObject[] srObjectarr = qResult.getSfobject();
				if (srObjectarr != null) {
					if (srObjectarr.length > 0) {
						managerDetails = getQueryResultForSkipManagerDetails(
								srObjectarr, 0);
					}
				} else {
					logger.info("Nofound in the Database!!!");

				}

			} catch (SFWebServiceFaultException e) {
				throw new SFWebServiceFaultException();
			} catch (Exception e) {
				e.printStackTrace();
				throw new SFWebServiceFaultException();
			} finally {
				LogoutOfSF logSF = new LogoutOfSF();
				logSF.logout(stub);
			}

		} else {
			throw new RemoteException("Session is not valid!");
		}
		return managerDetails;
	}

	private EmpDetails getQueryResultForManagerDetails(SFObject[] srObjectarr,
			int i) {
		EmpDetails managerDetails = new EmpDetails();

		String lastName = "";
		String firstName = "";
		String middleName = "";
		String managerExternalId = "";

		MessageElement[] me = srObjectarr[i].get_any();
		managerDetails = initializeEmpDetails(managerDetails);
		for (int j = 0; j < me.length; j++) {
			try {

				String nodeString = me[j].getAsString();
				logger.info("Element " + me[j].getAsString());
				Iterator iter = me[j].getChildElements();

				while (iter.hasNext()) {
					Text object = (Text) iter.next();

					if (nodeString.contains("firstName")) {
						firstName = object.getNodeValue();
					}
					if (nodeString.contains(":mi")) {
						middleName = object.getNodeValue();
					}
					if (nodeString.contains("lastName")) {
						lastName = object.getNodeValue();
					}
					if (nodeString.contains("managerExternalId")) {
						managerExternalId = object.getNodeValue();
						managerDetails.setSkipLevelId(managerExternalId);
						if (managerExternalId != null) {
							System.out
									.println("Enter into the Manager's Manager ID");

							managerDetails = getSkipLevelManagerDetails(managerExternalId);
							managerDetails.setSkipLevelManager(managerDetails
									.getSkipLevelManager());
						}
					}

				}
				if (middleName.isEmpty() || middleName == null) {
					managerDetails.setManager(firstName + " " + lastName);
				} else {
					managerDetails.setManager(firstName + " " + middleName
							+ " " + lastName);

				}
				managerDetails.setSkipLevelId(managerExternalId);
				// managerDetails.setSkipLevelManager(firstName + " " +
				// middleName + " "
				// + lastName);
				logger.debug("Manager:::" + firstName + " " + middleName + " "
						+ lastName);
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
		return managerDetails;
	}

	private EmpDetails getQueryResultForSkipManagerDetails(
			SFObject[] srObjectarr, int i) {
		EmpDetails managerDetails = new EmpDetails();

		String lastName = "";
		String firstName = "";
		String middleName = "";

		MessageElement[] me = srObjectarr[i].get_any();
		managerDetails = initializeEmpDetails(managerDetails);
		for (int j = 0; j < me.length; j++) {
			try {

				String nodeString = me[j].getAsString();
				logger.info("Element " + me[j].getAsString());
				Iterator iter = me[j].getChildElements();

				while (iter.hasNext()) {
					Text object = (Text) iter.next();

					if (nodeString.contains("firstName")) {
						firstName = object.getNodeValue();
					}
					if (nodeString.contains(":mi")) {
						middleName = object.getNodeValue();
					}
					if (nodeString.contains("lastName")) {
						lastName = object.getNodeValue();
					}

				}
				if (middleName.isEmpty() || middleName == null) {
					managerDetails.setSkipLevelManager(firstName + " "
							+ lastName);
				} else {
					managerDetails.setSkipLevelManager(firstName + " "
							+ middleName + " " + lastName);
				}

			} catch (Exception e) {
				
				e.printStackTrace();
			}

		}
		return managerDetails;
	}

	private EmpDetails getQueryResultForEmpDetails(SFObject[] srObjectarr, int i) {
		// HashMap<String, String> arrayList = new HashMap<String, String>();
		// logger.info("getQueryResultForEmpDetails Method");
		EmpDetails empDetails = new EmpDetails();
		EmpDetails managerDetails = new EmpDetails();
		EmpDetails employmentStatus = new EmpDetails();
		String addressLine1 = "";
		String addressLine2 = "";
		String lastName = "";
		String firstName = "";
		String middleName = "";

		MessageElement[] me = srObjectarr[i].get_any();

		empDetails = initializeEmpDetails(empDetails);
		managerDetails = initializeEmpDetails(managerDetails);

		for (int j = 0; j < me.length; j++) {
			try {

				String nodeString = me[j].getAsString();
				logger.info("me[j].getNodeValue() --------"
						+ me[j].getNodeValue());
				logger.info("Element " + me[j].getAsString());
				Iterator iter = me[j].getChildElements();

				while (iter.hasNext()) {
					Text object = (Text) iter.next();
					// logger.info("nodeString:"+ nodeString);
					if (nodeString.contains("empId")) {
						String empId = object.getNodeValue();
						empDetails.setEmpid(empId);
					}
					if (nodeString.contains("firstName")) {
						firstName = object.getNodeValue();
					}
					if (nodeString.contains(":mi")) {
						middleName = object.getNodeValue();
					}
					if (nodeString.contains("lastName")) {
						lastName = object.getNodeValue();
					}
					if (nodeString.contains("gender")) {
						String gender = object.getNodeValue();
						empDetails.setGender(gender);
					}
					if (nodeString.contains("dateOfBirth")) {
						String dateOfBirth = object.getNodeValue();
						if (dateOfBirth != "") {
							SimpleDateFormat formatter = new SimpleDateFormat(
									"yyyy-MM-dd");
							Date date = formatter.parse(dateOfBirth);
							Format dateformat = new SimpleDateFormat("dd");
							Format monthformat = new SimpleDateFormat("MMM");
							String newdateOfBirth = dateformat.format(date)
									+ ", " + monthformat.format(date);
							empDetails.setDOB(newdateOfBirth);
						} else {
							empDetails.setDOB(dateOfBirth);
						}

					}
					if (nodeString.contains("email")) {
						String email = object.getNodeValue();
						empDetails.setEmail(email);
					}
					if (nodeString.contains("addressLine1")) {
						addressLine1 = object.getNodeValue();
					}
					if (nodeString.contains("addressLine2")) {
						addressLine2 = object.getNodeValue();
					}
					if (nodeString.contains("cellPhone")) {
						String cellPhone = object.getNodeValue();
						empDetails.setMobile(cellPhone);
					}
					if (nodeString.contains("hireDate")) {
						String hireDate = object.getNodeValue();
						empDetails.setDOJ(hireDate);
					}
					if(nodeString.contains("custom02")){

						String custom02=object.getNodeValue();
						if(custom02.contains("(")){
							String business=custom02.substring(0,
									custom02.indexOf('('));
							empDetails.setBusiness(business);
						}else{
							empDetails.setFunctionname(custom02);
						}
					}
					if(nodeString.contains("custom10")){
						String custom10=object.getNodeValue();							
						if(custom10.contains("(")){
							String costCenter=custom10.substring(custom10.indexOf('('));
							String ccenter1 = costCenter.substring(1, costCenter.indexOf(')'));
							empDetails.setCostCenter(ccenter1);
						}
						else{
							empDetails.setCostCenter(custom10);
						}				
						
					}
					if (nodeString.contains("custom03")) {
						String custom03 = object.getNodeValue();
						if (custom03.contains("(")) {
							String buiness = custom03.substring(0,
									custom03.indexOf('('));
							//empDetails.setBusiness(buiness);
							empDetails.setUnit(buiness);
						} else {
							//empDetails.setBusiness(custom03);
							empDetails.setUnit(custom03);
						}

					}
					if (nodeString.contains("state")) {
						String state = object.getNodeValue();
						empDetails.setState(state);
					}
					if (nodeString.contains("city")) {
						String city = object.getNodeValue();
						empDetails.setCity(city);
					}
					if (nodeString.contains("location")) {
						String location = object.getNodeValue();
						empDetails.setLocation(location);
					}
					if (nodeString.contains("department")) {
						String department = object.getNodeValue();
						if (department.contains("(")) {
							String depart = department.substring(0,
									department.indexOf('('));
							empDetails.setDepartment(depart);
						} else {
							empDetails.setDepartment(department);
						}
					}
					if (nodeString.contains("division")) {
						String division = object.getNodeValue();
						if(division.contains("(")){
							String divisionName=division.substring(0,
									division.indexOf('('));
							empDetails.setFunctionname(divisionName);
						}else{
							empDetails.setFunctionname(division);
						}
						
					}
					if (nodeString.contains("jobCode")) {
						String jobCode = object.getNodeValue();
						if (jobCode.contains("(")) {
							String job = jobCode.substring(jobCode.indexOf('('));
							String loc2 = job.substring(1, job.indexOf(')'));
							empDetails.setJobcode(loc2);
						} else {
							empDetails.setJobcode(jobCode);
						}
					}
					if (nodeString.contains("title")) {
						String title = object.getNodeValue();
						empDetails.setDesignation(title);
					}
					if (nodeString.contains("payGrade")) {
						String payGrade = object.getNodeValue();
						if(payGrade.contains("(")){
							String grade = payGrade.substring(payGrade.indexOf('('));
							String grade1 = grade.substring(1, grade.indexOf(')'));							
							String gradeCategory = payGrade.substring(0,payGrade.indexOf('-'));
							empDetails.setGrade(grade1);
							empDetails.setGradeCategory(gradeCategory);
						}else{
						empDetails.setGrade(payGrade);
						empDetails.setGradeCategory("");
						}
					}
					if (nodeString.contains("custom07")) {
						String custom07 = object.getNodeValue();
						boolean s = commonUtils.isNumeric(custom07);
						if (s != false) {
							System.out
									.println("Enter into the EmploymentStatus");
							custom07 = "'PKOP-" + custom07 + "'";
							employmentStatus = getEmploymentStatusDetails(custom07);
							System.out.println("employmentStatus:: "
									+ employmentStatus.getEmploymentStatus());

							empDetails.setEmploymentStatus(employmentStatus
									.getEmploymentStatus());
						} else {
							empDetails.setEmploymentStatus(custom07);
						}

					}
					empDetails.setPassportplace("");
					empDetails.setPassportname("");
					// empDetails.setUnit("");
					empDetails.setPositiontitle("");
					empDetails.setPosition("");
					//empDetails.setGradeCategory("");
					//empDetails.setCostCenter("");
					empDetails.setEmployeeCategory("");
					empDetails.setISDEPTHEAD("");
					empDetails.setVendorEmpid("");
					empDetails.setVendorname("");

					if (nodeString.contains("managerExternalId")) {
						String managerExternalId = object.getNodeValue();
						empDetails.setManagerId(managerExternalId);
						if (managerExternalId != null) {
							System.out.println("Enter into the managerId");
							managerExternalId = "'" + managerExternalId + "'";
							managerDetails = getManagerDetails(managerExternalId);
							empDetails
									.setManager(managerDetails.getManager() == null ? ""
											: managerDetails.getManager());
							empDetails.setSkipLevelId(managerDetails
									.getSkipLevelId() == null ? ""
									: managerDetails.getSkipLevelId());
							empDetails.setSkipLevelManager(managerDetails
									.getSkipLevelManager() == null ? ""
									: managerDetails.getSkipLevelManager());

						}
					}
				}
				logger.debug("addressLine1 addressLine2: " + addressLine1 + " "
						+ addressLine2);
				empDetails.setAddress(addressLine1 + " " + addressLine2);
				if (middleName.isEmpty() || middleName == null) {
					empDetails.setName(firstName + " " + lastName);
				} else {
					empDetails.setName(firstName + " " + middleName + " "
							+ lastName);
				}
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
		return empDetails;
	}

	private EmpDetails getEmploymentStatusDetails(java.lang.String id)
			throws RemoteException, SFWebServiceFaultException {
		EmpDetails employmentStatus = new EmpDetails();
		// HashMap<String, String> arrayList = new HashMap<String, String>();
		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = stub.isValidSession();
		if (isValidLogin) {
			try {
				String newbaseQueryString = null;
				if (id != null)
					newbaseQueryString = getPicklistDetails + id;
				logger.info(newbaseQueryString);
				paramList = new SFParameter[1];
				SFParameter param = new SFParameter();
				param.setValue(SFConstants.PAGE_SIZE);
				param.setName(MAX_ROWS);
				paramList[0] = param;
				QueryResult qResult = stub.query(newbaseQueryString, paramList);
				SFObject[] srObjectarr = qResult.getSfobject();
				if (srObjectarr != null) {
					if (srObjectarr.length > 0) {
						employmentStatus = getQueryResultForEmploymentStatusDetails(
								srObjectarr, 0);
					}
				} else {
					logger.info("Nofound in the Database!!!");

				}

			} catch (SFWebServiceFaultException e) {
				throw new SFWebServiceFaultException();
			} catch (Exception e) {
				e.printStackTrace();
				throw new SFWebServiceFaultException();
			} finally {
				LogoutOfSF logSF = new LogoutOfSF();
				logSF.logout(stub);
			}

		} else {
			throw new RemoteException("Session is not valid!");
		}
		return employmentStatus;
	}

	private EmpDetails getQueryResultForEmploymentStatusDetails(
			SFObject[] srObjectarr, int i) {
		EmpDetails employmentStatus = new EmpDetails();
		String en_US = "";

		MessageElement[] me = srObjectarr[i].get_any();
		employmentStatus = initializeEmpDetails(employmentStatus);
		for (int j = 0; j < me.length; j++) {
			try {

				String nodeString = me[j].getAsString();
				logger.info("Element " + me[j].getAsString());
				Iterator iter = me[j].getChildElements();

				while (iter.hasNext()) {
					Text object = (Text) iter.next();

					if (nodeString.contains("en_US")) {
						en_US = object.getNodeValue();
						employmentStatus.setEmploymentStatus(en_US);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return employmentStatus;
	}

	/**
	 * @param empDetails
	 */
	private EmpDetails initializeEmpDetails(EmpDetails empDetails) {
		empDetails.setAddress("");
		empDetails.setBusiness("");
		empDetails.setCity("");
		empDetails.setCostCenter("");
		empDetails.setDepartment("");
		empDetails.setDesignation("");
		empDetails.setDOB("");
		empDetails.setDOJ("");
		empDetails.setEmail("");
		empDetails.setEmpid("");
		empDetails.setEmployeeCategory("");
		empDetails.setEmploymentStatus("");
		empDetails.setFunctionname("");
		empDetails.setGender("");
		empDetails.setGrade("");
		empDetails.setGradeCategory("");
		empDetails.setISDEPTHEAD("");
		empDetails.setJobcode("");
		empDetails.setLocation("");
		empDetails.setManager("");
		empDetails.setManagerId("");
		empDetails.setMobile("");
		empDetails.setName("");
		empDetails.setPassportissudon(null);
		empDetails.setPassportname("");
		empDetails.setPassportplace("");
		empDetails.setPassportvalidity(null);
		empDetails.setPosition("");
		empDetails.setPositiontitle("");
		empDetails.setSkipLevelId("");
		empDetails.setSkipLevelManager("");
		empDetails.setState("");
		empDetails.setUnit("");
		empDetails.setVendorEmpid("");
		empDetails.setVendorname("");

		return empDetails;
	}
}
