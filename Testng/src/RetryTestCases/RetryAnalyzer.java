package RetryTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	// count to count retry attempts
	int countForRetryAttempt = 0;

	// setMaxLimitForRetry
	int setMaxLimitForRetry = 3;

	// method to retry failed test cases
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub

		if (!result.isSuccess()) {
			if (countForRetryAttempt < setMaxLimitForRetry) {
				countForRetryAttempt++;
				return true;
			}
		}
		return false;
	}

}
