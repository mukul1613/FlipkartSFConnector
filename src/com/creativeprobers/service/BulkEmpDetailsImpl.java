package com.creativeprobers.service;

import java.io.File;
import java.io.FileWriter;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import javax.net.ssl.SSLException;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.Text;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.tempuri.EmpDetails;

import com.creativeprobers.util.SFConstants;
import com.creativeprobers.util.commonUtils;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.successfactors.sfapi.fault.SFWebServiceFaultException;
import com.successfactors.sfapi.server.SFAPI;
import com.successfactors.sfapi.sfobject.QueryResult;
import com.successfactors.sfapi.sfobject.SFObject;
import com.successfactors.sfapi.sfobject.SFParameter;

public class BulkEmpDetailsImpl implements Job {
	private static Logger logger = Logger.getLogger(BulkEmpDetailsImpl.class);

	private static String bulkEmpDetailsQueryString_active = "SELECT externalId,firstName,mi,lastName,gender,dateOfBirth,email,addressLine1,addressLine2,cellPhone,hireDate,custom03,custom02,custom10,state,city,location,department,division,custom07,jobCode,title,payGrade,managerExternalId FROM User WHERE status='active'";
	private static String bulkEmpDetailsQueryString_inactive = "SELECT externalId,firstName,mi,lastName,gender,dateOfBirth,email,addressLine1,addressLine2,cellPhone,hireDate,custom03,custom02,custom10,state,city,location,department,division,custom07,jobCode,title,payGrade,managerExternalId FROM User WHERE status='inactive'";
	private static String bulkEmpDetailsMapQuery = "SELECT externalId,firstName,mi,lastName,managerExternalId FROM User";
	private static String getPicklistDetails = "SELECT id,en_US FROM PicklistOption WHERE picklistId ='employmentType'";// or
																														// picklistId='employementStatus'";

	private static SFParameter[] paramList = null;
	private static final String MAX_ROWS = "maxRows";
	private HashMap<String, EmpDetails> empDetailsMapList = new HashMap<String, EmpDetails>();
	private HashMap<String, PicklistOption> empEmploymentStatusMapList = new HashMap<String, PicklistOption>();

	public org.tempuri.EmpDetails[] getBulkEmpDetails(java.lang.String APPID,
			java.lang.String empType) throws RemoteException {

		EmpDetails[] empDetailsList = getBulkEmpDetails_from_csv(APPID, empType);

		return empDetailsList;

	}

	private EmpDetails[] getBulkEmpDetails_For_Caching(java.lang.String empType)
			throws RemoteException {
		EmpDetails[] empDetailsList = null;
		try {
			empDetailsList = getBulkEmployeeDetails(empType);
			logger.info("empDetailsList.length: " + empDetailsList.length);
			int employeesWithoutManagers = 0;
			int employeesWithout2ndLevelManagers = 0;
			for (EmpDetails empDetails : empDetailsList) {
				if (empDetails.getManager() == null
						|| empDetails.getManager().isEmpty()) {
					employeesWithoutManagers++;
				}
				if (empDetails.getSkipLevelManager() == null
						|| empDetails.getSkipLevelManager().isEmpty()) {
					employeesWithout2ndLevelManagers++;
				}
			}
			logger.info("employeesWithoutManagers:" + employeesWithoutManagers);
			logger.info("employeesWithout2ndLevelManagers:"
					+ employeesWithout2ndLevelManagers);

		} catch (SFWebServiceFaultException sfe) {
			// throw new SFWebServiceFaultException("ERROR!!");
			// This exception is expected for an invalid externalId
		} catch (RemoteException re) {
			throw new RemoteException("Error!");
			// This exception is expected for an invalid externalId

		} catch (Exception e) {
			throw new RemoteException("Error!");

		}
		return empDetailsList;
	}

	private EmpDetails[] getBulkEmployeeDetails(String empType)
			throws RemoteException, SFWebServiceFaultException {

		EmpDetails empDetails = new EmpDetails();

		EmpDetails[] empDetailsList = null;
		ArrayList<EmpDetails> empDetailsArrayList = new ArrayList<EmpDetails>();
		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = stub.isValidSession();
		if (isValidLogin) {
			try {
				String newbaseQueryString = null;
				if (empType.equalsIgnoreCase("active"))
					newbaseQueryString = bulkEmpDetailsQueryString_active;
				if (empType.equalsIgnoreCase("inactive"))
					newbaseQueryString = bulkEmpDetailsQueryString_inactive;
				logger.info(newbaseQueryString);
				paramList = new SFParameter[1];
				SFParameter param = new SFParameter();
				param.setValue(SFConstants.PAGE_SIZE);
				param.setName(MAX_ROWS);
				paramList[0] = param;
				QueryResult qResult = stub.query(newbaseQueryString, paramList);
				SFObject[] srObjectarr = qResult.getSfobject();
				if (srObjectarr != null) {
					// logger.info("srObjectarr::" + srObjectarr);
					if (srObjectarr.length > 0) {
						logger.info("NumberResult" + qResult.getNumResults());
						for (int i = 0; i < srObjectarr.length; i++) {
							logger.debug("INSIDE for loop");
							empDetails = getQueryResultForBulkEmpDetails(
									srObjectarr, i);
							empDetailsArrayList.add(empDetails);
							logger.debug("DONE for loop");
							logger.debug("Length of result was:"
									+ srObjectarr.length);
						}
					}
				} else {
					logger.info("No Records found in the database");
				}
				int queryCount = 1;
				while (qResult.isHasMore()) {
					logger.debug("\n\n************NEW QUERY NO: " + queryCount
							+ "*************\n\n");
					logger.debug("Inside qResult:: " + qResult);
					qResult = stub.queryMore(qResult.getQuerySessionId());
					srObjectarr = qResult.getSfobject();
					if (srObjectarr != null) {
						if (srObjectarr.length > 0) {
							for (int i = 0; i < srObjectarr.length; i++) {
								logger.debug("INSIDE for loop");
								empDetails = getQueryResultForBulkEmpDetails(
										srObjectarr, i);
								empDetailsArrayList.add(empDetails);
								logger.debug("empDetailsArrayList Length::"
										+ empDetailsArrayList.size());
								logger.debug("DONE for loop");
								logger.debug("Length of result was:"
										+ srObjectarr.length);
							}
						}
					}
					queryCount++;
					System.out.println("queryCount++::" + queryCount++);
				}

				empDetailsList = new EmpDetails[empDetailsArrayList.size()];
				for (int i = 0; i < empDetailsArrayList.size(); i++) {
					empDetailsList[i] = empDetailsArrayList.get(i);
				}
			} catch (SFWebServiceFaultException e) {
				// throw new SFWebServiceFaultException();
				getBulkEmployeeDetails(empType);
			} catch (Exception e) {
				// e.printStackTrace();
				// throw new SFWebServiceFaultException();
				logger.error("Error at getBulkEmployeeDetails ", e);
				getBulkEmployeeDetails(empType);
			} finally {
				LogoutOfSF logSF = new LogoutOfSF();
				logSF.logout(stub);
			}

		} else {
			throw new RemoteException("Session is not valid!");
		}
		return empDetailsList;
	}

	private EmpDetails getQueryResultForBulkEmpDetails(SFObject[] srObjectarr,
			int i) throws Exception {
		logger.debug("getQueryResultForEmpDetails Method");
		EmpDetails empDetails = new EmpDetails();
		EmpDetails managerDetails = new EmpDetails();
		EmpDetails managerMangersDetails = new EmpDetails();
		PicklistOption employmentStatus = new PicklistOption();
		String addressLine1 = "";
		String addressLine2 = "";
		String lastName = "";
		String firstName = "";
		String middleName = "";

		MessageElement[] me = srObjectarr[i].get_any();
		empDetails = initializeEmpDetails(empDetails);
		managerDetails = initializeEmpDetails(managerDetails);
		managerMangersDetails = initializeEmpDetails(managerMangersDetails);
		employmentStatus=initializePicklistOption(employmentStatus);
		for (int j = 0; j < me.length; j++) {
			try {

				String nodeString = me[j].getAsString();
				logger.debug("Element " + me[j].getAsString());
				Iterator iter = me[j].getChildElements();

				while (iter.hasNext()) {
					Text object = (Text) iter.next();
					logger.debug("nodeString:" + nodeString);

					if (nodeString.contains("externalId")) {
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
						empDetails.setDOB(dateOfBirth);
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
							empDetails.setBusiness(custom02);						
					}
					if(nodeString.contains("custom10")){
						String custom10=object.getNodeValue();						
							empDetails.setCostCenter(custom10);						
					}
					if (nodeString.contains("division")) {
						String division = object.getNodeValue();						
							empDetails.setFunctionname(division);
					}
					if (nodeString.contains("custom03")) {
						String custom03 = object.getNodeValue();
						//empDetails.setBusiness(custom03);
						empDetails.setUnit(custom03);
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
						empDetails.setDepartment(department);
					}					
					if (nodeString.contains("jobCode")) {
						String jobCode = object.getNodeValue();
						empDetails.setJobcode(jobCode);
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
							empDetails.setGrade(grade1);
							if(payGrade.contains("-")){
								String gradeCategory = payGrade.substring(0,payGrade.indexOf('-'));								
								empDetails.setGradeCategory(gradeCategory);
								}else{
									empDetails.setGradeCategory("");
								}
							
						}else{
						empDetails.setGrade(payGrade);
						empDetails.setGradeCategory("");
						}
					}
					if (nodeString.contains("custom07")) {
						String custom07 = object.getNodeValue();
					//  cahnges on 20150417
					if(custom07!=null){
					boolean s = commonUtils.isNumeric(custom07);
					if (s != false) {
						//logger.info("Enter into the EmploymentStatus");
						custom07 = "PKOP-" + custom07 + "";						
						employmentStatus=empEmploymentStatusMapList.get(custom07);
						if(employmentStatus!=null){
						//logger.info("employmentStatus:: "+ employmentStatus.getEn_US());
						empDetails.setEmploymentStatus(employmentStatus.getEn_US()== null ?"":employmentStatus.getEn_US());
												
					}					
					}	
					else{
						empDetails.setEmploymentStatus(custom07);
					}
					}					
					}
					empDetails.setPassportplace("");
					empDetails.setPassportname("");
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
						if (managerExternalId != null
								&& !managerExternalId
										.equalsIgnoreCase("NO_MANAGER")) {
							logger.debug("Enter into the managerId");
							logger.debug(empDetailsMapList.keySet());
							managerDetails = empDetailsMapList
									.get(managerExternalId);
							if (managerDetails != null) {
								logger.debug("managerDetails   "
										+ managerDetails.getName());
								logger.debug("managerId   "
										+ managerDetails.getManagerId());
								empDetails
										.setManager(managerDetails.getName() == null ? ""
												: managerDetails.getName());
								empDetails.setSkipLevelId(managerDetails
										.getManagerId() == null ? ""
										: managerDetails.getManagerId());

								managerMangersDetails = empDetailsMapList
										.get(managerDetails.getManagerId());
								if (managerMangersDetails != null) {
									empDetails
											.setSkipLevelManager(managerMangersDetails
													.getName() == null ? ""
													: managerMangersDetails
															.getName());
									logger.debug("managerMangersDetails   "
											+ managerMangersDetails.getName());
								}
							}

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
				logger.error("getQueryResultForBulkEmpDetails", e);
				throw new Exception("Error" + e);
			}

		}
		return empDetails;

	}

	private void setEmpDetailsMapList() throws Exception {

		if (empDetailsMapList.size() != 0) {
			logger.debug("empDetailsMapList is not empty!");
			return;
		}
		EmpDetails empDetails = new EmpDetails();
		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = stub.isValidSession();
		if (isValidLogin) {
			try {
				String newbaseQueryString = null;
				newbaseQueryString = bulkEmpDetailsMapQuery;
				logger.info(newbaseQueryString);
				paramList = new SFParameter[1];
				SFParameter param = new SFParameter();
				param.setValue(SFConstants.PAGE_SIZE);
				param.setName(MAX_ROWS);
				paramList[0] = param;
				QueryResult qResult = stub.query(newbaseQueryString, paramList);

				SFObject[] srObjectarr = qResult.getSfobject();
				if (srObjectarr != null) {
					logger.debug("NumberResult" + qResult.getNumResults());
					for (int i = 0; i < srObjectarr.length; i++) {
						empDetails = getQueryResultForEmpDetailsMap(
								srObjectarr, i);
						empDetailsMapList
								.put(empDetails.getEmpid(), empDetails);
					}
					// empDetailsMapList.get("1115").getCity();
					logger.debug("empDetailsMapList::"
							+ empDetailsMapList.size());
				} else {
					logger.info("NO database found !!!");
				}
				while (qResult.isHasMore()) {
					qResult = stub.queryMore(qResult.getQuerySessionId());
					srObjectarr = qResult.getSfobject();
					if (srObjectarr != null) {
						if (srObjectarr.length > 0) {
							for (int i = 0; i < srObjectarr.length; i++) {
								empDetails = getQueryResultForEmpDetailsMap(
										srObjectarr, i);
								logger.debug("empDetailsMapList::"
										+ empDetailsMapList.size());
								empDetailsMapList.put(empDetails.getEmpid(),
										empDetails);
							}
						}
					}
				}
				logger.debug("empDetailsMapList::" + empDetailsMapList.size());
			} catch (Exception e) {
				throw new SSLException("Error!!!" + e);
				// logger.error("setEmpDetailsMapList",e);
			}
		}

	}

	private void setEmploymentStatusMapList() throws Exception {

		if (empEmploymentStatusMapList.size() != 0) {
			logger.debug("empDetailsMapList is not empty!");
			return;
		}
		PicklistOption employmentStatus = new PicklistOption();
		LoginToSF lsf = new LoginToSF();
		SFAPI stub = lsf.getProxy();
		boolean isValidLogin = stub.isValidSession();
		if (isValidLogin) {
			try {
				String newbaseQueryString = null;
				newbaseQueryString = getPicklistDetails;
				logger.info(newbaseQueryString);
				paramList = new SFParameter[1];
				SFParameter param = new SFParameter();
				param.setValue(SFConstants.PAGE_SIZE);
				param.setName(MAX_ROWS);
				paramList[0] = param;
				QueryResult qResult = stub.query(newbaseQueryString, paramList);

				SFObject[] srObjectarr = qResult.getSfobject();
				if (srObjectarr != null) {
					logger.debug("NumberResult" + qResult.getNumResults());
					for (int i = 0; i < srObjectarr.length; i++) {
						employmentStatus = getQueryResultForEmploymentStatusDetails(
								srObjectarr, i);
						empEmploymentStatusMapList.put(srObjectarr[i].getId(),
								employmentStatus);
						// empEmploymentStatusMapList.get(en_US);
					}
					logger.info(empEmploymentStatusMapList.keySet());
					logger.debug(empEmploymentStatusMapList.get(
							srObjectarr[1].getId()).getEn_US());
					logger.debug("empEmploymentStatusMapList::"
							+ empDetailsMapList.size());
				} else {
					logger.debug("NO database found !!!");
				}
				while (qResult.isHasMore()) {
					qResult = stub.queryMore(qResult.getQuerySessionId());
					srObjectarr = qResult.getSfobject();
					if (srObjectarr != null) {
						if (srObjectarr.length > 0) {
							for (int i = 0; i < srObjectarr.length; i++) {
								employmentStatus = getQueryResultForEmploymentStatusDetails(
										srObjectarr, i);
								logger.debug("empEmploymentStatusMapList::"
										+ empEmploymentStatusMapList.size());
								empEmploymentStatusMapList.put(
										srObjectarr[i].getId(),
										employmentStatus);
							}
						}
					}
				}
				logger.debug("empEmploymentStatusMapList::"
						+ empDetailsMapList.size());
			} catch (Exception e) {
				throw new SSLException("Error!!!" + e);
				// logger.error("setEmpDetailsMapList",e);
			}
		}

	}

	private PicklistOption getQueryResultForEmploymentStatusDetails(
			SFObject[] srObjectarr, int i) {
		PicklistOption employmentStatus = new PicklistOption();
		String en_US = "";

		MessageElement[] me = srObjectarr[i].get_any();
		employmentStatus = initializePicklistOption(employmentStatus);
		for (int j = 0; j < me.length; j++) {
			try {

				String nodeString = me[j].getAsString();
				logger.info("Element " + me[j].getAsString());
				Iterator iter = me[j].getChildElements();

				while (iter.hasNext()) {
					Text object = (Text) iter.next();

					if (nodeString.contains("en_US")) {
						en_US = object.getNodeValue();
						employmentStatus.setEn_US(en_US);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return employmentStatus;
	}

	private PicklistOption initializePicklistOption(
			PicklistOption employmentStatus) {
		employmentStatus.setId("");
		employmentStatus.setEn_US("");
		return employmentStatus;
	}

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

	private EmpDetails getQueryResultForEmpDetailsMap(SFObject[] srObjectarr,
			int i) throws Exception {

		HashMap<String, String> arrayList = new HashMap<String, String>();
		logger.debug("getQueryResultForEmpDetails Method");
		EmpDetails empDetails = new EmpDetails();

		String lastName = "";
		String firstName = "";
		String middleName = "";

		MessageElement[] me = srObjectarr[i].get_any();
		empDetails = initializeEmpDetails(empDetails);
		for (int j = 0; j < me.length; j++) {
			try {

				String nodeString = me[j].getAsString();
				logger.debug("Element " + me[j].getAsString());
				Iterator iter = me[j].getChildElements();

				while (iter.hasNext()) {
					Text object = (Text) iter.next();
					logger.debug("nodeString:" + nodeString);
					if (nodeString.contains("externalId")) {
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
					if (nodeString.contains("managerExternalId")) {
						String managerExternalId = object.getNodeValue();
						empDetails.setManagerId(managerExternalId);
					}
				}
				if (middleName.isEmpty() || middleName == null) {
					empDetails.setName(firstName + " " + lastName);
				} else {
					empDetails.setName(firstName + " " + middleName + " "
							+ lastName);
				}
			} catch (Exception e) {
				throw new Exception("ERROR !!!!" + e);
				// e.printStackTrace();
			}

		}
		return empDetails;

	}

	private boolean createCSV(org.tempuri.EmpDetails[] empDetailsList_active,
			org.tempuri.EmpDetails[] empDetailsList_inactive, File file)
			throws Exception {

		logger.info("INSIDE createCSV");
		boolean fileExists = file.exists();
		if (fileExists) {
			// delete the old file
			file.delete();
		}
		file.createNewFile();
		boolean result = false;
		try {
			if (empDetailsList_active != null
					|| empDetailsList_inactive != null) {
				// Use FileWriter constructor that specifies open for appending
				// File tempFile = File.createTempFile("Temp", ".csv");
				CsvWriter csvOutput = new CsvWriter(new FileWriter(file, true),
						',');

				// Create Header for CSV
				csvOutput.write("Empid");
				csvOutput.write("Name");
				csvOutput.write("Gender");
				csvOutput.write("DOB");
				csvOutput.write("Email");
				csvOutput.write("Passportplace");
				csvOutput.write("Passportvalidity");
				csvOutput.write("Passportname");
				csvOutput.write("Passportissudon");
				csvOutput.write("Address");
				csvOutput.write("Mobile");
				csvOutput.write("DOJ");
				csvOutput.write("Business");
				csvOutput.write("Unit");
				csvOutput.write("EmploymentStatus");
				csvOutput.write("State");
				csvOutput.write("City");
				csvOutput.write("Location");
				csvOutput.write("Department");
				csvOutput.write("functionname");
				csvOutput.write("Jobcode");
				csvOutput.write("Designation");
				csvOutput.write("Positiontitle");
				csvOutput.write("Position");
				csvOutput.write("GradeCategory");
				csvOutput.write("Grade");
				csvOutput.write("CostCenter");
				csvOutput.write("EmployeeCategory");
				csvOutput.write("ManagerId");
				csvOutput.write("Manager");
				csvOutput.write("SkipLevelId");
				csvOutput.write("SkipLevelManager");
				csvOutput.write("ISDEPTHEAD");
				csvOutput.write("Vendorname");
				csvOutput.write("VendorEmpid");
				csvOutput.write("Status");
				csvOutput.endRecord();

				for (int i = 0; i < empDetailsList_active.length; i++) {
					csvOutput.write(empDetailsList_active[i].getEmpid());
					csvOutput.write(empDetailsList_active[i].getName());
					csvOutput.write(empDetailsList_active[i].getGender());
					csvOutput.write(empDetailsList_active[i].getDOB());
					csvOutput.write(empDetailsList_active[i].getEmail());
					csvOutput
							.write(empDetailsList_active[i].getPassportplace());

					Calendar cal = empDetailsList_active[i]
							.getPassportvalidity();
					if (cal != null) {
						csvOutput.write(cal.toString());
					} else {
						csvOutput.write("");
					}
					csvOutput.write(empDetailsList_active[i].getPassportname());
					Calendar cal1 = empDetailsList_active[i]
							.getPassportissudon();
					if (cal1 != null) {
						csvOutput.write(cal1.toString());
					} else {
						csvOutput.write("");
					}
					csvOutput.write(empDetailsList_active[i].getAddress());
					csvOutput.write(empDetailsList_active[i].getMobile());
					csvOutput.write(empDetailsList_active[i].getDOJ());
					csvOutput.write(empDetailsList_active[i].getBusiness());
					csvOutput.write(empDetailsList_active[i].getUnit());
					csvOutput.write(empDetailsList_active[i]
							.getEmploymentStatus());
					csvOutput.write(empDetailsList_active[i].getState());
					csvOutput.write(empDetailsList_active[i].getCity());
					csvOutput.write(empDetailsList_active[i].getLocation());
					csvOutput.write(empDetailsList_active[i].getDepartment());
					csvOutput.write(empDetailsList_active[i].getFunctionname());
					csvOutput.write(empDetailsList_active[i].getJobcode());
					csvOutput.write(empDetailsList_active[i].getDesignation());
					csvOutput
							.write(empDetailsList_active[i].getPositiontitle());
					csvOutput.write(empDetailsList_active[i].getPosition());
					csvOutput
							.write(empDetailsList_active[i].getGradeCategory());
					csvOutput.write(empDetailsList_active[i].getGrade());
					csvOutput.write(empDetailsList_active[i].getCostCenter());
					csvOutput.write(empDetailsList_active[i]
							.getEmployeeCategory());
					csvOutput.write(empDetailsList_active[i].getManagerId());
					csvOutput.write(empDetailsList_active[i].getManager());
					csvOutput.write(empDetailsList_active[i].getSkipLevelId());
					csvOutput.write(empDetailsList_active[i]
							.getSkipLevelManager());
					csvOutput.write(empDetailsList_active[i].getISDEPTHEAD());
					csvOutput.write(empDetailsList_active[i].getVendorname());
					csvOutput.write(empDetailsList_active[i].getVendorEmpid());
					csvOutput.write("active");

					csvOutput.endRecord();
				}

				for (int i = 0; i < empDetailsList_inactive.length; i++) {
					csvOutput.write(empDetailsList_inactive[i].getEmpid());
					csvOutput.write(empDetailsList_inactive[i].getName());
					csvOutput.write(empDetailsList_inactive[i].getGender());
					csvOutput.write(empDetailsList_inactive[i].getDOB());
					csvOutput.write(empDetailsList_inactive[i].getEmail());
					csvOutput.write(empDetailsList_inactive[i]
							.getPassportplace());
					Calendar cal = empDetailsList_inactive[i]
							.getPassportvalidity();
					if (cal != null) {
						csvOutput.write(cal.toString());
					} else {
						csvOutput.write("");
					}
					csvOutput.write(empDetailsList_inactive[i]
							.getPassportname());
					Calendar cal1 = empDetailsList_inactive[i]
							.getPassportissudon();
					if (cal1 != null) {
						csvOutput.write(cal1.toString());
					} else {
						csvOutput.write("");
					}
					csvOutput.write(empDetailsList_inactive[i].getAddress());
					csvOutput.write(empDetailsList_inactive[i].getMobile());
					csvOutput.write(empDetailsList_inactive[i].getDOJ());
					csvOutput.write(empDetailsList_inactive[i].getBusiness());
					csvOutput.write(empDetailsList_inactive[i].getUnit());
					csvOutput.write(empDetailsList_inactive[i]
							.getEmploymentStatus());
					csvOutput.write(empDetailsList_inactive[i].getState());
					csvOutput.write(empDetailsList_inactive[i].getCity());
					csvOutput.write(empDetailsList_inactive[i].getLocation());
					csvOutput.write(empDetailsList_inactive[i].getDepartment());
					csvOutput.write(empDetailsList_inactive[i]
							.getFunctionname());
					csvOutput.write(empDetailsList_inactive[i].getJobcode());
					csvOutput
							.write(empDetailsList_inactive[i].getDesignation());
					csvOutput.write(empDetailsList_inactive[i]
							.getPositiontitle());
					csvOutput.write(empDetailsList_inactive[i].getPosition());
					csvOutput.write(empDetailsList_inactive[i]
							.getGradeCategory());
					csvOutput.write(empDetailsList_inactive[i].getGrade());
					csvOutput.write(empDetailsList_inactive[i].getCostCenter());
					csvOutput.write(empDetailsList_inactive[i]
							.getEmployeeCategory());
					csvOutput.write(empDetailsList_inactive[i].getManagerId());
					csvOutput.write(empDetailsList_inactive[i].getManager());
					csvOutput
							.write(empDetailsList_inactive[i].getSkipLevelId());
					csvOutput.write(empDetailsList_inactive[i]
							.getSkipLevelManager());
					csvOutput.write(empDetailsList_inactive[i].getISDEPTHEAD());
					csvOutput.write(empDetailsList_inactive[i].getVendorname());
					csvOutput
							.write(empDetailsList_inactive[i].getVendorEmpid());
					csvOutput.write("inactive");

					csvOutput.endRecord();
				}

				csvOutput.flush();
				csvOutput.close();

				result = true;
				System.out.println("csv completed");
			}

			else {
				// result = "";
				result = false;
			}
		} catch (Exception e) {
			throw new Exception("ERROR!!!" + e);
		}
		return result;
	}

	private EmpDetails[] readCSVData(java.lang.String APPID,
			java.lang.String empType, File file) throws RemoteException {

		ArrayList<EmpDetails> empDetailsArrayList = new ArrayList<EmpDetails>();
		String Empid;
		String Name;
		String Gender;
		String DOB;
		String Email;
		String Passportplace;
		String Passportvalidity;
		String Passportname;
		String Passportissudon;
		String Address;
		String Mobile;
		String DOJ;
		String Business;
		String Unit;
		String EmploymentStatus;
		String State;
		String City;
		String Location;
		String Department;
		String functionname;
		String Jobcode;
		String Designation;
		String Positiontitle;
		String Position;
		String GradeCategory;
		String Grade;
		String CostCenter;
		String EmployeeCategory;
		String ManagerId;
		String Manager;
		String SkipLevelId;
		String SkipLevelManager;
		String ISDEPTHEAD;
		String Vendorname;
		String VendorEmpid;

		try {
			CsvReader reader = null;
			reader = new CsvReader(file.getPath());
			boolean header = reader.readHeaders();
			while (reader.readRecord()) {
				if (!reader.get("Status").equalsIgnoreCase(empType)) {
					continue;
				}
				EmpDetails empDetails = new EmpDetails();
				String Status = reader.get("Status");
				logger.debug("status" + Status);
				Empid = reader.get("Empid");

				logger.debug("Empid >>>> " + Empid);
				empDetails.setEmpid(Empid);
				Name = reader.get("Name");
				logger.debug("Name::" + Name);
				empDetails.setName(Name);
				Gender = reader.get("Gender");
				empDetails.setGender(Gender);
				logger.debug("Gender ::" + Gender);
				DOB = reader.get("DOB");

				if (DOB != "") {
					logger.debug("DOB ::" + DOB);
					SimpleDateFormat formatter = new SimpleDateFormat(
							"yyyy-MM-dd");
					Date date = formatter.parse(DOB);
					Format dateformat = new SimpleDateFormat("dd");
					Format monthformat = new SimpleDateFormat("MMM");
					String newDOB = dateformat.format(date) + ", "
							+ monthformat.format(date);
					logger.debug("newDOB ::" + newDOB);
					empDetails.setDOB(newDOB);
				} else {
					empDetails.setDOB(DOB);
				}
				logger.debug("DOB ::" + DOB);
				Email = reader.get("Email");
				empDetails.setEmail(Email);
				logger.debug("Email ::" + Email);
				Passportplace = reader.get("Passportplace");
				empDetails.setPassportplace(Passportplace);
				logger.debug("Passportplace ::" + Passportplace);
				Passportvalidity = reader.get("Passportvalidity");
				if (Passportvalidity != "") {
					DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					//
					Calendar cal = Calendar.getInstance();
					cal.setTime(df.parse(Passportvalidity));
					empDetails.setPassportvalidity(cal);
				} else {
					Calendar cal1 = null;
					empDetails.setPassportvalidity(cal1);
				}
				logger.debug("Passportvalidity:: " + Passportvalidity);
				Passportname = reader.get("Passportname");
				empDetails.setPassportname(Passportname);
				logger.debug("Passportname::" + Passportname);
				Passportissudon = reader.get("Passportissudon");
				if (Passportissudon != "") {
					DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					Calendar cal1 = Calendar.getInstance();
					cal1.setTime(df.parse(Passportissudon));
					empDetails.setPassportissudon(cal1);
				} else {
					Calendar cal4 = null;
					empDetails.setPassportissudon(cal4);
				}
				logger.debug("Passportissudon ::" + Passportissudon);
				Address = reader.get("Address");
				empDetails.setAddress(Address);
				logger.debug("Address::" + Address);
				Mobile = reader.get("Mobile");
				empDetails.setMobile(Mobile);
				logger.debug("Mobile::" + Mobile);
				DOJ = reader.get("DOJ");
				empDetails.setDOJ(DOJ);
				logger.debug("DOJ::" + DOJ);
				Business = reader.get("Business");
				if (Business.contains("(")) {
					String business=Business.substring(0,
							Business.indexOf('('));
					empDetails.setBusiness(business);
				
				}else{
					empDetails.setBusiness(Business);
				}
				Unit = reader.get("Unit");
				if (Unit.contains("(")) {
					String buiness = Unit.substring(0,
							Unit.indexOf('('));
				//empDetails.setBusiness(buiness);
				empDetails.setUnit(buiness);
				}else{
					empDetails.setUnit(Unit);
				}				
				logger.debug("Unit::" + Unit);
				EmploymentStatus = reader.get("EmploymentStatus");
				empDetails.setEmploymentStatus(EmploymentStatus);
				logger.debug("EmploymentStatus::" + EmploymentStatus);
				State = reader.get("State");
				empDetails.setState(State);
				logger.debug("State::" + State);
				City = reader.get("City");
				empDetails.setCity(City);
				logger.debug("City::" + City);
				Location = reader.get("Location");
				empDetails.setLocation(Location);
				logger.debug("Location::" + Location);
				Department = reader.get("Department");
				if (Department.contains("(")) {
					String depart = Department.substring(0,
							Department.indexOf('('));
					empDetails.setDepartment(depart);
				} else{
					empDetails.setDepartment(Department);
				}				
				logger.debug("Department::" + Department);
				functionname = reader.get("functionname");
				if(functionname.contains("(")){
					String divisionName=functionname.substring(0,
							functionname.indexOf('('));
					empDetails.setFunctionname(divisionName);
				}else{
					empDetails.setFunctionname(functionname);
				}	
				logger.debug("functionname::" + functionname);
				Jobcode = reader.get("Jobcode");
				if (Jobcode.contains("(")) {
					String job = Jobcode.substring(Jobcode.indexOf('('));
					String loc2 = job.substring(1, job.indexOf(')'));
					empDetails.setJobcode(loc2);
				} else{
					empDetails.setJobcode(Jobcode);
				}				
				logger.debug("Jobcode ::" + Jobcode);
				Designation = reader.get("Designation");
				empDetails.setDesignation(Designation);
				logger.debug("Designation::" + Designation);
				Positiontitle = reader.get("Positiontitle");
				empDetails.setPositiontitle(Positiontitle);
				logger.debug("Positiontitle::" + Positiontitle);
				Position = reader.get("Position");
				empDetails.setPosition(Position);
				logger.debug("Position::" + Position);				
				Grade = reader.get("Grade");
				empDetails.setGrade(Grade);							
				logger.debug("Grade::" + Grade);
				GradeCategory = reader.get("GradeCategory");
				empDetails.setGradeCategory(GradeCategory);				
				logger.debug("GradeCategory::" + GradeCategory);
				CostCenter = reader.get("CostCenter");
				if (CostCenter.contains("(")) {
					String ccenter = CostCenter.substring(CostCenter.indexOf('('));
					String ccenter1 = ccenter.substring(1, ccenter.indexOf(')'));
					empDetails.setCostCenter(ccenter1);
				} else{
					empDetails.setCostCenter(CostCenter);
				}				
				logger.debug("CostCenter::" + CostCenter);
				EmployeeCategory = reader.get("EmployeeCategory");
				empDetails.setEmployeeCategory(EmployeeCategory);
				logger.debug("EmployeeCategory::" + EmployeeCategory);
				ManagerId = reader.get("ManagerId");
				empDetails.setManagerId(ManagerId);
				logger.debug("ManagerId::" + ManagerId);
				Manager = reader.get("Manager");
				empDetails.setManager(Manager);
				logger.debug("Manager::" + Manager);
				SkipLevelId = reader.get("SkipLevelId");
				empDetails.setSkipLevelId(SkipLevelId);
				logger.debug("SkipLevelId::" + SkipLevelId);
				SkipLevelManager = reader.get("SkipLevelManager");
				empDetails.setSkipLevelManager(SkipLevelManager);
				logger.debug("SkipLevelManager::" + SkipLevelManager);
				ISDEPTHEAD = reader.get("ISDEPTHEAD");
				empDetails.setISDEPTHEAD(ISDEPTHEAD);
				logger.debug("ISDEPTHEAD:: " + ISDEPTHEAD);
				Vendorname = reader.get("Vendorname");
				empDetails.setVendorname(Vendorname);
				logger.debug("Vendorname ::" + Vendorname);
				VendorEmpid = reader.get("VendorEmpid");
				empDetails.setVendorEmpid(VendorEmpid);
				logger.debug("VendorEmpid:: " + VendorEmpid);
				empDetailsArrayList.add(empDetails);
				logger.info("Length of empDetailsArrayList ::"
						+ empDetailsArrayList.size());
			}
			reader.close();

		} catch (Exception e) {
			throw new RemoteException("ERROR !!!" + e);
			// logger.info(e);

		}		
		EmpDetails[] empDetailsList = new EmpDetails[empDetailsArrayList.size()];
		for (int i = 0; i < empDetailsArrayList.size(); i++) {
			empDetailsList[i] = empDetailsArrayList.get(i);
		}
		return empDetailsList;
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		//BulkEmpDetailsImpl bulkEmpDetailsImpl = new BulkEmpDetailsImpl();
		// bulkEmpDetailsImpl.getBulkEmpDetails("", "active");
		//bulkEmpDetailsImpl.setEmploymentStatusMapList();

	}

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Enter into trigger...");	

		try {			
			File file = new File(SFConstants.FilePath);
			setEmpDetailsMapList();
			setEmploymentStatusMapList();
			EmpDetails[] empDetailsList_active = getBulkEmpDetails_For_Caching("active");
			EmpDetails[] empDetailsList_inactive = getBulkEmpDetails_For_Caching("inactive");
			createCSV(empDetailsList_active, empDetailsList_inactive, file);
			
		} catch (RemoteException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public EmpDetails[] getBulkEmpDetails_from_csv(java.lang.String APPID,
			java.lang.String empType) throws RemoteException {		
		// READ FROM CSV AND CONSTRUCT EMPDETAILS[]

		// RETURN EMPDETAILS[]
		BulkEmpDetailsImpl bulkEmpDetailsImpl = new BulkEmpDetailsImpl();
		File file = new File(SFConstants.FilePath);
		// File file = new
		// File("C:/Users/Rajasekhar Mallam/Desktop/SF/FilpKart/Details.csv");
		EmpDetails[] empDetailsList = bulkEmpDetailsImpl.readCSVData(APPID,
				empType, file);

		return empDetailsList;
	}

}
