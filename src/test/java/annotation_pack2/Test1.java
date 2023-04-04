package annotation_pack2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {


	@Test
	void test1()
	{
		System.out.println("this is abc from class1");
	}

	@BeforeTest
	void m()
	{
		System.out.println("this is before test");
	}
	
	@BeforeSuite
	void bs()
	{
		System.out.println("this is before suite method");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is after suite method");
	}
}
