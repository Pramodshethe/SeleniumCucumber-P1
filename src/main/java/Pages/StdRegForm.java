package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class StdRegForm {
	
	WebDriver driver;
	
	private By fname = By.id("firstName");
	private By lname = By.id("lastName");
	private By email = By.id("userEmail");
	private By mobileNo = By.id("userNumber");	
	private By submitbtn = By.id("submit");
	private By gender = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label");
	private By message =  By.id("example-modal-sizes-title-lg");
			
	public StdRegForm(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterFName() {
		WebElement fnametxt = driver.findElement(fname);
		fnametxt.sendKeys("Texo");
	}
	
	public void enterLName() {
		WebElement lnametxt = driver.findElement(lname);
		lnametxt.sendKeys("Neo");
	}
	
	public void enterEmail() {
		WebElement emailtxt = driver.findElement(email);
		emailtxt.sendKeys("Texo@gmail.com");
	}
	
	public void entermobileNumber() {
		WebElement mobilenumber = driver.findElement(mobileNo);
		mobilenumber.sendKeys("9987874009");
	}
	
	public void selectGender() {
		WebElement genderRadiobtn = driver.findElement(gender);
		genderRadiobtn.click();
	}
	
	public void submit() {
		WebElement submitbutton = driver.findElement(submitbtn);
		submitbutton.click();
	}
	public String verifyMessage() {
		
		Wait<WebDriver> wait = new FluentWait<>(driver)
			    .withTimeout(Duration.ofSeconds(30));
			    
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(message));	   
		
		//return driver.findElement(message).getText();
		return element.getText();
	}
	
}
