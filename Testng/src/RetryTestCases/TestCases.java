package RetryTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void TestCase01() {
		Assert.assertTrue(false); // fail case
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void TestCase02() {
		Assert.assertTrue(false); // fail case
	}

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void TestCase03() {
		Assert.assertTrue(true); // pass case
	}
}
