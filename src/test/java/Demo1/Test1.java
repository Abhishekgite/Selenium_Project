package Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void method1() {

		System.out.println("test1method1");
	}

	@Test
	public void method2() {

		System.out.println("test1method2");
	}

	@BeforeSuite
	public void method3() {

		System.out.println("test1method3BeforeSuite");
	}

	@AfterSuite
	public void method4() {

		System.out.println("test1method4AfterSuite");

	}

	@BeforeTest
	public void method5() {

		System.out.println("test1method5BeforeTest");
	}

	@AfterTest
	public void method6() {

		System.out.println("test1method6AfterTest");

	}
	
	@BeforeClass
	public void method7() {

		System.out.println("test1method7BeforeClass");
	}

	@AfterClass
	public void method8() {

		System.out.println("test1method8AfterClass");

	}
	

	@BeforeMethod
	public void method9() {

		System.out.println("test1method9BeforeMethod");
	
	
}
	

	@AfterMethod
	public void method10() {

		System.out.println("test1method10AfterMethod");
}
}