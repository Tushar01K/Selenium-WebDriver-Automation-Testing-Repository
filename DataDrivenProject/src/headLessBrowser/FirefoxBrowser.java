package headLessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxBrowser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();

		FirefoxOptions options = new FirefoxOptions();

		// options.setHeadless(true);
		// Set headless mode
		options.addArguments("--headless");

		WebDriver driver = new FirefoxDriver(options);

		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("India Gate");
		searchBox.sendKeys(Keys.ENTER);
	}

}
