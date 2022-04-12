package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Booking_page;
import com.pom.Home_page;
import com.pom.Hotel_Searchpage;
import com.pom.Hotel_Selectpage;
import com.pom.Log_out;

public class Page_object_Manager_Adactin {
	public WebDriver driver;
	private Home_page hp;
	private Hotel_Searchpage hs;
	private Hotel_Selectpage hs1;
	private Booking_page bp;
	private Log_out lo;
	public Page_object_Manager_Adactin(WebDriver driver2)
	{
		this.driver=driver2;
	}
	public Home_page get_instance_Hp() 
	{
		if(hp==null)
		{
			hp=new Home_page(driver);
		}
		return hp;
	}
	public Hotel_Searchpage get_instance_Hs()
	{
		if(hs==null)
		{
			hs=new Hotel_Searchpage(driver);
		}
		
		return hs;
	}
	public Hotel_Selectpage get_instance_Hs1()
	{
		if(hs1==null)
		{
			hs1=new Hotel_Selectpage(driver);
		}
		
		return hs1;
	}
	public Booking_page get_instance_Bp() {
		if(bp==null)
		{
			bp=new Booking_page(driver);
		}
		
		return bp;
	}
	public Log_out get_instance_lo() {
		if(lo==null)
		{
			lo=new Log_out(driver);
		}
		
		return lo;
	}
	

}
