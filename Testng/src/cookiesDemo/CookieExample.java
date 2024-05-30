package cookiesDemo;

import java.util.Set;

import org.apache.hc.client5.http.cookie.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		// capture all cookies

		Set<org.openqa.selenium.Cookie> cookielist = driver.manage().getCookies();

		System.out.println(cookielist.size());

//		for (org.openqa.selenium.Cookie ck : cookielist) {
//
//			System.out.println(ck.getName() + " : " + ck.getValue());
//		}

		// get specific cookie according to specific name

		// System.out.println(driver.manage().getCookieNamed("session-token"));

		
		//bakiche rahilet methods
	}

}
