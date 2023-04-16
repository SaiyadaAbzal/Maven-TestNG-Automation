package Salesforce.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Salesforce.Base.BasePage;

public class OpportunityPage extends BasePage {
	
	public OpportunityPage(WebDriver driver) {
		super(driver);
	
	}
	//Opportunity Lists
	@FindBy(id="Opportunity_Tab")
	WebElement oppty;
	
	@FindBy(id="tryLexDialogX")
	WebElement PopUp;
	
	@FindBy(id="fcf")
	WebElement list;
	
	//New Opportunity
	@FindBy(name="new")
	WebElement newoppty;
	
	@FindBy(id="opp3")
	WebElement name;
	
	@FindBy(id="opp4_lkwgt")
	WebElement AcctName;
	
	@FindBy(xpath="//frame[@title='Search']")
	WebElement frame1;

	@FindBy(id="lksrch")
	WebElement search;

	@FindBy(name="go")
	WebElement gobutton;

	@FindBy(xpath="//frame[@title='Results']")
	WebElement frame2;

	@FindBy(id="opp9")
	WebElement closeDate;

	@FindBy(xpath="//a[text()='TestNG']")
	WebElement selectname;

	@FindBy(id="calMonthPicker")
	WebElement selectMonth;

	@FindBy(xpath="//td[text()='21']")
	WebElement selectDate;

	@FindBy(id="opp11")
	WebElement stage;

	@FindBy(id="opp12")
	WebElement probability;

	@FindBy(id="opp17_lkwgt")
	WebElement PCampaign;

	@FindBy(xpath="//frame[@title='Search']")
	WebElement iframe;

	@FindBy(id="lksrch")
	WebElement searchCamp;

	@FindBy(name="go")
	WebElement gobutton1;

	@FindBy(xpath="//frame[@title='Results']")
	WebElement iframe2;

	@FindBy(xpath="//a[text()='TestNG_Camp']")
	WebElement selectCamp;

	@FindBy(name="save")
	WebElement Save;
	
	//Pipeline Reports
	
	@FindBy(xpath="//a[text()='Opportunity Pipeline']")
	WebElement pipelinelink;
	
	//Stuck Reports
	@FindBy(xpath="//a[text()='Stuck Opportunities']")
	WebElement Stucklink;
	
	//Summary Report
	@FindBy(id="quarter_q")
	WebElement Interval;
	
	@FindBy(id="open")
	WebElement Include;
	
	@FindBy(xpath="//input[@title='Run Report']")
	WebElement run;

	public void opportunitytab() throws InterruptedException {
		
		oppty.click();
		Thread.sleep(5000);
		PopUp.click();
	}
	
	public void opportunity() throws InterruptedException {
		
		String Actual = list.getText();
		String Expected = "All Opportunities\n"
				+ "Closing Next Month\n"
				+ "Closing This Month\n"
				+ "My Opportunities\n"
				+ "New Last Week\n"
				+ "New This Week\n"
				+ "Opportunity Pipeline\n"
				+ "Private\n"
				+ "Recently Viewed Opportunities\n"
				+ "Won";
		comparetext(Actual, Expected);
	}

	public void createnewoppty() throws InterruptedException {
				
		newoppty.click();
		Thread.sleep(2000);
		name.sendKeys("TestNGOpportunity");
		AcctName.click();
		Thread.sleep(5000);	
		
		Set<String> Window = driver.getWindowHandles();
		//System.out.println(Window.size());
		Iterator<String> iterate = Window.iterator();
		String Parentwindow0 = iterate.next();
		String childwindow0 = iterate.next();
		driver.switchTo().window(childwindow0);
		
		Thread.sleep(5000);		
		
		driver.switchTo().frame(frame1);		
		search.sendKeys("TestNG");		
		gobutton.click();		
		
		driver.switchTo().defaultContent();	
		
		driver.switchTo().frame(frame2);
		selectname.click();
		
		driver.switchTo().window(Parentwindow0);
		
		closeDate.click();
		Select select = new Select(selectMonth);
		select.selectByVisibleText("April");		
		selectDate.click();
		
		Select stagevalue = new Select(stage);
		stagevalue.selectByVisibleText("Closed Won");
		
		probability.sendKeys("");
		
		PCampaign.click();
		Set<String> handles = driver.getWindowHandles();
		//System.out.println(handles.size());
		Iterator<String> it = handles.iterator();
		String Parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(iframe);
		searchCamp.sendKeys("TestNG");
		gobutton1.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(iframe2);
		selectCamp.click();
		
		driver.switchTo().window(Parentwindow);
		
		Save.click();
		
	}

	public void Reports() {
		
		pipelinelink.click();
		
		
	}

	public void StuckReports() {
		Stucklink.click();
		
	}

	public void CurrentFQReport() {
		Select  select = new Select(Interval);
		select.getFirstSelectedOption();
		
		Select  select1 = new Select(Include);
		select1.getFirstSelectedOption();
		//System.out.println(select1);
		
		run.click();
		
		oppty.click();
		

		Select  select2 = new Select(Interval);
		select2.getFirstSelectedOption();
		//System.out.println(select);
		
		Select  select3 = new Select(Include);
		select3.selectByVisibleText("Open Opportunities");
		//System.out.println(select1);
		
		run.click();
		
		
		oppty.click();
	
		Select  select4 = new Select(Interval);
		select4.getFirstSelectedOption();
		//System.out.println(select);
		
		Select  select5 = new Select(Include);
		select5.selectByVisibleText("Closed Opportunities");
		//System.out.println(select1);
		
		run.click();
		
		oppty.click();
		System.out.println("CurrentFQExecuted");

	}

	public void NextFQReport() {
		Select  select = new Select(Interval);
		select.selectByVisibleText("Next FQ");;
		
		Select  select1 = new Select(Include);
		select1.getFirstSelectedOption();
		//System.out.println(select1);
		
		run.click();
		
		oppty.click();
		

		Select  select2 = new Select(Interval);
		select2.selectByVisibleText("Next FQ");;
		//System.out.println(select);
		
		Select  select3 = new Select(Include);
		select3.selectByVisibleText("Open Opportunities");
		//System.out.println(select1);
		
		run.click();
		
		
		oppty.click();
	
		Select  select4 = new Select(Interval);
		select4.selectByVisibleText("Next FQ");;
		//System.out.println(select);
		
		Select  select5 = new Select(Include);
		select5.selectByVisibleText("Closed Opportunities");
		//System.out.println(select1);
		
		run.click();
		
		oppty.click();
		System.out.println("NextFQExecuted");
	}


}
