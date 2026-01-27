package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	public void Click(WebDriver driver, By Locator) {
		driver.findElement(Locator).click();
	}

	public void Sendkeys(WebDriver driver, By Locator, String Value) {
		driver.findElement(Locator).sendKeys(Value);
	}

	public void ExplicitwaitToClickable(WebDriver driver, By Locator) {
		WebDriverWait ExplicitW = new WebDriverWait(driver, Duration.ofSeconds(3));
		ExplicitW.until(ExpectedConditions.elementToBeClickable(Locator));

	}

	public void GetText(WebDriver driver, By Locator) {
		String TEXT = driver.findElement(Locator).getText();
		System.out.println(TEXT);
	}

}
