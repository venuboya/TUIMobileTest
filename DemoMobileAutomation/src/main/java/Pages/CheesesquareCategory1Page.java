package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;
import Util.AppConstants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheesesquareCategory1Page extends BasePage{
	
	
	public CheesesquareCategory1Page(AppiumDriver appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	

	@AndroidFindBy(xpath=AppConstants.CATEGORY1)
	public WebElement category1;
	
	@AndroidFindBy(id=AppConstants.CATEGORY_ITEMS)
	public WebElement categoryItems;
	
	@AndroidFindBy(id=AppConstants.FIRST_CATEGORY_ITEM)
	public WebElement firstCategoryItem;
	
	
	@AndroidFindBy(uiAutomator="UiScrollable(UiSelector().className(\"android.widget.ScrollView\")).scrollIntoView(UiSelector().textContains(\"Info\"))")
	public WebElement scrollToInfoText;

	
    public void selectCategory1() {
			
	    	category1.click();
	    	List<WebElement> firstCategoryItem = categoryItems.findElements(By.id(AppConstants.FIRST_CATEGORY_ITEM));
	    	firstCategoryItem.get(0).click();
	    	scrollToInfoText.click();
	    	
	    }

	}

