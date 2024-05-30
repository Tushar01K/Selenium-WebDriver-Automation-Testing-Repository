package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Using Page Factory

public class LoginPage2 {
	WebDriver driver;

	LoginPage2(WebDriver d) {
		driver = d;

		// this method will be created web elements
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//*[@id=\"user-name\"]"))
	WebElement username;

	@FindBy(xpath = ("//*[@id=\"password\"]"))
	WebElement password;

	@FindBy(xpath = ("//*[@id=\"login-button\"]"))
	WebElement login;

	public void EnterUsername(String uname) {
		username.sendKeys(uname);
	}

	public void EnterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void login() {
		login.click();

	}

}
