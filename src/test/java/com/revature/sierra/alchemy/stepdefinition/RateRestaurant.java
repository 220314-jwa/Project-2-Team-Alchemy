package com.revature.sierra.alchemy.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.revature.sierra.alchemy.page.examplePage;

import java.io.File;
import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 *  important links: https://chromedriver.chromium.org/downloads
 * 
 * 	@BeforeAll - annotation that tells cucumber to run the method, befores
 *  everything else.
 *  	-Use to set up webdriver
 *  	-Set up any initial variables/ constants
 * 
 * 		POM structure, Page Object Model
 * 			selenium imports:
 * 			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
		POM 
 */


@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/RateRestaurant.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@RateRestaurant")
public class RateRestaurant {
	static WebDriver driver;
	static examplePage page;
	
	@FindBy(id="example")
	WebElement departmentId;
	
	@BeforeAll
	public static void Setup() {
		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());//Environmental variable
		driver = new ChromeDriver(); //default to find environmental variable 

		WebElement example = driver.findElement(By.id("example"));
		example.click();
		
		WebElement selectElement = driver.findElement(By.id("selectelement"));
		WebElement option = driver.findElement(By.id("option"));
		WebElement input = driver.findElement(By.id("input"));
		String a = "a";
		input.sendKeys(":)");
		input.sendKeys(a);
		driver.get("www.google.com");
		
		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(2)) //Final Duraction of the wait
				.pollingEvery(Duration.ofMillis(500)); // Interval that the wait calls the specified method
		fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("logInBtn")));
		
		
		Wait<WebDriver> exampleWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(1));
		exampleWait.until(ExpectedConditions.elementToBeClickable(By.id("exampleBtn")));
		exampleWait.until(ExpectedConditions.alertIsPresent());
		exampleWait.until(ExpectedConditions.elementToBeSelected(By.id("exampleBtn")));
		exampleWait.until(ExpectedConditions.presenceOfElementLocated(By.id("exampleBtn")));



		
		page = new examplePage(driver);
	}
	
	@AfterAll
	public static void fin() {
		driver.close();
	}
	
	@Given("the user is {string}")
	public void the_user_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    page.clickAnButton(string);
	}
	
	
	@Given("the user is homepage")
	public void the_user_is_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		page.clickAnButton("homepage");
	}

	@Given("given the user wrote a review")
	public void given_the_user_wrote_a_review() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks on a star rating")
	public void the_user_clicks_on_a_star_rating() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks submit")
	public void the_user_clicks_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user will be send to a restaurant page")
	public void the_user_will_be_send_to_a_restaurant_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is already signed in on the app")
	public void the_user_is_already_signed_in_on_the_app() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user wants to leave a review on a restaurant")
	public void the_user_wants_to_leave_a_review_on_a_restaurant() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on the search button and types in name of restaurant")
	public void the_user_clicks_on_the_search_button_and_types_in_name_of_restaurant() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The customer selects the restaurant and navigates to their ratings tab")
	public void the_customer_selects_the_restaurant_and_navigates_to_their_ratings_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user clicks the text box to write a review")
	public void the_user_clicks_the_text_box_to_write_a_review() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user selects number of stars")
	public void the_user_selects_number_of_stars() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("writes a review")
	public void writes_a_review() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
