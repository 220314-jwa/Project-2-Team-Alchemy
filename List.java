package com.revature.sierra.alchemy.stepdefinition;

import org.junit.runner.RunWith;

import com.revature.sierra.alchemy.page.PageController;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/List.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@list")

public class List {
	
	public static SetUp setUp;
	
	@BeforeAll
	public static void Setup() {
		setUp = new SetUp();
	}
	
	@Given("User is on restaurant page")
	public void user_arives_at_restaurantPage() {
		PageController.restaurantPage.clickRestaurant();
	}
	
	@And("the user clicks a restaurant card")
	public void user_clicks_on_restaurant_card() {
		PageController.restaurantPage.clickRestaurantIteam();
	}
	
	@Then("the restaurant info sheet is displayed")
	public void restaurant_info_sheet_is_displayed() {
		
	}
}
