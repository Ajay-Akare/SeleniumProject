package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginStepDefination extends TestBase{

	
	static {
		try {launchDriver();}catch(Exception e) {}
	}
	
	LoginPage lp=new LoginPage(driver);
	
	@Given("Navigate to URL")
	public void navigat_to_URL() throws IOException {
		
	}

	@When("Enter username and password and click on login button")
	public void enter_username_and_password_and_click_on_login_button() {
		lp.username();
		lp.password();
		lp.loginbutton();
		lp.community();
			
	}

	@Then("user should land on homepage")
	public void user_should_land_on_homepage() {
   Assert.assertEquals(driver.getTitle(), "Log in - W3Schools");
	}
}
