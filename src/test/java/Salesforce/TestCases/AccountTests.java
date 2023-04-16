package Salesforce.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Salesforce.Base.BaseTest;
import Salesforce.Pages.AccountPage;
import Salesforce.Pages.LoginPage;

public class AccountTests extends BaseTest {
	WebDriver driver;
	
	LoginPage loginpage;
	AccountPage accountpage;
	String url;
	
	@BeforeMethod
	public void beforemethod() throws IOException {
	
		driver = getDriver();
		String url = geturl();
		driver.get(url);
		loginpage = new LoginPage(driver);
		accountpage = new AccountPage(driver);
	
	}
	
	@Test
	public void TC10NewAccount() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		accountpage.Accounts();
		accountpage.NewAccount();
	}
	
	@Test
	public void TC11Createnewview() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		accountpage.Accounts();
		accountpage.Createviewlink();
	}
	
	@Test
	public void TC12Editview () throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		accountpage.Accounts();
		accountpage.Editviewlink();
	}
	
	@Test
	public void TC13MergeAccounts () throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		accountpage.Accounts();
		accountpage.newaccts();
		accountpage.merge();
	}
	
	@Test
	public void TC14AccountsReport () throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		accountpage.Accounts();
		accountpage.Reports();
	}
	
	
	@AfterMethod
	public void aftermethod() throws IOException {
		SFDCAccountstakescreenshot(driver);
		driver.close();
	}

}
