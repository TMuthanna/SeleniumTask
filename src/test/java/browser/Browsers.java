package browser;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	public WebDriver ChoseBrowser(WebDriver driver, String Chose) {
		switch (Chose) {
		case "Firefox":
			driver = WebDriverManager.firefoxdriver().avoidShutdownHook().create();
			break;

		case "Chrome":
			driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
			break;

		case "Edge":
			driver = WebDriverManager.edgedriver().avoidShutdownHook().create();
			break;

		default:
			System.err.println("Mention Browser Name");

		}
		driver.manage().window().maximize();
		return driver;

	}

}
