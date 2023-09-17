package pageObject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	//Constructor 
	//Constructor is invoked when object of this class is instantiated 
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//input[@id='modalusername']")
	WebElement username;

	@FindBy(xpath = "//input[@id='current-password']")
	WebElement password;

	@FindBy(xpath = "(//*[text()='Log in'])[2]")
	WebElement loginbutton;
	
	@FindBy(xpath = "(//*[text()='Community'])")
	WebElement community;
	
	
	public void username() {
		username.sendKeys("ajayakare@gmail.com");
	}

	public void password() {
		password.sendKeys("Xyzabc@123");
	}

	public void loginbutton() {
		loginbutton.click();
	}
	
	public void community() {
		community.click();
	}

	
}
