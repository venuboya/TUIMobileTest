package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Util.AppConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UserDetailsPage extends BasePage {
	
	public UserDetailsPage(AppiumDriver appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	@AndroidFindBy(xpath=AppConstants.USER_FIRST_NAME_TEXT)
	public WebElement userFirstNameText;
	
	public boolean verifyUserFirstName() {
		
		return userFirstNameText.isDisplayed();
	}

}
