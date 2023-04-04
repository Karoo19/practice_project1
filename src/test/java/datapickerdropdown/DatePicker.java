package datapickerdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {
	
	public static ChromeOptions options;
	public static WebDriver driver;
	//public static WebDriverWait wait;

	public static void main(String[] args) {
		
		options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		//Approch1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("3/21/2023");     //month-date-year
		
		//Approche2
		
		//SELECT MONTH AND YEAR
		
		String year="2023";
		String month="March";
		String date="12";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // will open the date picker
		
		while(true)
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  // Future date
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   //Past date
			
			
		}
		
		
		//select date
		
				List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				
				for(WebElement dt:allDates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						break;
					}
				}
		
		/*for(int i=0; i<AllDates.size();i++)
		{
			if(AllDates.get(i).getText().equals(date))
			{
				AllDates.get(i).click();
				break;
			}*/
			
		}
		
	
		
		
		

	}


