package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Out {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement signout;
	
	public Sign_Out(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignout() {
		return signout;
	}
	

}
