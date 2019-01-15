package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;


import pageObjects.Home_Page;
import pageObjects.Login_Page;


public class DriverFactory {
	public static WebDriver driver;
	public static Home_Page homePage;
	public static Login_Page loginPage;
	
	public WebDriver getDriver() {
		try {
			// Read Config
			ReadConfigFile file = new ReadConfigFile();
			String browserName = file.getBrowser();

			switch (browserName) {

			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				// code
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
//					ChromeOptions options = new ChromeOptions();
//					options.addArguments("--user-data-dir=C:\\AnyFolder");
//					driver = new ChromeDriver(options);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			homePage = PageFactory.initElements(driver, Home_Page.class);
			loginPage = PageFactory.initElements(driver, Login_Page.class);
					
		}
		return driver;
	}
}
