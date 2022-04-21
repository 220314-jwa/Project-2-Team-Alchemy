package com.revature.sierra.alchemy.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


/*
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/Login.feature",
 glue="stepDefinitions",
  tags="@Login")
*/
@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/Login.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@Login")
public class LoginFeatureTest {
	@Given("User arrives at sign in page")
	public void user_arrives_at_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Customer enters credentials in the username and password field")
	public void customer_enters_credentials_in_the_username_and_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The credentials are incorrect")
	public void the_credentials_are_incorrect() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user tries to reset their credentials")
	public void the_user_tries_to_reset_their_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Prompt user to enter the email they used to sign up")
	public void prompt_user_to_enter_the_email_they_used_to_sign_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
