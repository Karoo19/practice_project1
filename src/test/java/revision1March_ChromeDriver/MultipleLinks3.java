package revision1March_ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleLinks3 {
	
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://cnn.com");
		
		//witch HTML tag represent link
		
		List<WebElement>AllLinks = driver.findElements(By.tagName("a"));
		
		//total numbers of links  for cnn.com page today:
		
		System.out.println("totallinks today is: " + AllLinks.size());
		
		//I want to text of 12th link
		
		WebElement twelfth = AllLinks.get(13);
		System.out.println("text of these 12th is:  "+ twelfth.getText());
		
		//print all links for cnn.com homepage
		
		for(int i=1; i< AllLinks.size(); i++) {
			WebElement Totallinks= AllLinks.get(i);
			System.out.println(Totallinks.getText());
		}
		
		
		

	}

}
