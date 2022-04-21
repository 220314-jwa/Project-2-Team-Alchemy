package com.revature.sierra.alchemy.stepdefinition;

import org.junit.runner.RunWith;
import org.springframework.web.bind.annotation.RestController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RestController 
@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/example/restaurant/restaurant/login.feature"}, glue={"com.example.restaurant.restaurant"}, tags="@tag")
public class LogInFeatureTest {
	@Given("user arrives at the homepage")
	public void user_arrives_at_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on member sign on button")
	public void user_clicks_on_member_sign_on_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
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
	    throw new io.cucumber.java.PendingException();
	}

	@Then("sign in fails and asks user to retry credentials")
	public void sign_in_fails_and_asks_user_to_retry_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
