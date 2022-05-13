package com.revature.sierra.alchemy.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.time.Duration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.revature.sierra.alchemy.page.*;

/*
 *  important links: https://chromedriver.chromium.org/downloads
 * 
 * 	@BeforeAll - annotation that tells cucumber to run the method, before
 *  everything else.
 *  	-Use to set up webdriver
 *  	-Set up any initial variables/ constants
 * 		POM structure, Page Object Model
 * 	 */


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"./src/test/java/resources/com/revature/sierra/alchemy/Restaurant.feature"}, 
		glue={"com.revature.sierra.alchemy"},
		tags="@RateRestaurant")

public class RestaurantTest {
	public static SetUp setUp;
	
	@BeforeAll
	public static void Setup() {
		setUp = new SetUp();
	}
	
	@Given("the user is at {string} page")
public void the_user_is_at_page(String string) {
		assertTrue(setUp.pageController.restaurantPage.getRestaurantPagetitle() == "restaurant-list");
}

@Given("user inputs {string} on restaurant text field")
public void user_inputs_on_restaurant_text_field(String string) {
	setUp.pageController.restaurantPage.InputtoSearchTab(string);
	
}

@When("user clicks on the {string} tab")
public void user_clicks_on_the_tab(String string) {
	setUp.pageController.restaurantPage.clickSearch();
	
}

@Then("user should able to see the {string} below.")
public void user_should_able_to_see_the_restaurantname_below(String string) {
	assertTrue(setUp.pageController.restaurantPage.checkifRestaurantDisplayed(string));
}

@Given("the user is at {string} tab")
public void the_user_is_at_tab(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user clicks on write a review button")
public void the_user_clicks_on_writeReview_button() {
	setUp.pageController.restaurantPage.ClickWriteReview();
}

@Given("the user clicks on {string}")
public void the_user_clicks_on(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user inputs the review in text area")
public void the_user_inputs_the_review_in_text_area() {
	String reviewtext = "Sample Test Review";
	setUp.pageController.restaurantPage.EnterReview(reviewtext);
}
	

//@Given("the user clicks submit")
//public void the_user_clicks_submit() {
//	setUp.pageController.restaurantPage.ClickSubmitReview();
//}

@Then("the app submits the review")
public void the_app_submits_the_review() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("the app updates the restaurant review")
public void the_app_updates_the_restaurant_review() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user is {string}")
public void the_user_is(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("the user wrote a review")
public void the_user_wrote_a_review() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("the user clicks on a star rating")
public void the_user_clicks_on_a_star_rating() {
   
}

@When("the user clicks submit")
public void the_user_clicks_submit() {
	setUp.pageController.restaurantPage.ClickSubmitReview();
}

@Then("the app show the restaurant page")
public void the_app_show_the_restaurant_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}