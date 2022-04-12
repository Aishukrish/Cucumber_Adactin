Feature: Hotel Booking In Adactin Application

Scenario Outline: Login Functionality

	Given user Launch The Application

	When user Enter The "<Username>" In Username Field

	And user Enter The "<Password>" In Password Field

	Then user Click On the Login Button And It Navigate To The Search Hotel Page

Examples:
|Username|Password|
|Aishu|12345|
|Aishuans|677425|

Scenario: Search Hotel Functionality

	When user Enter The Hotel Location

	And user Select The Hotels

	And user Select The Room Type

	And user Select The Number Of Rooms

	And user Select The Adults Per Room

	And user Select The Children Per Room	

	Then User Click On The Search Button And It Navigate To The Select Hotel Page


Scenario: Select Hotel Functionality

	When user Select The Radio Button

	Then user Click On The Continue Button And It Navigate To The Book A Hotel Page


Scenario: Book A Hotel Functionality

	When user Entet The First Name

	And user Enter The Last Name

	And user Enter The Billing Address 

	And user Enter The Credit Card No

	And user Select The Credir Card Type

	And user Select The Expiry Month

	And user Select The Expiry Year

	And user Enter The CVV No

	Then user Click On the Book Now Button And It Navigate To the Hotel Booking Confirmation Page
	
Scenario: Log Out Functionality

	When user Click On The Log Out Button And It Log Out Fron The Page







