package annotation_dependency_method_assertionduplicate;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTest1 {

	@Test
	void xyz() {
		System.out.println("this is xyz from class1 ");
	}
	
	@BeforeTest
	void mm() {
		System.out.println("this is before test method");
	}
	
	@BeforeSuite
	void bs() {
		System.out.println("this is before suite method");
	}
	
	@AfterSuite
	void as() {
		System.out.println("this is after test method");
	}

}
