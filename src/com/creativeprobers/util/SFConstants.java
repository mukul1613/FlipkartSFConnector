/**
 * 
 */
package com.creativeprobers.util;

/**
 * @author Creative
 *
 */
public class SFConstants {
	// SF Login Credentials
	public static String COMPANY_ID = PropertyUtils.SFProperties().getProperty("companyId");
	public static String ADMIN_USER_NAME = PropertyUtils.SFProperties().getProperty("adminUserName");
	public static String ADMIN_PASSWORD = PropertyUtils.SFProperties().getProperty("adminPassword");
	// SF endpoint url
	public static String ENDPOINT_URL = PropertyUtils.SFProperties().getProperty("endpointURL");
	// Proxy info
	public static String PROXY_HOST = PropertyUtils.SFProperties().getProperty("proxyhost");
	public static String PROXY_PORT = PropertyUtils.SFProperties().getProperty("proxyport");
	// Query options
	public static String PAGE_SIZE = PropertyUtils.SFProperties().getProperty("pageSize");
	public static String FilePath = PropertyUtils.SFProperties().getProperty("FilePath");
	
}
