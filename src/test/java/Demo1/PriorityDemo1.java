package Demo1;

import org.testng.annotations.Test;

public class PriorityDemo1 {
	
	@Test (priority = 1)
	public void methodOne() {
		
		System.out.println("MethodOne will be print");
	
	}
	@Test(priority = 2)
	public void methodTwo() {
		
		System.out.println("MethodTwo will be print");
	}
	
	@Test
	public void methodThree() {
		
		System.out.println("MethodThree will be print");
	}

	@Test(priority = 1)
	public void methodFour() {
		
		System.out.println("Methodfour will be print");
}
}
