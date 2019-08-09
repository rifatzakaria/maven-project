package appFunctions;

import org.openqa.selenium.By;

import driverFactory.DriverBase;
import xPathLocators.RegistrationPageXpath;

public class RegistrasionFunctions extends DriverBase{
	
	RegistrationPageXpath xpath = new RegistrationPageXpath();
	
	public void inputEmail(String email) {
		driver.findElement(By.xpath(xpath.emailTextBox)).sendKeys(email);
	}

	public void inputUserName(String username) {
		driver.findElement(By.xpath(xpath.usernameTextBox)).sendKeys(username);
	}

	public void inputpassword(String password) {
		driver.findElement(By.xpath(xpath.registrationPasswordTextBox)).sendKeys(password);
	}

	public void inputinputConfirmPassword(String confirmpassword) {
		driver.findElement(By.xpath(xpath.confirmPasswordTextBox)).sendKeys(confirmpassword);
	}
	public void inputFirstname(String fname) {
		driver.findElement(By.xpath(xpath.firstNameTextBox)).sendKeys(fname);
	}
	public void inputLastName(String lname) {
		driver.findElement(By.xpath(xpath.lastnameTextBox)).sendKeys(lname);
	}
	public void inputAddress(String address) {
		driver.findElement(By.xpath(xpath.addressTextBox)).sendKeys(address);
	}
	public void createAccount() {
		driver.findElement(By.xpath(xpath.createAccountButton)).click();
	}

}
