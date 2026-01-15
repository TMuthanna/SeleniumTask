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
		TestNG ObjTestNG = new TestNG();
		driver = ObjTestNG.ChoseBrowser(driver, "Chrome");
		driver.get("http://www.uitestingplayground.com/");
		
		HomePage ObjHomePage = new HomePage(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("Window.scrollBy(0,350)", "");
		ObjHomePage.EnterDetails();
		
		driver.navigate().back();
		ObjHomePage.ClickOnLoadDelay();
		
		
	}

}
