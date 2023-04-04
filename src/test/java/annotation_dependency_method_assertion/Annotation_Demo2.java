package annotation_dependency_method_assertion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotation_Demo2 {


	@BeforeClass
	void login() {
		System.out.println("login...");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("search...");
	}
	
	@Test(priority=2)
	void advancedSearch() {
		System.out.println("search advanced...");
	}
	
	@AfterClass
	void logout() {
		System.out.println("logout...");
	}
}



