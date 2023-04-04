package locatoresrevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators_automation {
	
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("http://rediff.com");
		

		//helped understand locators in selenium:
		//id,class,name,linkText,partialLinkText,xpath,cssSelector,tagName>> most popular
		
		//linkText
		//driver.findElement(By.linkText("Create Account")).click();
		
		//partialLinkText
	    driver.findElement(By.partialLinkText("creat acc")).click();
	    
	    List<WebElement> TotalWeb= driver.findElements(By.tagName("input"));
	    System.out.println("total web elements having input html tag are: "+ TotalWeb.size() );
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
