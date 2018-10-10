package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Util.AppConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BasePage {
	
	public LoginPage(AppiumDriver appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	@AndroidFindBy(xpath=AppConstants.FIRST_NAME_FIELD)
	public WebElement firstNameField;
	
	@AndroidFindBy(xpath=AppConstants.LAST_NAME_FIELD)
	public WebElement lastNameField;
	
	@AndroidFindBy(xpath=AppConstants.SUBMIT_BUTTON)
	public WebElement submitButton;
	
	
	public void enterFirstNameAndLastNameToLogin(String firstName, String lastName) {
		
		firstNameField.click();
		firstNameField.sendKeys(firstName);
		lastNameField.click();
		lastNameField.sendKeys(lastName);
		submitButton.click();
		
	}

}
