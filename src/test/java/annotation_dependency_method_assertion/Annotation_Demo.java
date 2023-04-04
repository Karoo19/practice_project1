package annotation_dependency_method_assertion;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Demo {
	
	@BeforeMethod
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
	
	@AfterMethod
	void logout() {
		System.out.println("logout...");
	}

}
