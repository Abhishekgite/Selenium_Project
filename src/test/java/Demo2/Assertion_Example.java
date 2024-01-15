package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Example {
	@Test
	public void verifyValidTC() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualURL = driver.getCurrentUrl(); // Get the current URL
		
		
		SoftAssert sa = new SoftAssert();
		
		String expURL = "https://open-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		sa.assertEquals(actualURL, expURL);
		
		sa.assertAll();
		
		

}
}