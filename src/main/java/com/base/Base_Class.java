package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.io.FileHandler;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver; //---->Null
	public static String value;
	public static WebDriver browser_Configuration(String type)	
	{
		if(type.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void clickOnElement(WebElement element) {
		element.click();

	}
	public static void inputValueElement(WebElement element, String data) {
		element.sendKeys(data);

	}
	public static void close() {
		driver.close();

	}
	public static void getUrl(String url) {
		driver.get(url);

	}
	public static String getCurrentUrl(WebDriver driver)
	{
		String text= driver.getCurrentUrl();
		System.out.println("Current Url is  :"+text);
		return text;
		
	}
	public static void dropdown(String type,WebElement element,String value)
	{
		try {
		Select s= new Select(element);
		
			if(type.equalsIgnoreCase("byValue"))
			{
			
				s.selectByValue(value);
			}
			else if (type.equalsIgnoreCase("byText"))
			{

				s.selectByVisibleText(value);
			}
			else if (type.equalsIgnoreCase("byIndex")) 
			{
				int index= Integer.parseInt(value);
				s.selectByIndex(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	public static void getoptions(WebElement element)
	{
		Select s=new Select(element);
		List<WebElement> m=s.getOptions();
		for (WebElement e : m) {
			System.out.println(e.getAttribute("Value"));
			}
	}
	public static void action(String name,WebElement element)
	{
		try {
			Actions a= new Actions(driver);
			if(name.equalsIgnoreCase("moveto"))
			{
				a.moveToElement(element).build().perform();
			}
			else if (name.equalsIgnoreCase("clickon")) {
				a.click(element).build().perform();
				
			}
			else if (name.equalsIgnoreCase("doubleclick")) {
				a.contextClick(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void alert(String type,String value) {
		
		try {
			Alert a=driver.switchTo().alert();
			if(type.equalsIgnoreCase("normal"))
			{
				a.accept();
			}
			else if (type.equalsIgnoreCase("confirm"))
			{
				if(value.equalsIgnoreCase("accept"))
				{
				a.accept();
				}
				else if (value.equalsIgnoreCase("decline"))
				{
				a.dismiss();	
				}
			}
			else if (type.equalsIgnoreCase("prompt"))
			{
				a.sendKeys(value);
				a.accept();
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	public static void frames(String type,String value,WebElement element)
	{
			try {
				if(type.equalsIgnoreCase("id"))
				{
					driver.switchTo().frame(value);
				}
				else if(type.equalsIgnoreCase("webelement"))
				{
					driver.switchTo().frame(element);
				}
				else if(type.equalsIgnoreCase("index"))
				{
					int index= Integer.parseInt(value);
					driver.switchTo().frame(index);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	public static void defaultcontent()
	{
		driver.switchTo().defaultContent();
	}
	public static void window_Handling(String type) {
		try {
			String parent=driver.getWindowHandle();
			if(type.equalsIgnoreCase("multiple"))
			{
			Set<String> child=driver.getWindowHandles();
			for (String Childwindow : child) {
				driver.switchTo().window(Childwindow);
			}
			}
			else if(type.equalsIgnoreCase("parent"))
			{
				driver.switchTo().window(parent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clear(WebElement element) {
		element.click();
	}
	public static void sleep(int seconds) throws Throwable {
		Thread.sleep(seconds);
	}
	public static void implicit_Wait(int seconds,TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}
	//public static void explicit_Wait(int seconds,WebElement element) {
		//WebDriverWait w= new WebDriverWait(driver, seconds);
		//w.until(ExpectedConditions.visibilityOf(element));
	//}
	/*public static void fluent_wait(int timeoutseconds,int polling, Timeout format) {
		Wait w1= new FluentWait(driver).withTimeout(30,format).pollingEvery(10,format).ignoring(Exception.class);
	}*/
	public static void Screenshot(String path) throws Exception{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileHandler.copy(source, des);
	}
	public static void end(String type) {
		try {
			if(type.equalsIgnoreCase("close"))
			{
				driver.close();
			}
			else if (type.equalsIgnoreCase("quit"))
			{
				driver.quit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void navigate(String type, String value)
	{
		if(type.equalsIgnoreCase("to"))
		{
			driver.navigate().to(value);
		}
		else if (type.equalsIgnoreCase("back"))
		{
			
		driver.navigate().back();
		}
		else if (type.equalsIgnoreCase("forward"))
		{
			
		driver.navigate().forward();
		}
		else if(type.equalsIgnoreCase("refresh"))
		{
			driver.navigate().refresh();
		}
	}
	public static String particular_Cell_data(String path, int row_Index,int cell_Index) throws IOException
	{
		File f= new File(path);
		FileInputStream fp = new FileInputStream(f); 
		Workbook wb= new XSSFWorkbook(fp); //up casting
		Sheet s= wb.getSheetAt(0);
		Row r= s.getRow(row_Index);
		Cell c=r.getCell(cell_Index);
		CellType type=c.getCellType();
		if(type.equals(CellType.STRING))
		{
			value = c.getStringCellValue();
		}
		else if(type.equals(CellType.NUMERIC))
		{
			double num= c.getNumericCellValue();
			int val= (int) num;
			value=String.valueOf(val);
		}
		return value;
	}
	
	
	
	
}


