package Util;

import org.openqa.selenium.By;


import driverFactory.DriverBase;


public class MyUtils extends DriverBase {
	
	
	public boolean textvalidate(String diseredtext, String locators) {
	
		String expectation = diseredtext;
		String actual = driver.findElement(By.xpath(locators)).getText();
		if(expectation.equalsIgnoreCase(actual))
		{
			System.out.println("Test Passed ");
			return true;
		}
		else{
			System.out.println("you are an idiot ");
			return false;
		}

	}
	
	
	
	public boolean textnotvalidate(String diseredtext, String locators) {
		
		try {
			  
			String expectation = diseredtext;
			String actual = driver.findElement(By.xpath(locators)).getText();
			if(expectation.equalsIgnoreCase(actual)){
				System.out.println("Test Passed ");
				return false;
			}
			else{
				System.out.println("Test Failed ");
				return true;
			}
		}
	catch (Exception e) {
		
		return false;			
		}
		
	}
	
	
	
	public static void Wait(int milisecond) {
		try {
			Thread.sleep(milisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public  void ApplicationClose() {
		driver.close();
	}

	

}
