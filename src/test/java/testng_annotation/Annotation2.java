package testng_annotation;

import org.testng.annotations.Test;

public class Annotation2 {

	@Test
	void open() {
		System.out.println("test1");
	}
	
	@Test
	void login() {
		System.out.println("test2");
	}
	
	@Test
	void logout() {
		System.out.println("test3");
	}

	
	
}