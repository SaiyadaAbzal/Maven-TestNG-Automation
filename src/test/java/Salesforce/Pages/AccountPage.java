package Salesforce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Salesforce.Base.BasePage;

public class AccountPage extends BasePage{

	public AccountPage(WebDriver driver) {
		super(driver);
	
	}
	
	//NewAccount
	@FindBy (id="Account_Tab")
	WebElement accounts;

	@FindBy (id="tryLexDialogX")
	WebElement PopUp;

	@FindBy (name="new")
	WebElement NewButton;

	@FindBy (id="acc2")
	WebElement AcctName;

	@FindBy (xpath="//option[text()='Technology Partner']")
	WebElement Type;

	@FindBy (xpath="//option[text()='High']")
	WebElement Priority;
	
	@FindBy(name="save")
	WebElement SaveButton;
	
	//CreateNewView
	@FindBy(xpath="//a[text()='Create New View']")
	WebElement link;
	
	@FindBy(id="fname")
	WebElement viewname;
	
	@FindBy(name="save")
	WebElement save;
	
	//EditView
	@FindBy(name="fcf")
	WebElement account;

	@FindBy(xpath="//a[text()='Edit']")
	WebElement Edit;
	
	@FindBy(name="fname")
	WebElement vieweditname;
	
	@FindBy(name="fcol1")
	WebElement accountfield;
	
	@FindBy(name="fop1")
	WebElement operator;
	
	@FindBy(name="fval1")
	WebElement value;
	
	@FindBy(name="save")
	WebElement Editsave;
	
	//MergeAccounts
	//NewAccounts
	@FindBy(name="new")
	WebElement newaccountbutton;
	
	@FindBy(id="acc2")
	WebElement acct;
	
	@FindBy(name="acc6")
	WebElement EnterType;
	
	@FindBy(xpath="//select[@tabindex='26']")
	WebElement EnterPriority;
	
	@FindBy(name="save_new")
	WebElement save_new;
	
	@FindBy(name="save")
	WebElement saveAccount;
	//Merge
	
	@FindBy(xpath="//a[text()='Merge Accounts']")
	WebElement mergeaccounts;
	
	@FindBy(id="srch")
	WebElement search;
	@FindBy(name="srchbutton")
	WebElement searchButton;
	@FindBy(id="cid0")
	WebElement checkbox;
	@FindBy(id="cid1")
	WebElement checkbox1;
	@FindBy(id="cid2")
	WebElement checkbox2;
	@FindBy(name="goNext")
	WebElement Next;
	@FindBy(name="save")
	WebElement mergesave;
	
	//Reports
	@FindBy(xpath="//a[text()='Accounts with last activity > 30 days']")
	WebElement reports;
	@FindBy(id="ext-gen152")
	WebElement icon;
	@FindBy(xpath="//table[@id='ext-comp-1111']//button[text()='Today']")
	WebElement StartDate;
	@FindBy(id="ext-gen154")
	WebElement icon1;
	@FindBy(xpath="//table[@id='ext-comp-1113']//button[text()='Today']")
	WebElement EndDate;
	@FindBy(id="ext-gen49")
	WebElement Save;
	@FindBy(name="reportName")
	WebElement ReportName;
	@FindBy(name="reportDevName")
	WebElement ReportUniqName;
	@FindBy(xpath="//button[text()='Save and Run Report']")
	WebElement SaveReport;


	
	public void Accounts() throws InterruptedException {
				
		accounts.click();
		Thread.sleep(5000);
		PopUp.click();
	}
		
	public void NewAccount() {
		
		NewButton.click();	
		AcctName.sendKeys("TestNG2");	
		Type.click();		
		Priority.click();		
		SaveButton.click();
	}
	
	public void Createviewlink() throws InterruptedException {
		Thread.sleep(5000);
		link.click();
		viewname.sendKeys("TestNG1View");
		save.click();
	}
	
	public void Editviewlink() throws InterruptedException {
		
		Thread.sleep(5000);
		Select select = new Select(account);
		select.selectByVisibleText("TestNG1View");
		Edit.click();
		vieweditname.clear();
		vieweditname.sendKeys("TestNG1EditView");
		Select field = new Select(accountfield);
		field.selectByVisibleText("Account Name");
		Select op = new Select(operator);
		op.selectByVisibleText("contains");
		value.sendKeys("a");
		Editsave.click();
	}

	public void  newaccts() throws InterruptedException {
		
		newaccountbutton.click();
		Thread.sleep(5000);
		int count=1;
		String name="TestNG_Automation";
		
		for(int i=0;i<=3;i++) {
			acct.sendKeys(name+count);
			Select selectType = new Select(EnterType);
			selectType.selectByVisibleText("Technology Partner");
			Select priorityset = new Select(EnterPriority);
			priorityset.selectByVisibleText("High");
			if(count==4) {
				saveAccount.click();
			}else {
				save_new.click();
			}
			count++;
		}
	}

	public void merge() {
		accounts.click();
		mergeaccounts.click();
		search.sendKeys("TestNG");		
		searchButton.click();
		checkbox.click();
		checkbox1.click();
		checkbox2.click();
		Next.click();
		mergesave.click();
		driver.switchTo().alert().accept();
	}
	
	public void Reports() throws InterruptedException {
		reports.click();
		Thread.sleep(5000);
		icon.click();
		StartDate.click();
		icon1.click();
		EndDate.click();		
		Save.click();		
		ReportName.sendKeys("TestNG_Report");	
		ReportUniqName.sendKeys("");
		Thread.sleep(5000);
		SaveReport.click();
	}
}
