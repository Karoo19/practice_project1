package HandlesDifferentTypesofAlertsPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenticatedPopop {
	
	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		if(text.contains("congratulation!")) {
			System.out.println("test passed");
		}else
		{
			System.out.println("test failed");
		}
		
		

	}

}
