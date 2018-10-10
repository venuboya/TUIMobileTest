package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Features/QaTestApp.feature",
				glue = {"Steps"},
				plugin = {"pretty", "json:target/cucumber.json", "html:target/site/cucumber-pretty"},
				monochrome = true,
				dryRun = false)
public class TestRunner {

	public void testRunner() {
		
	}

}
