package revision1March_ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Multiplelinks6 {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("---remote-allow-origins=*");
		
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://cnn.com");
		
		
		//Witch HTML tag represent link??
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		
				
		//total number of links for cnn.com
		System.out.println("Total number of links is: "+ AllLinks.size() );		
				

			
		//i want to text of the 12 th links
	    WebElement twelfth = AllLinks.get(13);
	    System.out.println("Total of twelfth links is "+ twelfth.getText());
				
				
			
		//print all links presented in cnn.com webpage
		for(int i=1; i< AllLinks.size(); i++) {
			
			WebElement TotalOfLinks = AllLinks.get(i);
			System.out.println(TotalOfLinks.getText());
			
			
		}

	}

}
