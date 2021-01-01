package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//input[@name='uid']")@CacheLookup WebElement txt_username;
	@FindBy(xpath="//input[@name='password']")@CacheLookup WebElement txt_password;
	@FindBy(xpath="//input[@value='LOGIN']")@CacheLookup WebElement btn_login;
	
	public void setusername(String uname)
	{
		txt_username.sendKeys(uname);
	}
	
	public void setpassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void clicklogin()
	{
		btn_login.click();
	}

}
