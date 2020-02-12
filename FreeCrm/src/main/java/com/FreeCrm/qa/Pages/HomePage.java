package com.FreeCrm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FreeCrm.qa.Base.BaseTest;

public class HomePage  extends BaseTest{
	
	@FindBy(xpath="//*[@id='main-nav']/a[3]")
	WebElement contactlinks;
	
	@FindBy(xpath="//*[@id='main-nav']/a[5]")
	WebElement dealslink;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);  // this is current class(home page) object
	}
	
	public String Homepagetitle()
	{
		 return driver.getTitle();
	}
	
	public ContactPage contact()
	{
		
		contactlinks.click();
		return new ContactPage();
	}
	
	public Dealspage deals()
	{
		dealslink.click();
		return new Dealspage();
	}
	
	
	
	

}
