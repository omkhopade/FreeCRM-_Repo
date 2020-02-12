package com.FreeCrm.qa.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FreeCrm.qa.Base.BaseTest;

public class LoginPage  extends BaseTest{

	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement loginbtn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage loginmethod(String un,String pwd)
	{
		email.sendKeys(un);
		pass.sendKeys(pwd);
		loginbtn.click();  // click() method will  throw StaleElementReferenceException 
		return new HomePage();
		
	}
	
	
}
