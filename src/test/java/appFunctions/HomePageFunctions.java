package appFunctions;

import org.openqa.selenium.By;

import Util.MyUtils;
import driverFactory.DriverBase;
import xPathLocators.HomePageXpath;



public class HomePageFunctions extends DriverBase {
	
	

	MyUtils util = new MyUtils();
	HomePageXpath xpath = new HomePageXpath();
	
	
	public void validateSearch(String diseredtext, String locators) {
		
		util.textvalidate(diseredtext, locators);
	}
	
	public void LoginLink() {
		driver.findElement(By.xpath(xpath.LoginLink)).click();
	}
	
	public void validateUser(String diseredtext, String locators) {
		
		util.textvalidate(diseredtext, locators);
	}
	
	public void signUp() {
		driver.findElement(By.xpath(xpath.signupButton)).click();
	}
	
	
	
}
