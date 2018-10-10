package Steps;

import Base.BasePage;
import Pages.LoginPage;
import Pages.UserDetailsPage;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;



public class LoginSteps extends BasePage{
	
	
	@Given("^user launches QaTestApp$")
	public void user_launches_QaTestApp() throws InterruptedException {
	    
		initialization();
	}

	@And("^enters \"([^\"]*)\" and \"([^\"]*)\" to login$")
	public void enters_firstName_and_lastName_to_login(String firstName, String lastName) {
	    
		LoginPage loginPage = new LoginPage(appiumDriver);
		loginPage.enterFirstNameAndLastNameToLogin(firstName , lastName);
	}

	@Then("^verify user firstName is present$")
	public void verify_user_firstName_is_present() {
	    
		UserDetailsPage userDetailsPage = new UserDetailsPage(appiumDriver);
		boolean userFirstName = userDetailsPage.verifyUserFirstName();
		Assert.assertTrue("Element is not present", userFirstName);	
	
	}
	
	@After
	public void tearDown() {
		
		if(appiumDriver != null)
			appiumDriver.quit();
	}
	
	
}
