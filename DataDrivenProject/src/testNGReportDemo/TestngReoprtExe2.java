package testNGReportDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class TestngReoprtExe2 {

	// TODO Auto-generated method stub
	public void googleSearch() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		Reporter.log("Chrome browser opened....");

		driver.get("https://www.google.com/");

		Reporter.log("Google url opened....");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("India Gate");

		Reporter.log("india gate key entered....");
		searchBox.sendKeys(Keys.ENTER);

		Reporter.log("Enter key passed....");

	}
}
