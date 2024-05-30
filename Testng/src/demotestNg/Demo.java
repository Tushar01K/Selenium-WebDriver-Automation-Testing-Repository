package demotestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {


	@org.testng.annotations.Test(dataProvider = "SearchDataSet",dataProviderClass = dataproviderMethodforDemoClass.class)
	public void Test(String country, String monument) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys(country + " " + monument);
		driver.findElement(By.name("btnK")).submit();

	}
}
