package handlecheckbox_Dropdown;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class checkBpxpractice1 {

	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		// select specific one checkbox
		driver.findElement(By.xpath("//input[@id='monday']")).click();

		// total number of checkboxes
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("The total number of chkbox is : " + checkboxes.size());

		// Select all the checkboxes
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		for(WebElement chkbox1:checkboxes)
		{
			chkbox1.click();
		}

		// Select last 2 checkboxes
		// total Number of checkboxes-how many checkboxes to be selected= startign index
				//7-3= 4 ( startign index)

		for(int i=4;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
		
	}

}
