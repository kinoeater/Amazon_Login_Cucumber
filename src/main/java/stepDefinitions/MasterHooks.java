package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {
	
	@Before
	public void setup() {
		driver = getDriver();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		if(driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
			driver = null;
		}
	}

}