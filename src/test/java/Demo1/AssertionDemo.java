package Demo1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

	@Test
	public void method1() {

		Assert.assertEquals("20", "30");
		System.out.println("Hello");

	}

	// SoftAssert
	@Test
	public void method2() {

		SoftAssert sa = new SoftAssert(); // create an object of softassert
		sa.assertEquals(20, 30, "This amount will not matched");
		System.out.println("Hello");
		sa.assertAll(); // This is Madatory line
	}

}
