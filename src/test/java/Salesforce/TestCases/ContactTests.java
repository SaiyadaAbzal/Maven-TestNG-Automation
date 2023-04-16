package Salesforce.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Salesforce.Base.BaseTest;
import Salesforce.Pages.ContactsPage;
import Salesforce.Pages.LoginPage;

public class ContactTests extends BaseTest {
WebDriver driver;
	
	LoginPage loginpage;
	ContactsPage contactpage;
	String url;
	
	@BeforeMethod
	public void beforemethod() throws IOException {
	
		driver = getDriver();
		String url = geturl();
		driver.get(url);
		loginpage = new LoginPage(driver);
		contactpage = new ContactsPage(driver);
	
	}
	
	@Test
	public void TC25Contacts() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		contactpage.contactTab();
		contactpage.newcontact();
	}
	
	@Test
	public void TC26Newview() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		contactpage.contactTab();
		contactpage.newview();
	}
	
	@Test
	public void TC27PipelineReports() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		contactpage.contactTab();
		contactpage.RecentlyCreated();
	}
	
	@Test
	public void TC28MyContacts() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		contactpage.contactTab();
		contactpage.MyContacts();
	}
	
	@Test
	public void TC29viewcontacts() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		contactpage.contactTab();
		contactpage.viewcontact();
	}
	
	@Test
	public void TC30errornewview() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		contactpage.contactTab();
		contactpage.newviewError();
	}
	
	@Test
	public void TC31errornewview() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		contactpage.contactTab();
		contactpage.newviewError2();
	}
	
	@Test
	public void TC32errornewview() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		contactpage.contactTab();
		contactpage.newcontactError();
	}
	@AfterMethod
	public void aftermethod() throws IOException {
		SFDCContactstakescreenshot(driver);
		driver.close();
	}


}
