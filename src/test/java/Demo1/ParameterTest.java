package Demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	
	@Test
	@Parameters("test")
	public void method(int test1) {

		//WebDriver driver = new ChromeDriver();	
		
		//driver.get(myUrl);
		
		System.out.println(test1);
		System.out.println(test1+20);
	}

}
