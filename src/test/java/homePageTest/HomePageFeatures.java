
package homePageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import Util.MyUtils;
import appFunctions.HomePageFunctions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverFactory.DriverBase;
import xPathLocators.HomePageXpath;
import xPathLocators.RegistrationPageXpath;



public class HomePageFeatures extends DriverBase {

	HomePageFunctions home = new HomePageFunctions();
	RegistrationPageXpath xPath1 = new RegistrationPageXpath();
    HomePageXpath xPath = new HomePageXpath();
	MyUtils util = new MyUtils();
	RegistrationPageXpath reg = new RegistrationPageXpath();
	String User = "akm000000";

	public String ScenarioName;

	
	
	@Given("i open browser {string}")
	public void i_open_browser(String browser, String ScenarioName) {
		
		remoteLauncher(browser, ScenarioName);
		//util.wait(3000);
	}

	@And("i go to {string}")
	public void i_go_to(String URL) {

	driver.navigate().to(URL);

	}
	
	
	
	@Then("i see text box {string}")
	public void i_see_text_box(String desiredtext) {
		home.validateSearch(desiredtext, xPath.searchTextBox);
		
		driver.quit();
	}
	
	
	
	
	@When("i click logIn button")
	public void i_click_logIn_button() {
		driver.findElement(By.xpath(xPath.LoginLink)).click();

	}
	
	@And("i click signUp button")
	public void i_click_signUp_button() {
		driver.findElement(By.xpath(xPath.signupButton)).click();
	}

	

	@And("i enter user info")
	public void i_enter_user_info() {
		driver.findElement(By.xpath(xPath1.emailTextBox)).sendKeys(User + "@gmail.com");
		driver.findElement(By.xpath(xPath1.usernameTextBox)).sendKeys(User);

		driver.findElement(By.xpath(xPath1.registrationPasswordTextBox)).sendKeys("password");
		driver.findElement(By.xpath(xPath1.confirmPasswordTextBox)).sendKeys("password");
		driver.findElement(By.xpath(xPath1.firstNameTextBox)).sendKeys("Mr. ");
		driver.findElement(By.xpath(xPath1.lastnameTextBox)).sendKeys("AKM");
		driver.findElement(By.xpath(xPath1.addressTextBox)).sendKeys("1231 fith ave");

		
	}

	@And("i click CREATE ACCOUNT")
	public void i_click_CREATE_ACCOUNT() {
		driver.findElement(By.xpath(xPath1.createAccountButton)).click();

	}

	
	/**  Cucumber Hooks */

	@Before
	public void beforeAll(Scenario scenario) {
		
		ScenarioName = scenario.getName();
	}


	@After
	public void after(Scenario scenario) {

		if (scenario.isFailed()) {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.out.println("Error Taking Ecreen Shot");
			}
			((JavascriptExecutor) driver).executeScript("sauce:job-result=" + "failed");
			//driver.close();
		} else {
			((JavascriptExecutor) driver).executeScript("sauce:job-result=" + "passed");
			//driver.close();
		}
	}

	
	
	
}
