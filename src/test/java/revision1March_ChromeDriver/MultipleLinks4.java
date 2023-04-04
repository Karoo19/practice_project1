package revision1March_ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleLinks4 {
	
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--restart-maximized");
		options.addArguments("---remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://cnn.com");
		
		
		//whitch html tag name:
		List<WebElement> AllLinks=driver.findElements(By.tagName("a"));
		
		//total number of links for cnn.com homePage
		System.out.println("total of links on HomePagecnn is:"+AllLinks.size());

		//I want all text on line 12 links
		WebElement twelfth = AllLinks.get(13);
		System.out.println("text of line 12 is "+ twelfth.getText());
		
		//print all liks presented on cnn .com
		
		for(int i=1; i<= AllLinks.size(); i++) {
			WebElement TotalOfLinks = AllLinks.get(i);
			System.out.println(TotalOfLinks.getText());
			
		}
		

	}

}
