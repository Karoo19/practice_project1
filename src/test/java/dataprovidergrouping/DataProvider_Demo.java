package dataprovidergrouping;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Demo {

	public static WebDriver driver;
	public static ChromeOptions options;

	@BeforeClass
	void setup() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

	}

	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) {
		driver.get("https://demo.nopcommerce.com/registerresult/1?returnUrl=/privacy-notice");
		driver.manage().window().maximize();
		driver.findElement(By.id("Username")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input.btn.blue-button"));

		String exp_title = "//img[@title='nopCommerce']";
		String act_title = driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);

	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

	@DataProvider(name="dp", indices= {0,1,4})
	String [][] loginData(){
		String data[][] = {
			            	{"karima10@gmail.com", "karima@123"},
				            {"karima10@gmail.com", "karima@123"},
				            {"kaima112@gmail.com", "Admin@123"},
				            {"karoo", "Admin@123"}
		                 };
		return data;
		
	}

}
