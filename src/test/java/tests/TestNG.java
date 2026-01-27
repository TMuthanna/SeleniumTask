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
	public void ClickOnTables() {
		TestNG ObjTestNG = new TestNG();
		driver = ObjTestNG.ChoseBrowser(driver, "Chrome");
		driver.get("www.abc.com");
		driver.get("http://www.uitestingplayground.com/");
		HomePage ObjHomePage = new HomePage(driver);
		ObjHomePage.EnterDetails();

		driver.navigate().back();
		ObjHomePage.ClickOnLoadDelay();

	}

}
