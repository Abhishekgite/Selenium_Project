package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_InvalidCreditional {

	@Test
	public void verifyValidTC() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin1");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//String actualURL = driver.getCurrentUrl(); // Get the current URL
		
		Thread.sleep(2000);
		
		String actualText = driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']")).getText();
		
		SoftAssert sa = new SoftAssert();

		//String exptURL = "https://opensour-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		String exptText = "Invalid credentials";

		sa.assertEquals(actualText, exptText);

		sa.assertAll();

	}

}
