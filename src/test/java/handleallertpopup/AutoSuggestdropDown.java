package handleallertpopup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestdropDown {

	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(3000);

		List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
		
		System.out.println("Number of suggestions:"+list.size());
		
		
		//select an option from list
		for(int i=0;i<list.size();i++)
		{
			String text=list.get(i).getText();
			
			if(text.equals("selenium tutorial"))
			{
				list.get(i).click();
				break;
			}

	
		
		}
	}
}

