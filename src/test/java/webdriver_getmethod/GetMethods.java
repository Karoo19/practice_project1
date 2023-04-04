package webdriver_getmethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethods {
	
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		System.out.println("title of the page is: "+driver.getTitle());
		
		System.out.println("current URL:"+ driver.getCurrentUrl());
		
		/*System.out.println("page source.........");
		//System.out.println(driver.getPageSource());
		
		String ps=driver.getPageSource();
		System.out.println(ps);
		System.out.println(ps.contains("html"));*/
		
		System.out.println(driver.getWindowHandles());  //[12251D9474F012D83FFD50CCE8EEBA9A]
		                                                //[4A91C32D4F8FDF6B82F8311F40A133BD]
		driver.findElement(By.linkText("Desktops")).click();
		
		Set<String>windowsids = driver.getWindowHandles();
		
		for(String winid:windowsids)
		{
			System.out.println(winid);
		}

	}

}
