package Demo1;

import org.testng.annotations.Test;

public class dependsondemo {
	
	@Test(dependsOnMethods = {"method2" , "method5"})
	public void method1() {
		
		System.out.println("method1 will print");
	}

	@Test
	public void method2() {
		
		
		System.out.println("method2 ");
	}
	
	@Test
	public void method3()
	{
		
		System.out.println("method3");
	}
	@Test
	public void method4() {
		
		System.out.println("method4");
	}
	@Test
	public void method5() {
		
		System.out.println("method5");
	
	
}
	
}
