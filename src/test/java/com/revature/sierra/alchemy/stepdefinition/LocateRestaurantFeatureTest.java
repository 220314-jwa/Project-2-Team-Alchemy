package com.revature.sierra.alchemy.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/LocateRestaurant.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@LocateRestaurant")
public class LocateRestaurantFeatureTest {
	@Given("the user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks on the {string}")
	public void the_user_clicks_on_the(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("information of the restaurant will pop out")
	public void information_of_the_restaurant_will_pop_out() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("information of the selected restaurant pops up")
	public void information_of_the_selected_restaurant_pops_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user clicks on the restaurant address")
	public void the_user_clicks_on_the_restaurant_address() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the application will show the restaurant on a map")
	public void the_application_will_show_the_restaurant_on_a_map() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
