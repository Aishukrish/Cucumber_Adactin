package com.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions


(
		
		features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
		
		glue = "com.sd",
		
		plugin={
				
				"html:Cucumber_Reports/Rep.html",
				"json:Cucumber_Reports/JSON.json",
				"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

		}		 
		)

public class Adactin_Test_Runner {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void set_Up() {
		
		 driver = Base_Class.browser_Configuration("chrome");
		
		
	}
	
	
	@AfterClass
	public static void tear_Down() {
		
		driver.quit();
		
	}

}
