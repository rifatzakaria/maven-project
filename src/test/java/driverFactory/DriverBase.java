package driverFactory;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DriverBase {
	

	public static  WebDriver driver;

	public void remoteLauncher(String browserType, String ScenarioName) {
		
		String sauceId = "zakaria87";
		String sauceAccessKey = "690aeaf8-178b-43e8-a3db-237cd7f1c541";
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,browserType);
		capabilities.setCapability(CapabilityType.VERSION,"75");
		capabilities.setCapability(CapabilityType.PLATFORM,"Windows 10");
		capabilities.setCapability("screenResolution", "1400x1050");
		capabilities.setCapability("name",ScenarioName);
		
		 try {
			driver = new RemoteWebDriver(new URL("https://" +sauceId+ ":" +sauceAccessKey+ "@ondemand.saucelabs.com:443/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}



		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zrifa\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
//		
//		if (browserType.equalsIgnoreCase("chrome"))
//		{
//			driver = new ChromeDriver();
//			driver.navigate().to("http://www.google.com");
//			driver.manage().window().maximize();
//		}
//		else if(browserType.equals("firefox")) 
//		{
//			driver = new FirefoxDriver();
//			driver.navigate().to("http://www.google.com");
//			driver.manage().window().maximize();
//		} 
//		else if(browserType.equals("ie"))
//			driver = new InternetExplorerDriver();
//			driver.navigate().to("http://www.google.com");
//			driver.manage().window().maximize();
//		}
//		else {
//			System.out.println("Not A valid Driver !!!!");
//		}
//
	


	}

}
