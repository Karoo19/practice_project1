package revision1March_ChromeDriver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckingForChromeBrowser111 {
	
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");

	}

}
