/**
 * 
 */
package com.creativeprobers.service;

import org.apache.naming.java.javaURLContextFactory;

/**
 * @author Rajasekhar Reddy
 *
 */
public class PicklistOption implements java.io.Serializable {
	 private java.lang.String id;
	 private java.lang.String en_US;
	 
	 public PicklistOption(){
		 
	 }
	 public PicklistOption(
	           java.lang.String id,java.lang.String en_US) {
	           this.id = id;
	           this.en_US=en_US;	        		   
	          
	    }
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getEn_US() {
		return en_US;
	}
	public void setEn_US(java.lang.String en_US) {
		this.en_US = en_US;
	}
}
