package revisionDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_revision {
	
	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
		driver.get("https://rediff.com");

	}

}
