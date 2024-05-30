package demotestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallelTesting {

	@Test
	public void Titel() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");

		Assert.assertEquals(driver.getTitle(), "Swag Labs");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();

	}

	@Test
	public void verifyLogo() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]"));

		Assert.assertTrue(logo.isDisplayed());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
