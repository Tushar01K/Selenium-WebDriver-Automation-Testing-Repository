package Demo1.mavaen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/v1/");
//driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.tagName("input")).sendKeys("standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");
driver.findElement(By.className("btn_action")).click();

String currentWindowHandel = driver.getWindowHandle();

driver.switchTo().window(currentWindowHandel);
driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();

	}

}
