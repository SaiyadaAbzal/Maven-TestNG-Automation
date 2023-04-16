package Salesforce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Salesforce.Base.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	
	}

	@FindBy (id="username")
	WebElement Username;
	
	@FindBy (id="password")
	WebElement Password;
	
	@FindBy (id="Login")
	WebElement loginbutton;
		
	@FindBy(id="rememberUn")
	WebElement rememberme;
	
	@FindBy(id="userNavLabel")
	WebElement usermenu;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;

	@FindBy(id="idcard-identity")
	WebElement chkUsername;
	
	@FindBy(id="forgot_password_link")
	WebElement forgotpassword;
	
	@FindBy(id="un")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement Continuebutton;
	
	@FindBy(id="error")
	WebElement Error;
	
	
	
	public void enterUsername(String username) {
		Username.sendKeys(username);
		}
	
	public void clearPasswordField(){
		Password.clear();
		}
	public void clickloginbutton() {
		loginbutton.click();
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	public void RememberMe() {
		rememberme.click();
	}
	public void Usermenu() {
		usermenu.click();
	}
	public void Logout() {
		logout.click();
	}
	public void errormsg1() {
		String ErrorMessage = Error.getText();
		String ExpectedError = "Please enter your password.";
		comparetext(ErrorMessage,ExpectedError);
		//System.out.println(ErrorMessage);
	}
	public void CheckUsername() throws InterruptedException {
		Thread.sleep(5000);
		String text = chkUsername.getText();
		String ExpectedText = "saiyada@tekarch.com";
		comparetext(text,ExpectedText);
		System.out.println("Expected: "+ExpectedText+"\n Actual: " +text);
	}
	public void ForgotPassword() throws InterruptedException {
		forgotpassword.click();
		Thread.sleep(5000);
		//waitforvisibility(10,driver);
		username.sendKeys("saiyada@tekarch.com");
		Continuebutton.click();
	}
	
	public void errormsg() {
		String ErrorMessage = Error.getText();
		String ExpectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		comparetext(ErrorMessage,ExpectedError);
		//System.out.println(ErrorMessage);
	}

	
}
