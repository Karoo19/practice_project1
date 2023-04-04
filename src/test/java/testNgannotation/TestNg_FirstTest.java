package testNgannotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNg_FirstTest {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	@Test(priority=1)
	void openBrowser1()
	{
		options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("http://tutorialsninja.com/demo/");
	
		
	}
		
		
		@Test(priority=2)
		void login()
		{
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("karima10@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("karima@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
		
		
		@Test(priority=3)
		void close()
		{
			driver.quit();
		}
		
		
	

	
	
	
	

}
