package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage {

	WebDriver driver;

	@FindBy(id = "react-burger-menu-btn")
	@CacheLookup
	WebElement menu;
	@FindBy(xpath = "//nav[1]/a[@id='logout_sidebar_link']")
	@CacheLookup
	WebElement logoutLink;

	public productsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void MenuClick() {
		menu.click();
	}

	public void ClickLogout() {
		logoutLink.click();
	}
}
