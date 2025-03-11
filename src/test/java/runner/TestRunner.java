package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Resources/Features",
				glue = {"src/test/java/StepDefinitions"},
				plugin = {"pretty", "html:target/cucumber-reports"},
				monochrome = true					
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel = true)
	public Object[][] scennario() {
		return super.scenarios();
	}

}
