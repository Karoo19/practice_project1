package assignement_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTest2 {

	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
	options = new ChromeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");


	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://rediff.com");

	}

}
