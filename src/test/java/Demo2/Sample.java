package Demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	
		  @BeforeMethod //2
		  public void liginToPolicyBazaar() 
		  { 
		  System.out.println("Login to application"); 
		  } 
		  @Test 
		  public void validateUserName() 
		  { 
		  System.out.println("validateUserName"); 
		  } 
		  @AfterMethod  //4
		  public void logoutFromApplication() 
		  { 
		  System.out.println("Looging out...."); 
		  } 
		  @Test  //3
		  public void validateGender() 
		  { 
		  System.out.println("ValidateGender"); 
		  } 
		  @BeforeClass   // 1
		  public void launchBrowser() 
		  { 
		  System.out.println("LaunchBrowser and open url"); 
		  } 
		  @AfterClass 
		  public void closeBrowser() 
		  { 
		  System.out.println("Close Browser"); 
		  } 
		  
		}


