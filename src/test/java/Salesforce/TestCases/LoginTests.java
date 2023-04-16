package Salesforce.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Salesforce.Base.BaseTest;
import Salesforce.Pages.LoginPage;

public class LoginTests extends BaseTest {
	
	WebDriver driver;
	LoginPage loginpage;
	String url;
	
	@BeforeMethod
	public void beforemethod() throws IOException {
	
		driver = getDriver();
		String url = geturl();
		driver.get(url);
		loginpage = new LoginPage(driver);
	
	}
			
	@Test
	public void TC1LoginErrorMsg() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.clearPasswordField();
		loginpage.clickloginbutton();
		loginpage.errormsg1();
		Thread.sleep(5000);
	}
	
	
	@Test
	public void TC2validUsernamePaswword() {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		
	}
	
	
	@Test
	public void TC3checkRememberMe() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.RememberMe();
		loginpage.clickloginbutton();
		loginpage.Usermenu();
		loginpage.Logout();
		loginpage.CheckUsername();
		
	}
	
	@Test
	public void TC4Atestforgotpassword() throws InterruptedException {
		loginpage.ForgotPassword();
	}
	
	@Test
	public void TC4Binvalidusernamepassword() throws InterruptedException {
		loginpage.enterUsername("123");
		loginpage.enterPassword("22131");
		loginpage.clickloginbutton();
		loginpage.errormsg();
	}
	
	@AfterMethod
	public void aftermethod() throws IOException {
		SFDCLogintakescreenshot(driver);
		//System.out.println("Executed");
		driver.close();
	}

}
