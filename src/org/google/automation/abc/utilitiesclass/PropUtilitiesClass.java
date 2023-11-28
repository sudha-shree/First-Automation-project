package org.google.automation.abc.utilitiesclass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropUtilitiesClass 

{
	
	public static String readprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData1/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(key);
	return	prop.get(key).toString();	
	
		
		
	}
	public static String readelementprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData1/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
	return	prop.get(key).toString();
	}
}



