package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramterDemo {
	
	@Test
	@Parameters("url")
	public void method1(String myUrl) {

		WebDriver driver = new ChromeDriver();

		driver.get(myUrl);
		
		
//	@Test
//	@Parameters("test")
//	public void method1(int test1) {
//		
//		//WebDriver driver = new ChromeDriver();
//		
//		System.out.println(test1);
//		System.out.println(test1+20);
	
	}
	
	
	

}
