package com.creativeprobers.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.creativeprobers.service.LoginToSF;

/**
 * @author Creative
 *
 */
public class PropertyUtils
{
	static Logger Log = Logger.getLogger(PropertyUtils.class);

	private static Properties _sfProperty;
	private static ClassLoader classLoader = null;

	static
	{
		try
		{
			initLog4j();
			initSFProperties();
			
		} catch (Exception e)
		{
			Log.error("Error loading properties", e);
		}
	}

	

	public static Properties SFProperties()
	{
		try
		{
			if (_sfProperty != null)
			{
				return _sfProperty;
			}
			initSFProperties();
			
		} catch (Exception e)
		{
			Log.error("Error loading message properties", e);
		}
		return _sfProperty;
	}

	public static void initLog4j()
	{
		classLoader = PropertyUtils.class.getClassLoader();
		URL url = classLoader.getResource("log4j.properties");
		PropertyConfigurator.configure(url);
	}

	

	public static void initSFProperties()
		throws Exception
	{
		if (_sfProperty == null)
		{
			Log.info("Reading Message Properties");
			_sfProperty = new Properties();
			if (classLoader == null)
			{
				classLoader = PropertyUtils.class.getClassLoader();
			}
			InputStream messageStream = classLoader.getResourceAsStream("sfconfig.properties");
			try
			{
				_sfProperty.load(messageStream);
			} catch (IOException e)
			{
				Log.error("Error loading properties", e);
			} finally
			{
				messageStream.close();
			}
		}
	}
}
