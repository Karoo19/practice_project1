package locatoresrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpaths_Understanding {

	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//html[@attribute='value'] 
		//input[@id='login1']
		//input[@id='login1' and @name='login']
		//input[@id='login1' or @name='login']
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys();
		
		//html[text()='value']
		//u[text()='Forgot Password?']
		//u[contains(text(), 'Forgot Password?')]
		//input[contains(@id, 'password')]
		//driver.findElement(By.xpath("u[text()='Forgot Password?']")).click();

	}

}
