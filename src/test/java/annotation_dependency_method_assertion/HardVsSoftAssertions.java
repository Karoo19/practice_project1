package annotation_dependency_method_assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	@Test
	void test_hardAssertions()
	{
		System.out.println("testing.....");
		System.out.println("testing.....");
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		Assert.assertEquals(1,2);            // if it will fail then below statement will not be executed....
		//Assert.assertEquals(1, 1);             // if it will pass then below statement will  be executed....
		
		System.out.println("hard assertion completed...");
	}

	
	@Test
	void test_softassertion()
	{
		
		System.out.println("testing.....");
		System.out.println("testing.....");
		System.out.println("testing.....");
		System.out.println("testing.....");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);
		
		System.out.println("spft assertion completed......");
		
		sa.assertAll();      //mandatory required
	}
}
