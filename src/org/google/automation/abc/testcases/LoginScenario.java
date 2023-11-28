package org.google.automation.abc.testcases;

import org.google.automation.abc.baseClass.InitiateBrowser;
import org.google.automation.abc.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginScenario extends InitiateBrowser 
{
	@Test
	public void loginfunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username("user1");
		login.enter_password("asdfg");
		login.click_loginbttn();
		
		
	}

}
