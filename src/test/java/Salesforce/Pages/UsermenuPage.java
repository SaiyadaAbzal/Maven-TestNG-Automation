package Salesforce.Pages;

import java.util.List;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import Salesforce.Base.BasePage;



public class UsermenuPage extends BasePage{

	public UsermenuPage(WebDriver driver) {
		super(driver);
	
	}
	
	//MyProfile-About link
	@FindBy (id="userNav")
	WebElement list;
	@FindBy (xpath="//a[text()='My Profile']")
	WebElement MyProfile;
	@FindBy (id="tailBreadcrumbNode")
	WebElement BeforeChange;
	@FindBy (xpath="//a[@class='contactInfoLaunch editLink']")
	WebElement EditButton;
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
	
	//Post link
	@FindBy (xpath="//span[text()='Post']")
	WebElement Post;
	@FindBy (xpath="//iframe[@allowtransparency='true']")
	WebElement iFrame1;
	@FindBy (xpath="//body[text()='Share an update, @mention someone...']")
	WebElement TextArea;
	@FindBy (xpath= "//*[@id='publishersharebutton']")
	WebElement shareButton;
	
	//File Link
	@FindBy (xpath="//span[text()='File']")
	WebElement FileButton;
	@FindBy (id= "chatterUploadFileAction")
	WebElement UpLoadFile;
	@FindBy (id= "chatterFile")
	WebElement ChooseFile;
	@FindBy (id= "publishersharebutton")
	WebElement ShareBtn;
	
	//PhotoLink
	@FindBy(xpath="//a[@id='uploadLink']")
	WebElement photoLink;
	@FindBy(xpath="//iframe[@id='uploadPhotoContentId']")
	WebElement iFrame2;	
	@FindBy(id="j_id0:uploadFileForm:uploadInputFile")
	WebElement ChoosePhoto;
	@FindBy(id="j_id0:uploadFileForm:uploadBtn")
	WebElement SaveBttn;
	@FindBy(xpath="//div[@class='imgCrop_handle imgCrop_handleSE']")
	WebElement cropper;
	@FindBy(xpath="//div[@class='imgCrop_handle imgCrop_handleNE']")
	WebElement cropper2;
	@FindBy(id="j_id0:j_id7:save")
	WebElement SaveImg;
	
	//MySettings-History
	@FindBy(xpath="//a[@title='My Settings']")
	WebElement MySettings;
	@FindBy(id="PersonalInfo_font")
	WebElement	PersonalLink;
	@FindBy(id="LoginHistory_font")
	WebElement LoginHistory;
	@FindBy(xpath="//a[contains(text(),'Download login history')]")
	WebElement Download;
	
	//DisplayLayout&Validations
	@FindBy(id="DisplayAndLayout_font")
	WebElement Displaylayout;
	@FindBy(id="CustomizeTabs_font")
	WebElement CustomizeTabs;	
	@FindBy(xpath="//option[text()='Salesforce Chatter']")
	WebElement Customapp;
	@FindBy(xpath="//option[text()='Reports']")
	WebElement Reports;
	@FindBy(xpath="//img[@title='Add']")
	WebElement Add;
	@FindBy(name="save")
	WebElement Save;
	//SFChatter
	@FindBy(id="tsid-arrow")
	WebElement MenuButton;
	@FindBy(xpath="//div[@id='tsid-menuItems']/a")
	List<WebElement> MenuList;
	@FindBy(xpath="//a[text()='Salesforce Chatter']")
	WebElement Salesforechatter;
	@FindBy(id="tryLexDialogX")
	WebElement PopUp;
	@FindBy(xpath="//ul[@id='tabBar']/li")
	List<WebElement> listtabs;
	//sales
	@FindBy(xpath="//a[text()='Sales']")
	WebElement Sales;
	//Marketing
	@FindBy(xpath="//a[text()='Marketing']")
	WebElement Marketing;
	
	//Email
	@FindBy(id="EmailSetup_font")
	WebElement EmailLink;
	@FindBy(id="EmailSettings_font")
	WebElement EmailSettings;	
	@FindBy(id="sender_name")
	WebElement EmailName;
	@FindBy(id="sender_email")
	WebElement EmailAddress;
	@FindBy(id="auto_bcc1")
	WebElement Bcc;
	@FindBy(name="save")
	WebElement SaveEmail;
	
	//Calender
	@FindBy(id="CalendarAndReminders_font")
	WebElement calender;
	@FindBy(id="Reminders_font")
	WebElement ActiveRemainders;
	@FindBy(id="testbtn")
	WebElement testremainder;
	
	//Developer Console
	@FindBy(xpath="//a[text()='Developer Console']")
	WebElement console;
	
	//LogOut
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	
	
	
	public void UsermenuList() {
		String lists = list.getText();
		String ExpectedText = "Saiyada Rahamath...\n"
								+ "My Profile\n"
								+ "My Settings\n"
								+ "Developer Console\n"
								+ "Switch to Lightning Experience\n"
								+ "Logout";
		comparetext(lists,ExpectedText);
		//System.out.println(lists);
		
	}
	
	public void myprofile() throws InterruptedException {
		Thread.sleep(5000);
		MyProfile.click();
		System.out.println("BeforeEdit: " +BeforeChange.getText());
		EditButton.click();
		}
	
	public void AboutOption() {
		driver.switchTo().frame(iFrame);
		About.click();
		Lastname.clear();
		Lastname.sendKeys("Jamaludeen");
		SaveButton.click();
		String update = updated.getText();
		System.out.println("AfterEdit: " +update);
		String ExpectedName = "Saiyada Rahamath Bie Jamaludeen ";
		comparetext(update,ExpectedName);
		
	}
	
	public void PostLink() throws InterruptedException {
		Thread.sleep(5000);
		Post.click();
		Thread.sleep(5000);
		driver.switchTo().frame(iFrame1);
		Thread.sleep(5000);
		//TextArea.click();
		//Thread.sleep(5000);
		TextArea.sendKeys("My First Post through TestNGFramework Automation");
		driver. switchTo(). defaultContent();
		Thread.sleep(5000);
		shareButton.click();
	}
	
	public void FileLink() throws InterruptedException {
		Thread.sleep(5000);
		FileButton.click();
		Thread.sleep(5000);
		UpLoadFile.click();
		Thread.sleep(5000);
		ChooseFile.sendKeys("C:\\TekArchTraining\\Campaign 1.docx");
		Thread.sleep(5000);
		ShareBtn.click();
		Thread.sleep(5000);
		}

	public void Photo() throws InterruptedException {
		Thread.sleep(5000);
		Actions link =new Actions(driver);
		link.moveToElement(photoLink).build().perform();
		photoLink.click();
		driver.switchTo().frame(iFrame2);
		ChoosePhoto.sendKeys("C:\\TekArchTraining\\Wonder.jpeg");
		SaveBttn.click();
		Thread.sleep(5000);
		Actions Crop =new Actions(driver);
		Crop.clickAndHold(cropper).moveByOffset(30,50).build().perform();
		
		Actions Crop2 =new Actions(driver);
		Crop2.clickAndHold(cropper2).moveByOffset(30,50).build().perform();
		SaveImg.click();
	}
	
	public void settingmenu(){
		MySettings.click();
		
	}
	
	public void Personal() throws InterruptedException {
		Thread.sleep(5000);
		PersonalLink.click();
		LoginHistory.click();
		Download.click();
	}
	
	public void DisplayLayout() throws InterruptedException {
		Thread.sleep(5000);
		Displaylayout.click();
		CustomizeTabs.click();
		Customapp.click();
		Reports.click();
		Add.click();
		Save.click();
		
		//SFChatter
		MenuButton.click();
		MenuList.size();
		Salesforechatter.click();
		PopUp.click();
		for(WebElement TTabs : listtabs) {
			//System.out.println(TTabs.getText());
			//System.out.println(TTabs);
			if(TTabs.getText().equalsIgnoreCase("Reports")) {
				System.out.println("Tab is Present");
				break;
			}
						
		}
		
		//Sales
		Thread.sleep(5000);
		MenuButton.click();
		MenuList.size();
		Sales.click();
		//PopUp.click();
		for(WebElement TTabs : listtabs) {
			//System.out.println(TTabs.getText());
			//System.out.println(TTabs);
			if(TTabs.getText().equalsIgnoreCase("Reports")) {
				System.out.println("Tab is Present");
				break;
			}
						
		}
		
		//Marketing
		Thread.sleep(5000);
		MenuButton.click();
		MenuList.size();
		Marketing.click();
		//PopUp.click();
		for(WebElement TTabs : listtabs) {
			//System.out.println(TTabs.getText());
			//System.out.println(TTabs);
			if(TTabs.getText().equalsIgnoreCase("Reports")) {
				System.out.println("Tab is Present");
				break;
			}
						
		}
	}
	
	public void Email() throws InterruptedException{
		
		Thread.sleep(5000);
		EmailLink.click();
		EmailSettings.click();
		EmailName.clear();
		EmailName.sendKeys("Saiyada");
		EmailAddress.clear();
		EmailAddress.sendKeys("saiyada123@abc.com");
		Bcc.click();
		SaveEmail.click();
		driver.switchTo().alert().accept();
	}
	
	public void Calender() throws InterruptedException {
		Thread.sleep(5000);
		calender.click();
		ActiveRemainders.click();
		testremainder.click();
	}
	
	public void DeveloperConsole() throws InterruptedException {
		
		Thread.sleep(5000);
		console.click();
		String Pwindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String> Parent = driver.getWindowHandles();
		for(String window :Parent ) {
			driver.switchTo().window(window);
			System.out.println("windowTitle"+driver.getTitle());	
		}
		driver.close();	
		driver.switchTo().window(Pwindow);
		System.out.println("windowTitle"+driver.getTitle());
		}

	public  void Logout() {
		
		logout.click();

	}
}
