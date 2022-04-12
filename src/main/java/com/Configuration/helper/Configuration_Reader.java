package com.Configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws IOException
	{
	File f= new File("C:\\Users\\Manjupriya pc\\eclipse-workspace\\Maven_Demo\\src\\main\\java\\com\\testdata\\properties\\Configuration.properties");
	FileInputStream fis= new FileInputStream(f);
	p= new Properties();
	p.load(fis);
	}
	public String get_Config_Url()
	{
	String value= p.getProperty("url");
	return value;
	}
	public String get_Config_username()
	{
		String name=p.getProperty("username");
		return name;
	}
	public String get_Config_Password()
	{
		String password= p.getProperty("password");
		return password;
	}
	public String get_Config_firstname()
	{
		String fname= p.getProperty("firstname");
		return fname;
	}
	public String get_Config_lastname()
	{
		String lname= p.getProperty("lastname");
		return lname;
	}
	public String get_Config_address()
	{
		String address= p.getProperty("address");
		return address;
	}
	public String get_Config_ccnum()
	{
		String ccnum= p.getProperty("ccnum");
		return ccnum;
	}
    public String get_Config_cvv()
    {
    	String cvv=p.getProperty("cvv");
    	return cvv;
    }

}
