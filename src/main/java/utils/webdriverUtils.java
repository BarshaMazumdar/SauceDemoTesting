package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverUtils {
	public static WebDriver driver;

	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		return driver;
	}
}
