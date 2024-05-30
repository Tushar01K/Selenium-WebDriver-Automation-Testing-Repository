package headLessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		// options.setHeadless(true);
		// Set headless mode
		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");

		System.out.println(driver.getTitle());
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("India Gate");
		searchBox.sendKeys(Keys.ENTER);

	}

}
