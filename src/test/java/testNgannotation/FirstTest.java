package testNgannotation;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(priority=1)
	void test1()
	{
		System.out.println("testing1.......");
	}
	
	@Test(priority=2)
	void test2()
	{
		System.out.println("testing2.......");
	}

	@Test(priority=3)
	void test3()
	{
		System.out.println("testing3.......");
	}





}
