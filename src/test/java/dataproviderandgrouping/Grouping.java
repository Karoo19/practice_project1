package dataproviderandgrouping;

import org.testng.annotations.Test;

public class Grouping {
	
	//loginbyEmail         -sanity * regression
	//login by facebook    -sanity
	//login by twitter     -sanity
	
	//sign up by email        -sanity & regression
	//sign up by facebook     -regression
	//sign up twitter         -regression
	
	//payement in rupees      -sanity & regression
	//payement in $           -regression

	
	
	@Test(priority=1, groups= {"sanity","regression"})
	void loginByEmail() {
		System.out.println("this is login by email");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("this is login by facebook");
	}
	@Test(priority=3, groups= {"sanity"})
	void loginByTwitter() {
		System.out.println("this is login by twitter");
	}
	@Test(priority=4, groups= {"sanity","regression"})
	void Signupbyemail() {
		System.out.println("this is sign by email");
	}
	@Test(priority=5, groups= {"regression"})
	void signupbyfacebook() {
		System.out.println("this is signup by facebook");
	}
	@Test(priority=6, groups= {"regression"})
	void signupbytwitter() {
		System.out.println("this is sign up by twitter");
	}
	@Test(priority=7, groups= {"sanity","regression"})
	void payementindollar() {
		System.out.println("this is payement in dollar");
	}
	@Test(priority=8, groups= {"sanity"})
	void payementinruppees() {
		System.out.println("this is payement in ruppes");
	}
	
	@Test(priority=9, groups= {"regression"})
	void payementreturnbyBank() {
		System.out.println("this is payement return by bank");
	}
	
	
	
	
	
	
	
	
}

