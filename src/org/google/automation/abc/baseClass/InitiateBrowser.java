package org.google.automation.abc.baseClass;

import java.time.Duration;

import org.google.automation.abc.utilitiesclass.PropUtilitiesClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitiateBrowser 
{
	public WebDriver driver;
	@BeforeMethod
	
	public void launchBrowser() throws Exception
	{
		if(PropUtilitiesClass.readprop("Browsername").equalsIgnoreCase("Chrome"))
		
		driver=new ChromeDriver();
		
		else if (PropUtilitiesClass.readprop("Browsername").equalsIgnoreCase("Edge"))
			
			driver=new EdgeDriver();
		
		else if (PropUtilitiesClass.readprop("Browsername").equalsIgnoreCase("safari"))
			
			driver=new SafariDriver();
		
        else if (PropUtilitiesClass.readprop("Browsername").equalsIgnoreCase("Firefox"))
			
			driver=new FirefoxDriver();
		
		
		
		driver.get(PropUtilitiesClass.readprop("ApplicationURL"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		

		
		
	}
	
	
		@AfterMethod
		
		public void closeBrowser() throws Exception
		{
			
			driver.quit();
		}
	
	
	
	
	
	









}

