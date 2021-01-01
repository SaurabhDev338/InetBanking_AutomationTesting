package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_Customer {
	WebDriver driver;
	
	public New_Customer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='New Customer']") WebElement lnk_NewCustomer;
	@FindBy(xpath="//input[@name='name']") WebElement txt_customerName;
	@FindBy(name="rad1") WebElement radiobtn_Gender;
	@FindBy(xpath="//input[@id='dob']") WebElement txt_DOB;
	@FindBy(xpath="//textarea[@name='addr']") WebElement txt_Address;
	@FindBy(xpath="//input[@name='city']") WebElement txt_city;
	@FindBy(xpath="//input[@name='state']") WebElement txt_State;
	@FindBy(xpath="//input[@name='pinno']") WebElement txt_PIN;
    @FindBy(xpath="//input[@name='telephoneno']") WebElement txt_MobNo;
    @FindBy(xpath="//input[@name='emailid']") WebElement txt_Email;
    @FindBy(xpath="//input[@name='password']") WebElement txt_Password;
    @FindBy(xpath="//input[@value='Submit']") WebElement btn_Submit;
    @FindBy(xpath="//input[@value='Reset']") WebElement btn_Reset;
    
    
    public void Click_NewCustomer()
    {
    	lnk_NewCustomer.click();
    }
    
    public void CustomerName(String customername)
    {
    	txt_customerName.sendKeys(customername);
    }
    
    public void Gender(String gender)
    {
    	radiobtn_Gender.click();
    }
    public void DOB(String DD,String MM,String YYYY)
    {
    	txt_DOB.sendKeys(DD,MM,YYYY);
    }
    public void Address(String address)
    {
    	txt_Address.sendKeys(address);
    }
    public void City(String city)
    {
    	txt_city.sendKeys(city);
    }
    public void State(String state)
    {
    	txt_State.sendKeys(state);
    }
    public void PIN(String Pin)
    {
    	txt_PIN.sendKeys(Pin);
    }
    public void MobNo(String Mobno)
    {
    	txt_MobNo.sendKeys(Mobno);
    }
    public void Email(String email)
    {
    	txt_Email.sendKeys(email);
    }
    public void Password(String password)
    {
    	txt_Password.sendKeys(password);
    }
    public void Submit()
    {
    	btn_Submit.click();
    }
    public void Reset()
    {
    	btn_Reset.click();
    }
}
