package BatchTesting;

import org.testng.annotations.Test;

public class omeScreenTest {
//sanity Test
	@Test
	public void LaunchApplication() {
		System.out.println("Application launched Passed.... ");
	}
@Test
	public void VerifyTitle() {
		System.out.println("VerifyTitle Passed.... ");
	}
@Test
	public void VerifyLogo() {
		System.out.println("VerifyLogo Passed.... ");
	}

}
