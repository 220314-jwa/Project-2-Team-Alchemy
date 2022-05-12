package com.revature.sierra.alchemy.stepdefinition;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.web.bind.annotation.RestController;

import com.revature.sierra.alchemy.page.SignUpPage;
import com.revature.sierra.alchemy.page.HomePage;
import com.revature.sierra.alchemy.page.PageController;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/SignUp.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@Signup")
public class SignUpFeatureTest {
	
	public static SetUp setUp;

	@BeforeAll
	public static void Setup() {
		setUp = new SetUp();
	}
	
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		assertTrue(setUp.pageController.homePage.getHomePagetitle() == "home");
	}

	@When("user clicks on member sign up link")
	public void user_clicks_on_member_sign_up_link() {
	  setUp.pageController.homePage.clickSignUp();
	}
	
	@Then("user lands on signup page")
	public void user_lands_on_signup_page() {
		assertTrue(setUp.pageController.signUpPage.getSignUpPagetitle() == "signUp");
	}

	@And("user inputs {string) on firstname text field")
	public void user_inputs_on_firstname_text_field(String string) {
		setUp.pageController.signUpPage.inputIntoFirstName(string);
	}
	
	
	@And("user inputs {string) on lastname text field")
	public void user_inputs_on_lastname_text_field(String string) {
		setUp.pageController.signUpPage.inputIntoLastName(string);
	}
	
	
	@And("user inputs {string) on email text field")
	public void user_inputs_on_email_text_field(String string) {
		setUp.pageController.signUpPage.inputIntoEmail(string);
	}
	
	@And("user inputs {string) on password text field")
	public void user_inputs_on_password_text_field(String string) {
		setUp.pageController.signUpPage.inputIntoPassword(string);
	}
	
	
	@And("user clicks submit button")
	public void user_clicks_submit_button() {
		setUp.pageController.signUpPage.clickSubmit();
	}
	
	@Then("user should be able to signup successfully")
	public void user_should_be_able_to_signup_successfully() {
		//not yet completed
	}
	
}
