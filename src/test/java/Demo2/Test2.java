package Demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	@Test   
	public void method1()  {
		
		System.out.println("test2method1");
	}

	@Test
	public void method2() {
		
		System.out.println("test2method2");
	
}
	
	@BeforeClass
	public void method3() {
		
		System.out.println("test2method3BeforeClass");
	
}
	
	@AfterClass
	public void method4() {
		
		System.out.println("test2method4AfterClass");
}
	@BeforeMethod
	public void method5() {
		
		System.out.println("test2method5BeforeMethod");
	
}

	@AfterMethod
	public void method6() {
		
		System.out.println("test2method6AfterMethod");
	
	}
}
	