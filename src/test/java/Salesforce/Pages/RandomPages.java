package Salesforce.Pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Salesforce.Base.BasePage;

public class RandomPages extends BasePage{

	public RandomPages(WebDriver driver) {
		super(driver);
	}
	
	//Home Tab
			@FindBy(id="home_Tab")
			WebElement hometab;
			@FindBy(id="tryLexDialogX")
			WebElement PopUp;
		
			//FLName
			@FindBy(xpath="//h1[@class='currentStatusUserName']//a")
			WebElement firstlastname;
			@FindBy(xpath="//a[@class='contactInfoLaunch editLink']")
			WebElement Edit;
	
			//About tab
			@FindBy (id="contactInfoContentId")
			WebElement iFrame;
			@FindBy (xpath="//a[contains(text(),'About')]")
			WebElement About;
			@FindBy (id="lastName")
			WebElement Lastname;
			@FindBy (xpath="//input[@value='Save All']")
			WebElement SaveButton;
			@FindBy (id="tailBreadcrumbNode")
			WebElement updated;
			
			//AllT Tab
			@FindBy (xpath="//img[@title='All Tabs']")
			WebElement alltab;
			
			//Customize Tabs
			@FindBy (name="customize")
			WebElement customizetab;
			@FindBy (id="duel_select_1")
			WebElement chatter;
			@FindBy (id="duel_select_0_left")
			WebElement remove;
			@FindBy (name="save")
			WebElement save;
			
			@FindBy(id="tabBar")
			WebElement tabbarlist;
			
			//calendar
			@FindBy(xpath="//a[text()='Thursday April 6, 2023']")
			WebElement calenderlink;
			@FindBy(xpath="//a[contains(text(),'8:00 PM')]")
			WebElement time;
			@FindBy(xpath="//a[@title='Combo (New Window)']")
			WebElement subjecticon;
			@FindBy(xpath="//a[text()='Other']")
			WebElement other;
			@FindBy(id="EndDateTime_time")
			WebElement EndTime;
			@FindBy(xpath="//div[contains(text(),'9:00 PM')]")
			WebElement Selecttime;
			@FindBy(id="p:f:j_id25:j_id69:28:hh")
			WebElement validate;
			
			//Monthview
			@FindBy(xpath="//a[contains(text(),'9:00 PM')]")
			WebElement timestart;
			@FindBy(xpath="//div[text()='11:00 PM']")
			WebElement SelectEnd;
			@FindBy(id="IsRecurrence")
			WebElement Recurrence;
			@FindBy(id="rectypeftw")
			WebElement weekly;
			@FindBy(id="RecurrenceEndDateOnly")
			WebElement EndDate;
			@FindBy(xpath="//td[text()='20']")
			WebElement Selectdate;
			@FindBy(xpath="//img[@alt='Month View']")
			WebElement monthview;

			
	public void HomeTab() throws InterruptedException {
		hometab.click();		
		Thread.sleep(5000);
		PopUp.click();	
	}

	public void NameLink() {
		String Actual = firstlastname.getText();
		String Expected = "Saiyada Rahamath Bie Jamaludeen";
		Assert.assertEquals(Actual, Expected);
		//System.out.println(Actual);
		firstlastname.click();
	}
	public void NameLinkEdit() throws InterruptedException {
			firstlastname.click();
			Thread.sleep(5000);
			Edit.click();
	}
	public void AboutOption() throws InterruptedException {
		driver.switchTo().frame(iFrame);
		About.click();
		Lastname.clear();
		Lastname.sendKeys("ABCD");
		SaveButton.click();
		String Actual = updated.getText();
		String Expected = "Saiyada Rahamath Bie ABCD ";
		Assert.assertEquals(Actual, Expected);	
	}
	
	
	public void NameLinkValidate() throws InterruptedException {
		hometab.click();
		String Actual = firstlastname.getText();
		String Expected = "Saiyada Rahamath Bie ABCD";
		Assert.assertEquals(Actual, Expected);
		System.out.println(Actual);
		firstlastname.click();
	}

	public void AllTab() {
		alltab.click();
				
	}

	public void customize() throws InterruptedException {
		Thread.sleep(5000);
		customizetab.click();
		Select select = new Select(chatter);
		select.selectByVisibleText("Chatter");;
		remove.click();
		save.click();
		Thread.sleep(5000);
	}
	public void ValidateTab() throws InterruptedException {
		Thread.sleep(5000);
		String tabbar = tabbarlist.getText();
		System.out.println(tabbar);	
		String chatter = "Chatter";
             if (tabbar.equalsIgnoreCase(chatter)){
             System.out.println(" not validated");
             }  else {
            	 System.out.println("validated");
             }	
	}

	public void calender() throws InterruptedException {
		Thread.sleep(5000);
		calenderlink.click();
		time.click();
		subjecticon.click();
		Set<String> Window = driver.getWindowHandles();
		Iterator<String> iterate = Window.iterator();
		String Parentwindow0 = iterate.next();
		String childwindow0 = iterate.next();		
		driver.switchTo().window(childwindow0);
		other.click();		
		driver.switchTo().window(Parentwindow0);
		Thread.sleep(5000);
		EndTime.click();		
		Selecttime.click();	
		save.click();
		
	}

	public void Validatecalendar() throws InterruptedException {
		Thread.sleep(5000);
		validate.click();

	}

	public void calendarmonth() throws InterruptedException {
		Thread.sleep(5000);
		calenderlink.click();
		Thread.sleep(5000);
		timestart.click();
		subjecticon.click();
		Set<String> Window = driver.getWindowHandles();
		Iterator<String> iterate = Window.iterator();
		String Parentwindow0 = iterate.next();
		String childwindow0 = iterate.next();
		driver.switchTo().window(childwindow0);
		other.click();
		driver.switchTo().window(Parentwindow0);
		Thread.sleep(5000);
		EndTime.click();
		SelectEnd.click();
		Recurrence.click();
		weekly.click();		
		EndDate.click();		
		Selectdate.click();		
		save.click();
		Thread.sleep(5000);		
		monthview.click();		
		Thread.sleep(5000);
		
	}

}
