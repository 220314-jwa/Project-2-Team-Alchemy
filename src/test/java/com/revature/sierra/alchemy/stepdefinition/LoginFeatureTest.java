package com.revature.sierra.alchemy.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.RestController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/Login.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@Login")
public class LoginFeatureTest {
	
	public static SetUp setUp;
	
	@BeforeAll
	public static void Setup() {
		setUp = new SetUp();
	}
	
	
	
	@Given("user arrives at the homepage")
	public void user_arrives_at_the_homepage() {
		setUp.pageController.homePage.clickHome();
	}

	@When("user clicks on member sign on button")
	public void user_clicks_on_member_sign_on_button() {
	    // We are going to Login Page
		setUp.pageController.homePage.clickLogIn();
	}

	@When("user inputs {string} on username text field")
	public void user_inputs_on_username_text_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user inputs {string} on password text field")
	public void user_inputs_on_password_text_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks Enter button")
	public void user_clicks_enter_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is given access to member services of the app")
	public void user_is_given_access_to_member_services_of_the_app() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is alerted that user is signed in")
	public void user_is_alerted_that_user_is_signed_in() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(Integer.parseInt(setUp.pageController.loginPage.getLoginSession()) > 0);
	}

	@Then("sign in fails and asks user to retry credentials")
	public void sign_in_fails_and_asks_user_to_retry_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
