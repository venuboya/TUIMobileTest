package Steps;

import org.junit.Assert;

import Base.BasePage;
import Pages.CategoryInfoPage;
import Pages.CheesesquareCategory1Page;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CheesesquareCategory1Steps extends BasePage {
	
	@Given("^user launches cheesesquare app$")
	public void user_launches_cheesesquare_app(){
	   
		initialization();
	}
	
	@And("^select category1$")
	public void select_category1(){
	   
		CheesesquareCategory1Page cheesesqrCtg = new CheesesquareCategory1Page(appiumDriver);
		cheesesqrCtg.selectCategory1();
	}

	@Then("^verify category1 item is present$")
	public void verify_category1_item_is_present(){
		
		CategoryInfoPage category1Info = new CategoryInfoPage(appiumDriver);
		boolean category1ItemText = category1Info.verifyCategoryTextIsPresent();
		Assert.assertTrue("Element is not present", category1ItemText);
	}
	
	@After
	public void tearDown() {
		
		if(appiumDriver != null)
			appiumDriver.quit();
	}

}
