package com.revature.sierra.alchemy.stepdefinition;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.revature.sierra.alchemy.page.examplePage;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"./src/test/java/resources/com/revature/sierra/alchemy/RateRestaurant.feature"}, glue={"com.revature.sierra.alchemy"}, tags="@RateRestaurant")
	public class list {
		static WebDriver driver;
		static examplePage page;
		
		@FindBy(id="example")// Restaurant List
		WebElement departmentId; // City
		
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

			
			page = new examplePage(driver);
		}
		
		@AfterAll
		public static void fin() {
			driver.close();
		}
	
@Given("User is at HomePage")
public void user_is_at_home_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
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
