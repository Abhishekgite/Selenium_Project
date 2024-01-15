package Demo2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	
	@Test
	public void method1() {
		
		
		Assert.assertEquals("80", "80");
		System.out.println("Hello");
		
	}
	
	// SoftAssert
	@Test
	public void method2() {
		
		SoftAssert sa = new SoftAssert();  // object is created 
		sa.assertEquals(50, 30);
		System.out.println("Hello1");
		sa.assertAll();  // This is Mandatory line 
		
	}

}
