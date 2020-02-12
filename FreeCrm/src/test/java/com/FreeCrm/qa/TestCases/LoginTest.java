package com.FreeCrm.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FreeCrm.qa.Base.BaseTest;
import com.FreeCrm.qa.Config.waitTime;
import com.FreeCrm.qa.Pages.HomePage;
import com.FreeCrm.qa.Pages.LoginPage;

public class LoginTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homepage;
	
	
	
	public LoginTest() {
		super(); // this will handle nullpoineterException 
	}
	
	@BeforeMethod()
	public void setUp()
	{
		Initialization(); // call method of Base Test call to launch browser
		loginpage=new LoginPage();
	}
	
	@Test
	public void LoginPageTest()
	{
		homepage=loginpage.loginmethod(pro.getProperty("uname"), pro.getProperty("pass")); // login method return homepage object
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}

}
