package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {
	WebDriver driver;
	
	
	 @Given("^I am a user of amazon.com$")
	    public void i_am_a_user_of_amazoncom() throws Throwable {
	 
		homePage.gettoHomePage();
		homePage.clickOnSignInButton();

 
	    }

    @When("^I log in using valid credentials$")
	    public void i_log_in_using_valid_credentials() throws Throwable {

    	
    	loginPage.enterEmailAddress("yolmustafa@gmail.com");  // created for testing purposes
    	loginPage.enterPassword("&6Mu2tafa");                 // created for testing purposes
    	loginPage.clickOnSubmiButton();
    	
	    }

    @Then("^I should be logged in$")
	    public void i_should_be_logged_in() throws Throwable {
    	
    	loginPage.confirmLoginWasSuccessful();
	       
	    }
    
    @When("^I log in using invalid credentials$")
    public void i_log_in_using_invalid_credentials() throws Throwable {
  
    	loginPage.enterEmailAddress("yolmustafa@gmail.com");   // created for testing purposes
    	loginPage.enterPassword("eeeee");
    	loginPage.clickOnSubmiButton();
    }

    @Then("^I should not be logged in$")
    public void i_should_not_be_logged_in() throws Throwable {
   
    	loginPage.confirmLoginWasNotSuccessful();
    
    	}
}
