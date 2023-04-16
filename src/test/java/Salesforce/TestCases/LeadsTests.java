package Salesforce.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Salesforce.Base.BaseTest;
import Salesforce.Pages.LeadsPage;
import Salesforce.Pages.LoginPage;

public class LeadsTests extends BaseTest {
	
	WebDriver driver;
	
	LoginPage loginpage;
	LeadsPage leadspage;
	String url;
	
	@BeforeMethod
	public void beforemethod() throws IOException {
	
		driver = getDriver();
		String url = geturl();
		driver.get(url);
		loginpage = new LoginPage(driver);
		leadspage = new LeadsPage(driver);
	
	}
	
	@Test
	public void TC20Leads() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		leadspage.leads();
	}
	
	@Test
	public void TC21Leads() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		leadspage.leads();
		leadspage.LeadsLists();
	}
	
	@Test
	public void TC22Leads() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		
		leadspage.leads();
		leadspage.TodaysLeads();
		loginpage.Usermenu();
		loginpage.Logout();
		
		Thread.sleep(5000);
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		
		leadspage.validate();
	}
	
	@Test
	public void TC23Leads() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		leadspage.leads();
		leadspage.TodaysLeads();
	}
	
	@Test
	public void TC24Leads() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		leadspage.leads();
		leadspage.newlead();
	}
	
	
	
	@AfterMethod
	public void aftermethod() throws IOException {
		SFDCLeadstakescreenshot(driver);
		driver.close();
	}

}
