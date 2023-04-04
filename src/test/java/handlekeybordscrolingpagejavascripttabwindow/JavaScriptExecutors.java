package handlekeybordscrolingpagejavascripttabwindow;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutors {
	
	public static ChromeOptions options;
	public static WebDriver driver;
//	public static WebDriverWait wait;

	public static void main(String[] args) throws Exception {
		options = new ChromeOptions();
        
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.switchTo().frame(0);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		

	}

}
