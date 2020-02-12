package com.FreeCrm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FreeCrm.qa.Base.BaseTest;

public class ContactPage  extends BaseTest{
	
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/a")
	WebElement newcontact;
	
	
	public ContactPage() {
		PageFactory.initElements(driver,this);   // this is object of current class use to execute method of current class
		
	}
	
	public NewContactPage newcontact()
	{
		newcontact.click();
		return new NewContactPage();
	}

	
}
