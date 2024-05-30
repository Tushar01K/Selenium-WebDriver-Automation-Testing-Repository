package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 
		 //create a loginpage object
		 
//		 LoginPage LoginPa = new LoginPage(driver);
		 LoginPage2 LoginPa = new LoginPage2(driver);
		 
		 
		 
		 driver.get("https://www.saucedemo.com/v1/");
		 LoginPa.EnterUsername("standard_user");
		 LoginPa.EnterPassword("secret_sauce");
		 LoginPa.login();

	}

}
