package com.FreeCrm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FreeCrm.qa.Base.BaseTest;
import com.FreeCrm.qa.Pages.ContactPage;
import com.FreeCrm.qa.Pages.Dealspage;
import com.FreeCrm.qa.Pages.HomePage;
import com.FreeCrm.qa.Pages.LoginPage;

public class HomepageTest  extends BaseTest{
		
		LoginPage lp;
		HomePage hp;  //declare
		ContactPage cl;
		Dealspage dl;
		
		
	
	public HomepageTest(){
		super (); // this will not throw null pointer exception
	}
	
	@BeforeMethod()
	public void setUp(){
		Initialization(); // launch Browser
		lp= new LoginPage();
		hp=lp.loginmethod(pro.getProperty("uname"), pro.getProperty("pass")); // call method from login page which is Home page type
		dl=new Dealspage();
		
		
	}
	
	@Test(priority = 1,enabled = true)
	public void VerifyHomepagetitleTest(){	
		String title=hp.Homepagetitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority = 2,enabled = true)
	public void verifydealslinktest(){
		   dl=hp.deals(); // call method of home page class which return DealsLink class
	}
	
	
	@AfterMethod
	public void tearOff() {
		driver.quit();
	}
	
}
