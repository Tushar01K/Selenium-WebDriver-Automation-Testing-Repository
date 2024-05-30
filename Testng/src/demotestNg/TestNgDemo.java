package demotestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import org.testng.Assert;

@Test
public class TestNgDemo {

	public void verifyingPageTitle() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();

	}

}
