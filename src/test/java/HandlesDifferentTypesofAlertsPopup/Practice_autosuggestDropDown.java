package HandlesDifferentTypesofAlertsPopup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_autosuggestDropDown {
	
	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.bing.com/");
		
		driver.findElement(By.xpath("//div[@class='qfc']")).sendKeys("java");
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']"));
		System.out.println("The total of suggest dropdown is:"+list.size());
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if(list.equals("java compiler")) {
				
			}
			list.get(i).click();
			
			break;
		}
		}

	}


