package pageObjects;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BasePage{
	
	public @FindBy(id ="ap_email") WebElement textfield_EmailAddress;
	public @FindBy(id ="ap_password") WebElement textfield_Password;
	public @FindBy(id = "signInSubmit") WebElement button_Submit;
	public @FindBy(id="auth-mfa-otpcode") WebElement auth_code_input;
	public @FindBy(xpath="//*[@id='auth-mfa-form']/div/div/h1") WebElement twoStepVerification;
	public @FindBy(id="createAccountSubmit") WebElement createAccountSubmit_button;

	public @FindBy(xpath="	//*[@id='nav-link-accountList']/span[1]") WebElement Hello_message;
	
	
	
	public Login_Page() throws IOException {
		super();
	}
	
	
	public Login_Page getPageTitle() throws IOException {
		
		
		return new Login_Page();
		
		
	}
	
	
	
	public Login_Page enterEmailAddress(String emailAddress) throws Exception {
		Thread.sleep(3000);
		sendKeysToWebElement(textfield_EmailAddress, emailAddress);
		return new Login_Page();
	}
	
	public Login_Page enterPassword(String password) throws Exception {
		sendKeysToWebElement(textfield_Password, password);
		return new Login_Page();
	}
	
	
	
	public Login_Page clickOnSubmiButton() throws Exception {
		waitAndClickElement(button_Submit);
		return new Login_Page();
	}
	
	public void confirmLoginWasSuccessful() throws Exception {
		

//		WaitUntilWebElementIsVisible(twoStepVerification);
//		Assert.assertEquals("Two-Step Verification", twoStepVerification.getText());
	
		WaitUntilWebElementIsVisible(Hello_message);
		Assert.assertEquals("Hello, Mustafa", Hello_message.getText());

	
		
	}
	
public void confirmLoginWasNotSuccessful() throws Exception {
		

		WaitUntilWebElementIsVisible(createAccountSubmit_button);
		Assert.assertEquals("Create your Amazon account", createAccountSubmit_button.getText());
	
		
	}

}
