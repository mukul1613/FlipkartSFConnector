package org.tempuri;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Assert;
import org.junit.Test;

import com.creativeprobers.util.SFConstants;

public class FormulaHR_HRISSoapImplTest {
	FormulaHR_HRISSoapImpl fhr = new FormulaHR_HRISSoapImpl();

	//@Test
	public void testEmpAuthenticationCheck() {
		
		try {
			//valid id
			System.out.println("----------------VALID TEST WITH ACTIVE STATUS----------------");
			EmpAuthenticationDetail authenticationDetail = fhr.empAuthenticationCheck("", "1001", "");
			System.out.println("authenticationDetail::"+authenticationDetail.isStatus());
			assertEquals(authenticationDetail.isStatus(),true);
			//invalid id
			System.out.println("----------------VALID TEST WITH INACTIVE STATUS----------------");
			EmpAuthenticationDetail authenticationDetail2 = fhr.empAuthenticationCheck("", "eyip@successfactors.com", "");
			assertEquals(authenticationDetail2.isStatus(),false);
			System.out.println("authenticationDetail::"+authenticationDetail2.isStatus());
			//invalid id
			System.out.println("----------------IN VALID TEST----------------");
			EmpAuthenticationDetail authenticationDetail3 = fhr.empAuthenticationCheck("", "eyipXXX", "");
			assertEquals(authenticationDetail3.isStatus(),false);
			System.out.println("authenticationDetail::"+authenticationDetail3.isStatus());
			//wrong credentials
			System.out.println("----------------WRONG CREDS TEST----------------");
			SFConstants.COMPANY_ID="C0017935023T1-xxxx";
			EmpAuthenticationDetail authenticationDetail4 = fhr.empAuthenticationCheck("", "1001", "");
			//fail("Expected RemoteException!");
			//
		} catch (RemoteException e) {
			System.out.println(e);
		}
	}

	//@Test
	public void testGetBulkEmpDetails() {
		ArrayOfEmpDetails empDetails;
		try {
			empDetails = fhr.getBulkEmpDetails("", "active");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testGetEmpDetails() {
		try {
			EmpDetails empDetails=fhr.getEmpDetails("", "1115");
			System.out.println("empDetails::"+empDetails.getCity());
			assertNotNull(empDetails);
			assertEquals("Bangalore", empDetails.getCity());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
