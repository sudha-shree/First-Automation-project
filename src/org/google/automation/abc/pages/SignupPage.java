package org.google.automation.abc.pages;

import org.google.automation.abc.utilitiesclass.PropUtilitiesClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage 
{
	WebDriver driver;
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void click_Createnewaccount() throws Exception
	{
		driver.findElement(By.xpath(PropUtilitiesClass.readelementprop("Login_Createnewaccount_xpath"))).click();
	}
	
	public void enter_Firstname(String fname) throws Exception
	{
		driver.findElement(By.name(PropUtilitiesClass.readelementprop("Signup_Firstname_name"))).sendKeys(fname);
		
	}
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(PropUtilitiesClass.readelementprop("Signup_lastname_name"))).sendKeys(lname);
	}
	public void enter_mobilenumber(String number) throws Exception
	{
		driver.findElement(By.name(PropUtilitiesClass.readelementprop("Signup_mobilenumber_name"))).sendKeys(number);
	}
	
	//Signup_reentermobilenumber_name
	public void enter_reentermobilenumber(String renumber) throws Exception
	{
		driver.findElement(By.name(PropUtilitiesClass.readelementprop("Signup_reentermobilenumber_name"))).sendKeys(renumber);
	}
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(PropUtilitiesClass.readelementprop("Signup_newpassword_name"))).sendKeys(pass);
		
	}
	public void click_gender() throws Exception
	{
		driver.findElement(By.className(PropUtilitiesClass.readelementprop("Signup_gender_class"))).click();
	}
	
	public void click_signupbuttn() throws Exception
	{
		driver.findElement(By.name(PropUtilitiesClass.readelementprop("Signup_signupbuttn_name"))).click();
	}
	

}
