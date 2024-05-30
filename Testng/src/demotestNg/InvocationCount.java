package demotestNg;

import org.testng.annotations.Test;

public class InvocationCount {

	
	@Test(invocationCount = 5)
	public void Method1() {
		System.out.println("Test Case 1...........");
	}
@Test
	public void Method2() {
		System.out.println("Test Case 2.............");
	}

}
