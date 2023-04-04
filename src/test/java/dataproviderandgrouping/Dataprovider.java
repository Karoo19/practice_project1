package dataproviderandgrouping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Dataprovider {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
	 driver= new ChromeDriver();
		
	}
	
	@Test(dataProvider="dp")
	void testLogin(String username, String password) {
		driver.get("http://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.id("Username")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String exp_title = "nopcommerce demo store";
		String act_title = " driver.getTitle()";
		
		Assert.assertEquals(exp_title, act_title);
		
	}
	
	@AfterClass
	void tearDown() {
		
	}
	
	@DataProvider(name="dp")
	String [][] loginData(){
		String data[][] = {
			            	{"karoo", "Admin@123"},
				            {"karoo", "Admin@123"},
				            {"karoo", "Admin@123"},
				            {"karoo", "Admin@123"}
		                 };
		return data;
		
	}
	
	
	
	
}
