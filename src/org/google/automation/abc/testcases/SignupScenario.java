package org.google.automation.abc.testcases;

import org.google.automation.abc.baseClass.InitiateBrowser;
import org.google.automation.abc.pages.LoginPage;
import org.google.automation.abc.pages.SignupPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignupScenario extends InitiateBrowser 
{
	@Test
	public void signupfunc() throws Exception
	{
		SignupPage signup = new SignupPage(driver);
		signup.click_Createnewaccount();
		signup.enter_Firstname("sudha");
		signup.enter_lastname("shree");
	
		signup.enter_mobilenumber("sudhashree56@gmail.com");
		signup.enter_reentermobilenumber("sudhashree56@gmail.com");
				
		
		
		
		signup.enter_password("sudhasujatha");
		Select birth= new Select(driver.findElement(By.id("month")));
		birth.selectByVisibleText("Nov");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("17");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1992");
		signup.click_gender();
		signup.click_signupbuttn();
		
		
		
		
	}

}
