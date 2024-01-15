package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider = "myData")
	public void LoginPage(String username, String password) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	}

	@DataProvider
	public Object[][] myData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "test1";
		data[0][1] = "secure123";

		data[1][0] = "test1";
		data[1][1] = "Secure456";
		return data;

	}

}
