package Salesforce.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	protected void comparetext(String Actual, String Expected) {
		Assert.assertEquals(Actual, Expected);
		}
	
	/*public static void waitforvisibility(int time,WebDriver element) {
		//WebDriver driver;
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
}*/
}