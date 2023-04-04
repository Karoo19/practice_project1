package annotation_dependency_method_assertionduplicate;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassTest2 {

	@Test
	void abc() {
		System.out.println("this is abc from class2 ");
	}

	@AfterTest
	void mm() {
		System.out.println("this is after test");
	}

}
