package annotation_dependency_method_assertion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is before suite....");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is after suite method");
	}
	
	@BeforeMethod
	void bm() {
		System.out.println("this is before method...");
	}
	
	@AfterMethod
	void am() {
		System.out.println("this is after method...");
	}
	
	@BeforeTest
	void bt() {
		System.out.println("this is before test method...");
	}
	@AfterTest
	void at() {
		System.out.println("this is after test method...");
	}
	
	
	@BeforeClass
	void bc() {
		System.out.println("this is before class...");
	}
	
	@AfterClass
	void ac() {
		System.out.println("this is after class...");
	}
	
	@Test
	void tm1()
	{
		System.out.println("this is test method1....");
	}
	
	@Test
	void tm2()
	{
		System.out.println("this is test method2");
	}
	

}
