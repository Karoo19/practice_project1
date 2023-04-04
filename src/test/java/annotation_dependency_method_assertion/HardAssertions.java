package annotation_dependency_method_assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test() {
		int x = 10;
		int y = 15;

		/*
		 * if(x==y) 
		 * {
		 *  System.out.println("test passed"); 
		 * }else
		 *  {
		 * System.out.println("test failed"); }
		 */

		// Assert.assertEquals(x, y);
		// Assert.assertTrue(true);
		// Assert.assertTrue(false);

		int a = 10;
		int b = 20;

		// Assert.assertEquals(actual, expected, description)
		// Assert.assertEquals(a>b, true, "a is not greater than b"); //false

		String s1 = "abc";
		String s2 = "abc1";

		// Assert.assertEquals(s1, s2,"String are not equal"); //pass
		// Assert.assertNotEquals(s1, s2); //failed

		if (true) {
			Assert.assertTrue(true);
		} else {
			// Assert.assertTrue(false);
			Assert.fail();
		}

	}

}
