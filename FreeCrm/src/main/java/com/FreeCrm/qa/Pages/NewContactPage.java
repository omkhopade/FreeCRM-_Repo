package com.FreeCrm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FreeCrm.qa.Base.BaseTest;

public class NewContactPage  extends BaseTest{
	
	@FindBy(name="first_name")
	WebElement fName;
	
	@FindBy(name="last_name")
	WebElement lName;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div[1]/button")
	WebElement Accessbtn;
	
	@FindBy(xpath="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement savebtn;
	
	
	
	
	public NewContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public ContactNamePage createContact(String fname, String lname)
	{
		fName.sendKeys(fname);
		lName.sendKeys(lname);
		Accessbtn.click();
		savebtn.click();
		return new ContactNamePage();
	}
	
	

}
