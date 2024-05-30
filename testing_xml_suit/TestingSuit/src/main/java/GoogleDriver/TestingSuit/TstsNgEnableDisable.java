package GoogleDriver.TestingSuit;

import org.testng.annotations.Test;

public class TstsNgEnableDisable {

	@Test(enabled = true)
	public void mobileLoan() {
		System.out.println("Mobile Loan....");
	}

	@Test(enabled = false)
	public void HomeLoan() {
		System.out.println("Home Loan....");
	}

	@Test(enabled = false)
	public void EmiLoan() {
		System.out.println("EMI Loan....");
	}

	@Test(enabled = true)
	public void PersonalLoan() {
		System.out.println("Personal Loan....");
	}
}
