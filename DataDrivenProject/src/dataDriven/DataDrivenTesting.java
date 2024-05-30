package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {

	public static void main(String[] args, int currentRow) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook ExcelBook = null;
		XSSFSheet ExcelSheet;
		XSSFRow Row;
		XSSFCell Cell;

		// create an object of file class to open file

		File excelFile = new File("c:\\W3Villashortlistedlist.xlsx");

		FileInputStream inputStream = null;

		// craete an object of fileinputStream to read data from file

		try {
			inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//Excel->workbook->sheet->row->column 

		// create object of XSSFWorkbook to handel xlsx file

		ExcelBook = new XSSFWorkbook(inputStream);

		// to access workbook sheet
		ExcelSheet = ExcelBook.getSheetAt(0);

		// get total row count

		int totalrow = ExcelSheet.getLastRowNum() + 1;

		// get total no. of cells in a row
		int totalcells = ExcelSheet.getRow(0).getLastCellNum() + 1;

		for (int crrentRow = 0; currentRow < totalrow; currentRow++) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys(ExcelSheet.getRow(currentRow).getCell(0).toString());
			driver.findElement(By.name("password")).sendKeys(ExcelSheet.getRow(currentRow).getCell(1).toString());
			driver.findElement(By.id("login-button")).click();
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			for (int currentCell = 0; currentCell < totalrow; currentCell++) {

				System.out.println(ExcelSheet.getRow(crrentRow).getCell(currentCell).toString());

				System.out.println("\t");

			}

			System.out.println();

		}

	}

}















/////Practical Does Not Done Properly
