package paralleltesting_invocation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

	// 1)create test case
	// 2) create xml file to run test
	// 3)pass browser name parameter from xml to setup() method
	// 4)execute test case on chrome & edge (serial execution)
	// 5)execute test case on chrome & edge (parallel execution)

	public static WebDriver driver;
	public static ChromeOptions options;

	@BeforeClass
	@Parameters({"browser","url"})
	void test(String br, String appurl) throws InterruptedException {
		
		if(br.equals("chrome"))
		{
			driver= new ChromeDriver();
		}else if(br.equals("edge"))
		{
			
			driver=new EdgeDriver();
		}else {
			driver=new FirefoxDriver();
		}
		
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		//driver.get("http://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

	@Test(priority = 1)
	void testLogo() {
		try {
			boolean status = driver.findElement(By.linkText("Your Store")).isDisplayed();
			Assert.assertEquals(status, true);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test(priority = 2)
	void testHomeTitle() {
		Assert.assertEquals(driver.getTitle(), "Your Store", "title are both matched..");
	}

	@AfterClass
	void closeApp() {

		driver.quit();
	}

}
