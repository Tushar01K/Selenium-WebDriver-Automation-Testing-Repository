package GoogleDriver.TestingSuit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNgParameters {

	@Test
	@Parameters({ "i", "j" })
	public void add(int a, int b) {
		System.out.println("Addition :" + (a + b));
	}

	@Test
	@Parameters({ "i", "j" })
	public void Sub(int a, int b) {
		System.out.println("Sub :" + (a + b));
	}

	@Test
	@Parameters({ "i", "j" })
	public void Mul(int a, int b) {
		System.out.println("Mul :" + (a + b));
	}

}
