package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderWithExcel {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "searchDataProvider")
	public void searchKey(String keyword) {
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys(keyword);
		searchbox.sendKeys(Keys.ENTER);
	}

	@DataProvider(name = "searchDataProvider")
	public Object[][] searchDataProviderMethod() {
		String fileName = "C:\\Users\\HP\\OneDrive\\Desktop\\Sheet1.xlsx";
		return getExcelData(fileName, "Sheet");
	}

	public String[][] getExcelData(String fileName, String sheetName) {
		String[][] data = null;
		try (FileInputStream inputstream = new FileInputStream(fileName);
				XSSFWorkbook workBook = new XSSFWorkbook(inputstream)) {

			XSSFSheet excelSheet = workBook.getSheet(sheetName);
			int totalRows = excelSheet.getLastRowNum() + 1;
			int totalCells = excelSheet.getRow(0).getLastCellNum();
			data = new String[totalRows][totalCells];

			for (int currentRow = 0; currentRow < totalRows; currentRow++) {
				for (int currentCell = 0; currentCell < totalCells; currentCell++) {
					data[currentRow][currentCell] = excelSheet.getRow(currentRow).getCell(currentCell)
							.getStringCellValue();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}


//practile not done