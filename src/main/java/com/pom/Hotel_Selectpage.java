package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Selectpage {
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement sel;
	@FindBy(id="continue")
	private WebElement con;

	public Hotel_Selectpage(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSel() {
		return sel;
	}

	public WebElement getCon() {
		return con;
	}

	}
