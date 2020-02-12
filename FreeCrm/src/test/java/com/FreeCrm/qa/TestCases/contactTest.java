package com.FreeCrm.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FreeCrm.qa.Base.BaseTest;
import com.FreeCrm.qa.Pages.ContactPage;
import com.FreeCrm.qa.Pages.HomePage;
import com.FreeCrm.qa.Pages.LoginPage;
import com.FreeCrm.qa.Pages.NewContactPage;

public class contactTest  extends BaseTest{

	ContactPage contact;
	NewContactPage newcontact;
	LoginPage loginpage;
	HomePage homepage;
	

	public contactTest() {	
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		Initialization();
		contact=new ContactPage();
		loginpage=new LoginPage();
		System.out.println("login page obj created ");
		System.out.println("contact obj created");
		homepage=loginpage.loginmethod(pro.getProperty("uname"), pro.getProperty("pass"));
		System.out.println("login done");
		contact=homepage.contact();
		System.out.println("Contact page is open");
	}
	@Test
	public void verifynewContactBtn()
	{
		newcontact=contact.newcontact();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	



}
