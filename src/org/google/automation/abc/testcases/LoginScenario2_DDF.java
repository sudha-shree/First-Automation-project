package org.google.automation.abc.testcases;

import org.google.automation.abc.baseClass.InitiateBrowser;
import org.google.automation.abc.datagenerator.TestDataGenerator;
import org.google.automation.abc.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginScenario2_DDF extends InitiateBrowser 
{
	@Test(dataProvider="staticdata",dataProviderClass=TestDataGenerator.class)
	public void loginfunc(String username,String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
		
	}
	
		
		
		
	}
	
	
	
	
	
	

