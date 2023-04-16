package Salesforce.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Salesforce.Base.BasePage;

public class ContactsPage extends BasePage {

	public ContactsPage(WebDriver driver) {
		super(driver);
	}
	
	
	//Contacts Tab
		@FindBy(id="Contact_Tab")
		WebElement contacttab;
		@FindBy(id="tryLexDialogX")
		WebElement PopUp;
	
		//New contact
		@FindBy(name="new")
		WebElement newcontact;
		@FindBy(id="name_lastcon2")
		WebElement lastname;
		@FindBy(id="con4_lkwgt")
		WebElement Acctsrch;
		@FindBy(name="searchFrame")
		WebElement frame1;
		@FindBy(id="lksrch")
		WebElement search;
		@FindBy(name="go")
		WebElement gobutton;
		@FindBy(id="resultsFrame")
		WebElement frame2;
		@FindBy(xpath="//a[text()='TestNG Automation1']")
		WebElement selectacc;
		@FindBy(name="save")
		WebElement Save;
		
		@FindBy(xpath="//a[text()='Create New View']")
		WebElement createnewview;
		@FindBy(id="fname")
		WebElement name;
		@FindBy(id="devname")
		WebElement uniquename;
		@FindBy(name="save")
		WebElement save;
		
		@FindBy(id="hotlist_mode")
		WebElement dropdown;
		
		@FindBy(name="fcf")
		WebElement mycontacts;

		@FindBy(xpath="//a[text()='TestNG_Contact']")
		WebElement contactname;

		@FindBy(name="cancel")
		WebElement cancel;
		
		@FindBy(id="con4")
		WebElement accsrch;
		@FindBy(name="save_new")
		WebElement save_new;
		
		public void contactTab() throws InterruptedException {
			contacttab.click();
			Thread.sleep(2000);
			PopUp.click();
			
		}
		public void newcontact() throws InterruptedException {
		
			Thread.sleep(2000);
			
			newcontact.click();
			Thread.sleep(2000);
			lastname.sendKeys("TestNG_Contact");
			Acctsrch.click();
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
			selectacc.click();
			
			driver.switchTo().window(Parentwindow0);
			
			Save.click();
		}

		public void newview() throws InterruptedException{
			createnewview.click();
			
			Thread.sleep(5000);
					
			name.sendKeys("TestNG_Test");
			uniquename.click();
			uniquename.clear();
			uniquename.sendKeys("TestNG_Test_Unique");
			save.click();	
		}
		

		public void RecentlyCreated() throws InterruptedException {
			Thread.sleep(5000);
			
			Select select = new Select(dropdown);
			select.selectByVisibleText("Recently Created");
			
		}
		
		public void MyContacts() throws InterruptedException {
			
			Thread.sleep(5000);
			
			Select select = new Select(mycontacts);
			select.selectByVisibleText("My Contacts");
		}
		
		public void viewcontact() throws InterruptedException {
			Thread.sleep(5000);
			contactname.click();			
		}
		
		
		public void newviewError() throws InterruptedException{
			
			createnewview.click();
			
			Thread.sleep(5000);
			uniquename.click();
			uniquename.sendKeys("EFGH");

			save.click();
			
		}
		public void newviewError2() throws InterruptedException{
			
			createnewview.click();
			
			Thread.sleep(5000);
			name.sendKeys("ABCD");
			
			uniquename.click();
			uniquename.sendKeys("EFGH");

			cancel.click();	
		}
		
		public void newcontactError() throws InterruptedException{
					
			newcontact.click();
			Thread.sleep(2000);
			lastname.sendKeys("India");
			accsrch.sendKeys("Global Media");
			Thread.sleep(5000);	
			save_new.click();
		}
		
}
		
