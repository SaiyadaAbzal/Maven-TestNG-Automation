package Salesforce.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Salesforce.Base.BaseTest;
import Salesforce.Pages.LoginPage;
import Salesforce.Pages.UsermenuPage;

public class UsermenuTests extends BaseTest {
	

	WebDriver driver;
	UsermenuPage usermenupage;
	LoginPage loginpage;
	String url;
	
	@BeforeMethod
	public void beforemethod() throws IOException {
	
		driver = getDriver();
		String url = geturl();
		driver.get(url);
		loginpage = new LoginPage(driver);
		usermenupage = new UsermenuPage(driver);
	
	}
	
	@Test
	public void TC5UserMenuDropdown() {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		loginpage.Usermenu();
		usermenupage.UsermenuList();
	}
	
	@Test
	public void TC6MyProfile() throws InterruptedException, IOException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		loginpage.Usermenu();
		usermenupage.myprofile();
		SFDCUsermenutakescreenshot(driver);
		usermenupage.AboutOption();
		SFDCUsermenutakescreenshot(driver);
		usermenupage.PostLink();
		SFDCUsermenutakescreenshot(driver);
		usermenupage.FileLink();
		SFDCUsermenutakescreenshot(driver);
		usermenupage.Photo();
	}
	
	@Test
	public void TC7MySettings() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		loginpage.Usermenu();
		usermenupage.settingmenu();
		usermenupage.Personal();
		usermenupage.DisplayLayout();
		loginpage.Usermenu();
		usermenupage.settingmenu();
		usermenupage.Email();
		usermenupage.Calender();
		}
	
	@Test
	public void TC8DeveloperConsole() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		loginpage.Usermenu();
		usermenupage.DeveloperConsole();
	}
	
	@Test
	public void TC9Logout() throws InterruptedException {
		loginpage.enterUsername("saiyada@tekarch.com");
		loginpage.enterPassword("Rahamathabzal@1991");
		loginpage.clickloginbutton();
		loginpage.Usermenu();
		usermenupage.Logout();
	}
	
	
	
	
	@AfterMethod
	public void aftermethod() throws IOException {
		SFDCUsermenutakescreenshot(driver);
		driver.close();
	}
	
}
