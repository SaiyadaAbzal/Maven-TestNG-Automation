package Salesforce.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Salesforce.Base.BaseTest;
import Salesforce.Pages.LoginPage;
import Salesforce.Pages.RandomPages;

public class RandomTests extends BaseTest {

WebDriver driver;
	
	LoginPage loginpage;
	RandomPages randompage;
	String url;
	
	@BeforeMethod
	public void beforemethod() throws IOException {
	
		driver = getDriver();
		String url = geturl();
		driver.get(url);
		loginpage = new LoginPage(driver);
		randompage = new RandomPages(driver);
	
	}
	
	@Test
	public void TC33() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		randompage.HomeTab();
		randompage.NameLink();
	}
	
	@Test
	public void TC34() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		randompage.HomeTab();
		randompage.NameLinkEdit();
		randompage.AboutOption();
		randompage.NameLinkValidate();
	}
	
	@Test
	public void TC35() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		randompage.AllTab();
		randompage.customize();
		loginpage.Usermenu();
		loginpage.Logout();
		Thread.sleep(5000);
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		randompage.ValidateTab();	
	}
	
	@Test
	public void TC36() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		randompage.HomeTab();
		randompage.calender();
		randompage.Validatecalendar();
		
	}
	
	@Test
	public void TC37() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		randompage.HomeTab();
		randompage.calendarmonth();
	}
	
	@AfterMethod
	public void aftermethod() throws IOException {
		SFDCRandomtakescreenshot(driver);
		driver.close();
	}


}
