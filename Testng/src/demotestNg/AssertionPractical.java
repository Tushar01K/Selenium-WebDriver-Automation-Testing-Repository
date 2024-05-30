package demotestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionPractical {

	@Test
	public void OpenURL() {
		
		SoftAssert soft = new SoftAssert();  //soft assert
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("verifying title.....");
		String expectedTitle ="Automation Testing Practice";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		soft.assertEquals(expectedTitle, actualTitle);
		
		
		
	System.out.println("verifying presence of wikipedia-icon");
	WebElement searchBtn= driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[1]/a/img"));
//	Assert.assertTrue(searchBtn.isDisplayed());  //Hard assert
	soft.assertTrue(searchBtn.isDisplayed());
	driver.close();
		
		
	}
	
	
}
