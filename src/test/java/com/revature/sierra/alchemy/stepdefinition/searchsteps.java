package com.revature.sierra.alchemy.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/list.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@list")
public class searchsteps {
	@When("The user clicks on the {string} Tab")
	public void the_user_clicks_on_the_tab(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("A list of restaurants will show up.")
	public void a_list_of_restaurants_will_show_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks on {string} Tab")
	public void the_user_clicks_on_tab(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the Fastfood restaurant will show up.")
	public void the_fastfood_restaurant_will_show_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user is on Fastfood restaurant page")
	public void user_is_on_fastfood_restaurant_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user can see {string} Page")
	public void user_can_see_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
