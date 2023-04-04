package HandlesDifferentTypesofAlertsPopup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestDropDown {
	
	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement>list=driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
		System.out.println("Number of suggestion is: "+list.size());

		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if(list.equals("selenium tutorial")) {
				
			}
			list.get(i).click();
			
			break;
		}
			
	}

}
