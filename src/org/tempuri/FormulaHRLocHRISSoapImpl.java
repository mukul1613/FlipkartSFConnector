/**
 * FormulaHRLocHRISSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

import java.rmi.RemoteException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.Text;
import org.apache.log4j.Logger;

import com.creativeprobers.service.BulkEmpDetailsImplforWsRetail;
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
public class FormulaHRLocHRISSoapImpl implements
		org.tempuri.FormulaHRLocHRISSoap {
	private static Logger logger = Logger
			.getLogger(FormulaHRLocHRISSoapImpl.class);
	private static String empDetailsQueryString = "SELECT empId,firstName,mi,lastName,gender,dateOfBirth,email,addressLine1,addressLine2,cellPhone,hireDate,custom03,custom02,custom10,state,city,location,department,division,custom07,jobCode,title,payGrade,managerExternalId FROM User where externalId=";
	private static String getManagerDetails = "SELECT firstName,mi,lastName,managerExternalId FROM User where externalId=";
	private static String getPicklistDetails = "SELECT id,en_US FROM PicklistOption WHERE id =";
	private static String getSkipLevelManagerDetails = "SELECT firstName,mi,lastName FROM User where externalId=";
	private static SFParameter[] paramList = null;
	private static final String MAX_ROWS = "maxRows";

	public org.tempuri.ArrayOfEmpLocDetails getBulkEmpDetails(
			java.lang.String APPID, java.lang.String empType)
			throws java.rmi.RemoteException {

		BulkEmpDetailsImplforWsRetail bulkEmpDetailsImpl = new BulkEmpDetailsImplforWsRetail();
		EmpLocDetails[] empDetailsList = bulkEmpDetailsImpl
				.getBulkEmpDetails_from_csv("", empType);
		
		ArrayOfEmpLocDetails arrayOfEmpLocDetails = new ArrayOfEmpLocDetails();
		arrayOfEmpLocDetails.setEmpLocDetails(empDetailsList);
		

		return arrayOfEmpLocDetails;

	}

	public org.tempuri.EmpLocDetails getEmpDetails(java.lang.String APPID,
			java.lang.String empid) throws java.rmi.RemoteException {
		EmpLocDetails empDetails = new EmpLocDetails();
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

	private EmpLocDetails getEmployeeDetails(java.lang.String username)
			throws RemoteException, SFWebServiceFaultException {
		EmpLocDetails empDetails = new EmpLocDetails();
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
				// logger.info("qResult:" + qResult);
				// Log.info(qResult.getSfobject().length);
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

	private EmpLocDetails getQueryResultForEmpDetails(SFObject[] srObjectarr,
			int i) {
		// HashMap<String, String> arrayList = new HashMap<String, String>();
		// logger.info("getQueryResultForEmpDetails Method");
		EmpLocDetails empDetails = new EmpLocDetails();
		EmpLocDetails managerDetails = new EmpLocDetails();
		EmpLocDetails employmentStatus = new EmpLocDetails();
		String addressLine1 = "";
		String addressLine2 = "";
		String lastName = "";
		String firstName = "";
		String middleName = "";

		MessageElement[] me = srObjectarr[i].get_any();

		empDetails = initializeEmpLocDetails(empDetails);
		managerDetails = initializeEmpLocDetails(managerDetails);

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
					if(nodeString.contains("custom10")){
						String custom10=object.getNodeValue();							
						if(custom10.contains("(")){
							String costCenter=custom10.substring(custom10.lastIndexOf('('));
							String ccenter1 = costCenter.substring(1, costCenter.indexOf(')'));
							empDetails.setCostCenter(ccenter1);
						}
						else{
							empDetails.setCostCenter(custom10);
						}		
						
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
						if (location.contains("(")) {
							String loc = location.substring(0,
									location.indexOf('('));
							String loc1 = location.substring(location
									.indexOf('('));
							String loc2 = loc1.substring(1, loc1.indexOf(')'));
							empDetails.setLocation(loc);
							empDetails.setLocationCode(loc2);
						} else {
							empDetails.setLocation(location);
						}
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

	private EmpLocDetails getEmploymentStatusDetails(java.lang.String id)
			throws RemoteException, SFWebServiceFaultException {
		EmpLocDetails employmentStatus = new EmpLocDetails();
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

	private EmpLocDetails getQueryResultForEmploymentStatusDetails(
			SFObject[] srObjectarr, int i) {
		EmpLocDetails employmentStatus = new EmpLocDetails();
		String en_US = "";

		MessageElement[] me = srObjectarr[i].get_any();
		employmentStatus = initializeEmpLocDetails(employmentStatus);
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
						// employmentStatus.getEmploymentStatus();
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return employmentStatus;
	}

	private EmpLocDetails getManagerDetails(java.lang.String username)
			throws RemoteException, SFWebServiceFaultException {
		EmpLocDetails managerDetails = new EmpLocDetails();
		// HashMap<String, String> arrayList = new HashMap<String, String>();
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

	private EmpLocDetails getQueryResultForManagerDetails(
			SFObject[] srObjectarr, int i) {
		// HashMap<String, String> arrayList = new HashMap<String, String>();
		// logger.info("getQueryResultForEmpDetails Method");
		EmpLocDetails managerDetails = new EmpLocDetails();

		String lastName = "";
		String firstName = "";
		String middleName = "";
		String managerExternalId = "";

		MessageElement[] me = srObjectarr[i].get_any();
		managerDetails = initializeEmpLocDetails(managerDetails);
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
							// managerExternalId = "'" + managerExternalId +
							// "'";
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
				// logger.info("Manager:::"+firstName + " " + middleName + " "
				// + lastName);
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
		return managerDetails;
	}

	private EmpLocDetails getSkipLevelManagerDetails(java.lang.String username)
			throws RemoteException, SFWebServiceFaultException {
		EmpLocDetails managerDetails = new EmpLocDetails();
		// HashMap<String, String> arrayList = new HashMap<String, String>();
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

	private EmpLocDetails getQueryResultForSkipManagerDetails(
			SFObject[] srObjectarr, int i) {
		// HashMap<String, String> arrayList = new HashMap<String, String>();
		// logger.info("getQueryResultForEmpDetails Method");
		EmpLocDetails managerDetails = new EmpLocDetails();

		String lastName = "";
		String firstName = "";
		String middleName = "";

		MessageElement[] me = srObjectarr[i].get_any();
		managerDetails = initializeEmpLocDetails(managerDetails);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return managerDetails;
	}

	private EmpLocDetails initializeEmpLocDetails(EmpLocDetails empDetails) {
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
		empDetails.setLocationCode("");
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
