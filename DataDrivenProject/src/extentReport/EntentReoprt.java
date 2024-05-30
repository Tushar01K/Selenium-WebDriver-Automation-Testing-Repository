package extentReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class EntentReoprt {

	ExtentSparkReporter htmlReporter;

	ExtentReports reports;
	ExtentTest test;
@BeforeTest
	public void startReport() {

		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");

		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		reports.setSystemInfo("Machine", "testpcl");
		reports.setSystemInfo("OS", "Window 10");
		reports.setSystemInfo("user", "Tushar");

		// configuration to change look and feel

		htmlReporter.config().setDocumentTitle("Test Report");
		htmlReporter.config().setReportName("Test Reeport");
		htmlReporter.config().setTheme(Theme.STANDARD);

	}
@Test
public void LaunchBrowser() {
	
	
	//create test
	
test=	reports.createTest("Lauch browser and open url");
	
	Assert.assertTrue(true);
}
@Test
public void VerifyTitle() {
	
	
	//create test
	
test=	reports.createTest("VerifyTitle....");
	
	Assert.assertTrue(false);
}

@Test
public void VerifyLogo() {
	
	
	//create test
	
test=	reports.createTest("VerifyLogo....");
	
	Assert.assertTrue(true);
}
@Test
public void VerifyEmail() {
	
	
	//create test
	
test=	reports.createTest("VerifyEmail....");
	
	throw new SkipException("skipping this test case with exception....");
}

@AfterMethod
public void getTestResult(ITestResult result) {
	
	
}







}