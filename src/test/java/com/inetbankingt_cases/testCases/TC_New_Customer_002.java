package com.inetbankingt_cases.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetBanking.PageObjects.LoginPage;
import com.inetBanking.PageObjects.New_Customer;

import junit.framework.Assert;

public class TC_New_Customer_002 extends BaseClass
{
	@Test
    public void AddNewCustomer() throws InterruptedException, IOException
    {
    	LoginPage lp=new LoginPage(driver);
    	lp.setusername(Username);
    	logger.info("Username is Entered");
    	lp.setpassword(Password);
    	logger.info("Password is Entered");
    	lp.clicklogin();
    	logger.info("Login successfully");
    	Thread.sleep(3000);
    	New_Customer nc=new New_Customer(driver);
    	nc.Click_NewCustomer();
    	logger.info("Click on New Customer");
    	nc.CustomerName(Randomstring());
    	logger.info("Entered Customer Name");
    	nc.Gender("male");
    	logger.info("Click on Gender");
    	nc.DOB("26","01","1997");
    	logger.info("DOB is Entered");
    	nc.Address("nagpur");
    	logger.info("Address is Entered");
    	nc.City("Nagpur");
    	logger.info("City is Entered");
    	nc.State("MH");
    	logger.info("State is Entered");
    	nc.PIN("34566784");
    	logger.info("PIN is Entered");
    	nc.MobNo(RandomNum());
    	logger.info("Mob number is Entered");
    	nc.Email(Randomstring()+"@gmail.com");
    	logger.info("Email is Entered");
    	nc.Password("saurabh");
    	logger.info("Password is Entered");
    	nc.Submit();
    	logger.info("Click on Submit");

    	Thread.sleep(3000);
    	
    	boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
    	
    	if(res==true)
    	{   
        	logger.info("Customer Registered Successfully!!!");
    		Assert.assertTrue(true);
    	}
    	else
    	{
    		capturescreenshots(driver,"AddnewCustomer");
    		Assert.assertTrue(false);
    	}
    }
	
	
}
