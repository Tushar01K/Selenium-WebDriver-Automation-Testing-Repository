package GoogleDriver.TestingSuit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@AfterClass
	public void afteClass() {
		System.out.println("After Class....");
	}

	@BeforeClass
	public void beforClass() {
		System.out.println("before Class....");
	}

	@BeforeMethod
	public void beforMethod() {
		System.out.println("Befor Method.......");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method......");
	}

	@Test
	public void testCase() {
		System.out.println("Test Case 1.....");
	}

}
