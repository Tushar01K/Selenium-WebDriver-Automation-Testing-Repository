package Demo1.mavaen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to count & print hyperlinks on web page

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		List<WebElement> listLink = driver.findElements(By.tagName("a"));
		System.out.println(listLink.size());

	}

}
