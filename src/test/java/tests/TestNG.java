package tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browser.Browsers;
import pages.HomePage;

public class TestNG extends Browsers {
	
	WebDriver driver;
	
	@Test
	public void ClickOnTables() throws InterruptedException {
		//To Check the conflicts
		//To Check the conflicts
		//To Check the conflicts
		//To Check the conflicts
		TestNG ObjTestNG = new TestNG();
		driver = ObjTestNG.ChoseBrowser(driver, "Chrome");
		driver.get("www.abc.com");
		driver.get("http://www.uitestingplayground.com/");
		//To Check the conflicts
		HomePage ObjHomePage = new HomePage(driver);
		//To Check the conflicts
		ObjHomePage.EnterDetails();
		//To Check the conflicts
		
		
	}

}
