/**
 * 
 */
package com.creativeprobers.util;

/**
 * @author Rajasekhar Reddy
 *
 */
public class commonUtils {
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	    //System.out.println(d);
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	public static void main(String args[]) throws java.text.ParseException{
		/*String department="HR-GURGAON-Village Begumpur Khatola-Mother Hub (3622)";
		String depart=department.substring(0, department.indexOf('('));
		String depart1=department.substring(department.indexOf('('));
		String depart2=depart1.substring(1, depart1.indexOf(')'));
		System.out.println("!!!!!!!!!!!!!!!"+depart);
		System.out.println("@@@@@@@@@@@@@@@@@@@@"+depart1);
		System.out.println("###################"+depart2);*/
	}
}
