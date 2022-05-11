package com.revature.sierra.alchemy.page;

import org.openqa.selenium.WebDriver;

public class PageController {

	public static HomePage homePage;
	public static LoginPage loginPage;
	public static RestaurantPage restaurantPage;
	public static SignUpPage signUpPage;
	
	public PageController(WebDriver driver){
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		restaurantPage = new RestaurantPage(driver);
		signUpPage = new SignUpPage(driver);
	}
}
