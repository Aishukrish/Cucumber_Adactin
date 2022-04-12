package com.sd;

import org.openqa.selenium.WebDriver;

import com.Configuration.helper.File_Reader_Manager;
import com.Test_Runner.Adactin_Test_Runner;
import com.base.Base_Class;
import com.helper.Page_object_Manager_Adactin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_def extends Base_Class{
	
	public static WebDriver driver = Adactin_Test_Runner.driver;
	
	public static Page_object_Manager_Adactin pom= new Page_object_Manager_Adactin(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		getUrl("https://adactin.com/HotelApp/index.php");
		
	}


@When("user Enter The {string} In Username Field")
public void user_enter_the_in_username_field(String Username) {
	
	inputValueElement(pom.get_instance_Hp().getUsername(), Username);
	
}
@When("user Enter The {string} In Password Field")
public void user_enter_the_in_password_field(String Password) {
	
	inputValueElement(pom.get_instance_Hp().getPassword(), Password);
	
}

	@Then("^user Click On the Login Button And It Navigate To The Search Hotel Page$")
	public void user_Click_On_the_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_instance_Hp().getLogin_btn());
	}

	@When("^user Enter The Hotel Location$")
	public void user_Enter_The_Hotel_Location() throws Throwable {
		dropdown("byText", pom.get_instance_Hs().getLocation(), "London");
	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		dropdown("byText", pom.get_instance_Hs().getHotel(), "Hotel Sunshine");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		dropdown("byValue", pom.get_instance_Hs().getRoom(), "Super Deluxe");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		dropdown("byIndex", pom.get_instance_Hs().getNo(), "2");
	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		dropdown("byText", pom.get_instance_Hs().getAdult(), "2 - Two");
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		dropdown("byIndex", pom.get_instance_Hs().getChild(),"0");
	}

	@Then("^User Click On The Search Button And It Navigate To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_instance_Hs().getSearch());
	}

	@When("^user Select The Radio Button$")
	public void user_Select_The_Radio_Button() throws Throwable {
		clickOnElement(pom.get_instance_Hs1().getSel());
		
	}

	@Then("^user Click On The Continue Button And It Navigate To The Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigate_To_The_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(pom.get_instance_Hs1().getCon());
	}

	@When("^user Entet The First Name$")
	public void user_Entet_The_First_Name() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getFname(), File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_firstname());
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getLname(), File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_lastname());
	    
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getAddress(),File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_address());	
	    
	}

	@When("^user Enter The Credit Card No$")
	public void user_Enter_The_Credit_Card_No() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getCard(),File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_ccnum());
		   
	}

	@When("^user Select The Credir Card Type$")
	public void user_Select_The_Credir_Card_Type() throws Throwable {
		dropdown("byText", pom.get_instance_Bp().getType(), "Master Card");
	}

	@When("^user Select The Expiry Month$")
	public void user_Select_The_Expiry_Month() throws Throwable {
		dropdown("byIndex", pom.get_instance_Bp().getExpiry(), "10");
	}

	@When("^user Select The Expiry Year$")
	public void user_Select_The_Expiry_Year() throws Throwable {
		dropdown("byValue",pom.get_instance_Bp().getYear(), "2022");
	}

	@When("^user Enter The CVV No$")
	public void user_Enter_The_CVV_No() throws Throwable {
		inputValueElement(pom.get_instance_Bp().getCvv(), File_Reader_Manager.get_Instance_frm().get_Instance_CR().get_Config_cvv());
	}

	@Then("^user Click On the Book Now Button And It Navigate To the Hotel Booking Confirmation Page$")
	public void user_Click_On_the_Book_Now_Button_And_It_Navigate_To_the_Hotel_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom.get_instance_Bp().getBook());
	    	    			  
	}

	@When("user Click On The Log Out Button And It Log Out Fron The Page")
	public void user_click_on_the_log_out_button_and_it_log_out_fron_the_page() {
		clickOnElement(pom.get_instance_lo().getLogout());
	}

}
