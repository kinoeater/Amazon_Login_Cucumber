package pageObjects;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends BasePage{

	
	public @FindBy(xpath = "//span[text()='Hello. Sign in']") WebElement button_Sign_In;
	
	
	public Home_Page() throws IOException {
		super();
	}
	
	
	public Home_Page gettoHomePage() throws IOException {
		getDriver().get("https://www.amazon.com/");
		return new Home_Page();
	}
	public Home_Page clickOnSignInButton() throws Exception {
		waitAndClickElement(button_Sign_In);
		Thread.sleep(3000);	
		System.out.println(getDriver().getTitle());
	    return new Home_Page();
		
		
	}
	
}
