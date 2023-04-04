package handleallertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenticatePopup {
	
	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//http://the-internet.herokuapp.com/basic_auth
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		if(text.contains("Congratulations"))
		{
			System.out.println("successful login");
		}
		else
		{
			System.out.println("login failed");
		}


	}

}
