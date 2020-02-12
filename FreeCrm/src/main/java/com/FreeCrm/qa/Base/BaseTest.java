package com.FreeCrm.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.FreeCrm.qa.Config.waitTime;

public class BaseTest {

	
	
	public static WebDriver driver;
	public static Properties pro;				
	 
	  
	public BaseTest()
	{
		
		try {
			pro=new Properties();
			FileInputStream file=new FileInputStream("D:\\Selenium\\Automation Testing\\FreeCrm\\src\\main\\java\\com\\FreeCrm\\qa\\Config\\commonProperties.properties");
			
			pro.load(file);
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		
		catch (IOException e) {
			// TODO: handle exception
		}
	}
	
	public void Initialization()
	{
		if(pro.getProperty("Browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (pro.getProperty("Browser").equals("fireFox"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Select correct Browser");
		}
		
			driver.manage().timeouts().pageLoadTimeout(waitTime.pageload, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(waitTime.implicit, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(pro.getProperty("url"));
		
		
	}
	
	
}
