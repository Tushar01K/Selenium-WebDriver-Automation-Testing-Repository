import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LmsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://103.120.250.179:8085/lms/");

		driver.findElement(By.xpath("/html/body/button[2]")).click();
		driver.findElement(By.xpath("/html/body/button[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-loginmain/div[1]/input[1]")).sendKeys("7378893585");
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-loginmain/div[1]/input[2]")).sendKeys("2909");
	WebElement selectEle =	driver.findElement(By.xpath("/html/body/app-root/div/div/app-loginmain/div[1]/select"));
	Select select = new Select(selectEle);
	select.selectByIndex(4);
	driver.findElement(By.xpath("/html/body/app-root/div/div/app-loginmain/div[1]/button")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/div/app-alwaysactive/button[1]")).click();
//	driver.findElement(By.xpath("/html/body/app-root/div/div/app-studenttest/button[2]")).click();
//	Alert alert = driver.switchTo().alert();
//	alert.accept();
//	driver.switchTo().defaultContent();
	
	}

}
