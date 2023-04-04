package annotation_pack2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	void test2()
	{
		System.out.println("this is xyz from test2");
	}
	
	@AfterTest
	void m()
	{
		System.out.println("this is after test");
	}
}
