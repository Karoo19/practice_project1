package revision1March_ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleLinks2 {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	public static void main(String[] args) {
		

		options= new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://cnn.com");
		
		//which HTML tag represent link
		
		List<WebElement>AllLinks=driver.findElements(By.tagName("a"));
		
		//total number of links on cnn.com homepage
		
		System.out.println("Total number of links is:" +AllLinks.size());
		
		// I want text of 12th link
		
		WebElement twelfth = AllLinks.get(13);
		System.out.println("Text of the 12th link is:"+ twelfth.getText());
		
		//print all links present in the cnn.com homepage
		
		for(int i=1; i< AllLinks.size(); i++) {
			
			WebElement TotalLinks =AllLinks.get(i);
			System.out.println(TotalLinks.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
