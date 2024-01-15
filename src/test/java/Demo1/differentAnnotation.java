package Demo1;

import org.testng.annotations.Test;

public class differentAnnotation {
	
	@Test(invocationCount = 12)
	public void method1() {
		
		System.out.println("Hello");
	}

	@Test(enabled =true)
	public void method2() {
		
		System.out.println("hello1");
}
}
