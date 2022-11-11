package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.loginPage;
import pageobject.productsPage;
import utils.webdriverUtils;

public class loginSteps extends webdriverUtils {

	WebDriver driver = null;
	loginPage lp;
	productsPage pp;

	@Given("user navigate to login to the url")
	public void user_navigate_to_login_to_the_url() throws InterruptedException {

		driver = getDriver();
		driver.get("https://www.saucedemo.com/");

	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		lp = new loginPage(driver);

		lp.SetUserName(username);
		lp.SetPassword(password);
		Thread.sleep(2000);
	}

	@And("click on LOGIN button")
	public void click_on_login_button() {
		lp.ClickLogin();

//		 String error =driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
//		 if (error.contains("Epic sadface: Sorry, this user has been locked out.")) {
//		 Assert.fail(error);
//		 }

	}

	@Then("verify the first landing page")
	public void verify_the_first_landing_page() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertEquals("Swag Labs", driver.getTitle());

	}

	@When("click on logout button")
	public void click_on_logout_button() throws InterruptedException {
		pp = new productsPage(driver);
		pp.MenuClick();
		Thread.sleep(2000);
		pp.ClickLogout();
		Thread.sleep(2000);
	}

	@Then("verify the default home page")
	public void verify_the_default_home_page() throws InterruptedException {
		lp.LogoLoginDisplay();
		// driver.findElement(By.className("login_logo")).isDisplayed();
		driver.close();
	}

}
