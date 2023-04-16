package Salesforce.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Salesforce.Base.BasePage;

public class LeadsPage  extends BasePage {

	public LeadsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="Lead_Tab")
	WebElement LeadsTab;
	@FindBy(id="tryLexDialogX")
	WebElement PopUp;
	
	//List
	@FindBy(id = "fcf")
	WebElement DropDown;
	
	//TodaysLeads
	@FindBy(id="fcf")
	WebElement todaysleads;
	//validate
	@FindBy(name="go")
	WebElement gobutton;
	@FindBy(name="fcf")
	WebElement validation;
	
	//newlead
	@FindBy(name="new")
	WebElement New;
	@FindBy(id="name_lastlea2")
	WebElement lastname;
	@FindBy(id="lea3")
	WebElement company;
	@FindBy(name="save")
	WebElement save;
	
	//logout
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public void leads() throws InterruptedException {

		LeadsTab.click();
		Thread.sleep(5000);
		PopUp.click();
	}
	
	public void LeadsLists() {
		
		String Actual = DropDown.getText();
		String Expected = "All Open Leads\n"
							+"My Unread Leads\n"
							+"Recently Viewed Leads\n"
							+ "Today's Leads\n"
							+"View - Custom 1\n"
							+"View - Custom 2";
		Assert.assertEquals(Actual, Expected);
		//System.out.println("Compared and Matched");	
	}
	
	public void TodaysLeads() throws InterruptedException {
		Thread.sleep(5000);
		Select select = new Select(todaysleads);
		select.selectByVisibleText("Today's Leads");
	}
	
	public void Logout() throws InterruptedException {
		Thread.sleep(5000);
		logout.click();
		
	}

	public void validate() {
		LeadsTab.click();
		
		gobutton.click();
		
		Select select = new Select(validation);
		String Actual = select.getFirstSelectedOption().getText();
		String Expected = "Today's Leads";
		Assert.assertEquals(Actual, Expected);	
	}
	
	public void newlead() throws InterruptedException {	
		New.click();
		Thread.sleep(5000);
		lastname.sendKeys("TestNG1");
		company.sendKeys("TestNG1");
		save.click();
		
	}

	

}
