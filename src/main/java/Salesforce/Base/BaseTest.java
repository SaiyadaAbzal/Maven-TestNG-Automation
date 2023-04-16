package Salesforce.Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Salesforce.Utilities.CommonUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	CommonUtilities common = new CommonUtilities();

	 
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	public String geturl() throws IOException {
		String url = common.getproperty("url");
		driver.manage().window().maximize();
		return url;
	}
	public void SFDCLogintakescreenshot(WebDriver driver) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File  scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		Date currentdate = new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentdate);
		String filepath = "C:\\TekArchTraining\\TestNGScreenshots\\SFLoginScreeenshots\\LoginScreenshot"+timestamp+".jpeg";
		File desfile = new File(filepath);
		FileUtils.copyFile(scrfile, desfile);
		
	}
	public void SFDCUsermenutakescreenshot(WebDriver driver) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File  scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		Date currentdate = new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentdate);
		String filepath = "C:\\TekArchTraining\\TestNGScreenshots\\SFUserMenuScreenshots\\UsermenuScreenshot"+timestamp+".jpeg";
		File desfile = new File(filepath);
		FileUtils.copyFile(scrfile, desfile);
		
	}

	
	public void SFDCAccountstakescreenshot(WebDriver driver) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File  scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		Date currentdate = new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentdate);
		String filepath = "C:\\TekArchTraining\\TestNGScreenshots\\SFAccountsScreenshots\\AccountsScreenshot"+timestamp+".jpeg";
		File desfile = new File(filepath);
		FileUtils.copyFile(scrfile, desfile);
		
	}
	
	public void SFDCOpportunitytakescreenshot(WebDriver driver) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File  scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		Date currentdate = new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentdate);
		String filepath = "C:\\TekArchTraining\\TestNGScreenshots\\SFSFOpportunityScreenshots\\OpportunityScreenshot"+timestamp+".jpeg";
		File desfile = new File(filepath);
		FileUtils.copyFile(scrfile, desfile);
		
	}
	
	public void SFDCLeadstakescreenshot(WebDriver driver) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File  scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		Date currentdate = new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentdate);
		String filepath = "C:\\TekArchTraining\\TestNGScreenshots\\SFLeadsScreenshots\\LeadsScreenshot"+timestamp+".jpeg";
		File desfile = new File(filepath);
		FileUtils.copyFile(scrfile, desfile);
		
	}

	public void SFDCContactstakescreenshot(WebDriver driver) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File  scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		Date currentdate = new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentdate);
		String filepath = "C:\\TekArchTraining\\TestNGScreenshots\\SFContactsScreenshots\\ContactsScreenshot"+timestamp+".jpeg";
		File desfile = new File(filepath);
		FileUtils.copyFile(scrfile, desfile);
		
	}
	
	public void SFDCRandomtakescreenshot(WebDriver driver) throws IOException {
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File  scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		Date currentdate = new Date();
		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentdate);
		String filepath = "C:\\TekArchTraining\\TestNGScreenshots\\SFRandomScreenshots\\RandomScreenshot"+timestamp+".jpeg";
		File desfile = new File(filepath);
		FileUtils.copyFile(scrfile, desfile);
		
	}
}
