package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page1 {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	
	public Home_page1(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignin() {
		return signin;
	}

}
