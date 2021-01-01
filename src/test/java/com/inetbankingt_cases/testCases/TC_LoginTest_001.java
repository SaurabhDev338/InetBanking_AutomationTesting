package com.inetbankingt_cases.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void logintest() throws IOException
	{
			
		LoginPage lp=new LoginPage(driver);		
		lp.setusername(Username);
		logger.info("Username entered");
		lp.setpassword(Password);
		logger.info("Password entered");
		lp.clicklogin();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			capturescreenshots(driver,"logintest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}
	

}
