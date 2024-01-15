package Demo1;

import org.testng.annotations.Test;

public class PriorityDemoTestng {
	
	@Test(priority = 1)
	public void methodOne() {

		System.out.println("methodOne");
	}

	@Test(priority = 1)
	public void methodTwo() {

		System.out.println("methodTwo");
	}
	
	@Test
	public void methodThree() {

		System.out.println("methodThree");

}
	@Test(priority = 2)
	public void methodfour() {
		
		System.out.println("methodfour");
	}
}
