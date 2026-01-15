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

	Utils ObjUtils = new Utils();

	public void EnterDetails() {
		//To check the conflicts
		ObjUtils.Click(driver, Text);
		//To check the conflicts
		ObjUtils.Sendkeys(driver, MyButton, "FirstButton");
		//To check the conflicts
		ObjUtils.Click(driver, ButtonUpdate);
		//To check the conflicts
		ObjUtils.GetText(driver, ButtonUpdate);
		//To check the conflicts

	}

}
