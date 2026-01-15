package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utils;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By Text = By.linkText("Text Input");
	By MyButton = By.cssSelector("#newButtonName");
	By ButtonUpdate = By.cssSelector("#updatingButton");
	By LoadDelay = By.cssSelector("[href='/loaddelay']");

	Utils ObjUtils = new Utils();

	public void EnterDetails() {

		ObjUtils.Click(driver, Text);
		ObjUtils.Sendkeys(driver, MyButton, "FirstButton");
		ObjUtils.Click(driver, ButtonUpdate);
		ObjUtils.GetText(driver, ButtonUpdate);

	}

	public void ClickOnLoadDelay() {
		ObjUtils.Click(driver, LoadDelay);

	}

}
