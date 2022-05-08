package com.revature.sierra.alchemy.page;

import org.openqa.selenium.WebDriver;

public class PageController {

	public HomePage homePage;
	public LoginPage loginPage;
	public RestaurantPage restaurantPage;
	public SignUpPage signUpPage;
	
	public PageController(WebDriver driver){
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		restaurantPage = new RestaurantPage(driver);
		signUpPage = new SignUpPage(driver);
	}
}
