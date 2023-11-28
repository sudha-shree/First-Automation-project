package org.google.automation.abc.pages;

import org.google.automation.abc.utilitiesclass.PropUtilitiesClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.name(PropUtilitiesClass.readelementprop("Login_username_name"))).sendKeys(uname);;
	}
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(PropUtilitiesClass.readelementprop("Login_password_name"))).sendKeys(pass);
		
	}
	public void click_loginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(PropUtilitiesClass.readelementprop("Login_Loginbuttn_cssSelector"))).click();
	}
	

}
