package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Util.AppConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CategoryInfoPage extends BasePage {
	
	public CategoryInfoPage(AppiumDriver appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	@AndroidFindBy(className=AppConstants.CATEGORY_INFO)
	public WebElement categoryInfo;
	
	
	public boolean verifyCategoryTextIsPresent() {
		
		return categoryInfo.isDisplayed();
	}

}
