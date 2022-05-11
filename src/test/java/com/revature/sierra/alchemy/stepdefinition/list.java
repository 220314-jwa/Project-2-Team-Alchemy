package com.revature.sierra.alchemy.stepdefinition;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/RateRestaurant.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@RateRestaurant")
	public class list {
		public static SetUp setUp;
		
		@BeforeAll
		public static void Setup() {
			setUp = new SetUp();
		}
	
	

		@When("User  search restaurant by city")
		public void user_search_restaurant_by_city() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		
		@Then("User should  able to see all the restaurant in that city")
		public void user_should_able_to_see_all_the_restaurant_in_that_city() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		
		@When("User search restaurant by zipcode")
		public void user_search_restaurant_by_zipcode() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		
		@Then("User should search restaurant by zipcode.")
		public void user_should_search_restaurant_by_zipcode() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}


}
