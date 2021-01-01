package com.inetbankingu.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration/Config.properties");
		
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception is " +e.getMessage());		
		} 
	}
	
	public String GetApplicationUrl()
	{
		String url=pro.getProperty("Baseurl");
		return url;
	}
	
	public String GetUsername()
	{
		String username=pro.getProperty("Username");
		return username;
	}
	
	public String GetPassword()
	{
		String password=pro.getProperty("Password");
		return password;		
	}
	
	public String GetChrompath()
	{
		String chrompath=pro.getProperty("chrompath");
		return chrompath;
	}
	
	public String GetIEpath()
	{
		String IEpath=pro.getProperty("IEPath");
		return IEpath;
	}
	public String GetFirefoxpath()
	{
		String firefoxpath=pro.getProperty("Firefoxpath");
		return firefoxpath;
	}
     	

}
