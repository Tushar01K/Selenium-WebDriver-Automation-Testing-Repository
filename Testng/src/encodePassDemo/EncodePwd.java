package encodePassDemo;

import java.util.Base64;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodePwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//encode pwd
		
//		String pwd = "admin123";
//	byte[] encodePWD =	Base64.encodeBase64(pwd.getBytes());
//	System.out.println(new String(encodePWD));
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		

	}

}
