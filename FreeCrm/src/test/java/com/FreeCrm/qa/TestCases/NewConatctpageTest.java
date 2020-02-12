package com.FreeCrm.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FreeCrm.qa.Base.BaseTest;
import com.FreeCrm.qa.Pages.ContactNamePage;
import com.FreeCrm.qa.Pages.ContactPage;
import com.FreeCrm.qa.Pages.HomePage;
import com.FreeCrm.qa.Pages.LoginPage;
import com.FreeCrm.qa.Pages.NewContactPage;

public class NewConatctpageTest extends BaseTest {
	
	ContactNamePage contactname;
	NewContactPage newcontact;
	HomePage homepage;
	LoginPage loginpage;
	ContactPage contact;
	
	
	public NewConatctpageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		Initialization();
		newcontact= new NewContactPage();
		loginpage=new LoginPage();
		homepage=loginpage.loginmethod(pro.getProperty("uname"), pro.getProperty("pass"));
		contact=homepage.contact();
		newcontact=contact.newcontact();
		
	}
	
	
	@Test
	public void createContactTest()
	{
		contactname=newcontact.createContact(pro.getProperty("fname"), pro.getProperty("lname"));
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{ 
		Thread.sleep(5000);
		driver.quit();
	}
}
