package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.StdRegForm;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class FormStepDef {
	
	WebDriver driver;
	StdRegForm regForm;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}	
	
	/*
	 * @After public void teardown() { if(driver != null) { driver.quit(); } }
	 */
	
	@Given("I am on DEMOQA site")
	public void i_am_on_demoqa_site() {
		
		driver.get("https://demoqa.com/automation-practice-form");
		regForm = new StdRegForm(driver);
	}

	@Given("I Enter all default values in the form")
	public void i_enter_all_default_values_in_the_form() {
	    regForm.enterFName();
	    regForm.enterLName();
	    regForm.enterEmail();
	    regForm.selectGender();
	    regForm.entermobileNumber();
	}

	@When("I click on submit")
	public void i_click_on_submit() {
		regForm.submit();
	}

	@Then("a window appears with {string} message")
	public void a_window_appears_with_message(String string) {
	    assertEquals(string, regForm.verifyMessage());
	}

}
