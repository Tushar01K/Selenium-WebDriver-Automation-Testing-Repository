package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// consrtuctor

	LoginPage(WebDriver d) {
		driver = d;
	}

	By username = By.xpath("//*[@id=\"user-name\"]");
	By password = By.xpath("//*[@id=\"password\"]");
	By loginbtn = By.xpath("//*[@id=\"login-button\"]");

	public void EnterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}

	public void EnterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void login() {
		driver.findElement(loginbtn).click();

	}

}
