package demotestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginForm {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/v1/");

//		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		
		
		Actions actions = new Actions(driver);
		
		Action seriesOfAction = actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"user-name\"]")))
				.click()
				.sendKeys("standard_user",Keys.TAB)
				.sendKeys("secret_sauce",Keys.ENTER).build();
		seriesOfAction.perform();
		
		
		
	}

}
