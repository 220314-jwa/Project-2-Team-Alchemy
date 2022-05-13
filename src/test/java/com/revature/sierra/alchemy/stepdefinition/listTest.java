package com.revature.sierra.alchemy.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.RestController;

import com.revature.sierra.alchemy.page.*;
import com.revature.sierra.alchemy.page.PageController;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/HomePage.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@HomePage")
public class HomeFeatureTest {
	
	public static SetUp setUp;

	@BeforeAll
	public static void Setup() {
		setUp = new SetUp();
	}
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	   assertTrue(setUp.pageController.homePage.getHomePagetitle() == "home");
	}
	
	
	@When("User clicks on home link")
	public void user_clicks_on_home_link(String string) {
	   setUp.pageController.homePage.clickHome();
	}
	
	
	@Then("User lands on home page")
	public void user_lands_on_home_page() {
	   assertTrue(setUp.pageController.homePage.getHomePagetitle() == "home");
	}
	
	
	@When("User clicks on restaurant link")
	public void user_clicks_on_restaurant_link() {
		setUp.pageController.homePage.clickRestaurant();	
	}
	
	
	@Then("User lands on restaurant page")
	public void user_lands_on_restaurant_page() {
	   assertTrue(setUp.pageController.restaurantPage.getRestaurantPagetitle() == "restaurant-list");
	}
	

	@When("User clicks on login link")
	public void user_clicks_on_login_link() {
		setUp.pageController.homePage.clickLogin();
	}
	
	
	@Then("User lands on login page")
	public void user_lands_on_login_page() {
	   assertTrue(setUp.pageController.loginPage.getLoginPagetitle() == "login");
	}
	
	
	@When("User clicks on signup link")
	public void user_clicks_on_signup_link() {
		setUp.pageController.homePage.clickSignUp();
	}
	
	
	@Then("User lands on signup page")
	public void user_lands_on_signup_page() {
	   assertTrue(setUp.pageController.signUpPage.getSignUpPagetitle() == "signUp");
	}
	
	
	
}
