package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;

	@FindBy(id = "user-name")
	@CacheLookup
	WebElement txtUsername;

	@FindBy(id = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(id = "login-button")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(className = "login_logo")
	@CacheLookup
	WebElement logoLoginDisplay;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SetUserName(String username) {

		txtUsername.sendKeys(username);
	}

	public void SetPassword(String password) {

		txtPassword.sendKeys(password);
	}

	public void ClickLogin() {
		btnLogin.click();
	}

	public void LogoLoginDisplay() {
		logoLoginDisplay.isDisplayed();
	}

}
