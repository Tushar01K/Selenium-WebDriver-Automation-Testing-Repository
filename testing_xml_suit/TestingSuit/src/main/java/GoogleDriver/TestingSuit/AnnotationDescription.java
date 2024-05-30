package GoogleDriver.TestingSuit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationDescription {

//	@Test(description = "This is the test case....1")

	@Test(priority = 3)
	public void Test1() {
		System.out.println("Test case 1.....");
	}

	// @Test(description = "This is the test case....2")

	// @Test(timeOut = 200)

	//@Test(priority = 1)
	
	@Test(dependsOnMethods = {"Test4"})
	public void Test2() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test case 2.....");
	}

	@Test(priority = 4)
	// @Test(description = "This is the test case....3")
	public void Test3() {
		System.out.println("Test case 3.....");
		//Assert.assertTrue(false);
	}

	@Test(priority = 2)
	// @Test(description = "This is the test case....4")
	public void Test4() {
		System.out.println("Test case 4.....");
	}

}
