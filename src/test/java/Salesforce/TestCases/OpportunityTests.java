package Salesforce.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Salesforce.Base.BaseTest;
import Salesforce.Pages.LoginPage;
import Salesforce.Pages.OpportunityPage;

public class OpportunityTests extends BaseTest {
WebDriver driver;
	
	LoginPage loginpage;
	OpportunityPage opportunitypage;
	String url;
	
	@BeforeMethod
	public void beforemethod() throws IOException {
	
		driver = getDriver();
		String url = geturl();
		driver.get(url);
		loginpage = new LoginPage(driver);
		opportunitypage = new OpportunityPage(driver);
	
	}
	
	@Test
	public void TC15Opportunity() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		opportunitypage.opportunitytab();
		opportunitypage.opportunity();
	}
	
	@Test
	public void TC16NewOpportunity() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		opportunitypage.opportunitytab();
		opportunitypage.createnewoppty();
	}
	
	@Test
	public void TC17PipelineReports() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		opportunitypage.opportunitytab();
		opportunitypage.Reports();
	}
	
	@Test
	public void TC18StuckReports() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		opportunitypage.opportunitytab();
		opportunitypage.StuckReports();
	}
	
	@Test
	public void TC19QSummaryReports() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		opportunitypage.opportunitytab();
		opportunitypage.CurrentFQReport();
		opportunitypage.NextFQReport();
	}
	
	@AfterMethod
	public void aftermethod() throws IOException {
		SFDCOpportunitytakescreenshot(driver);
		driver.close();
	}

}
