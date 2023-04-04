package datapickerdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDownHiddenOptions {

	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

		// Dropwdown

		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]")).click();// opens the dropdown

		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));

		for (WebElement option : options) {
			//System.out.println(option.getText());
			if (option.getText().equals("Finance Manager")) {
				option.click();
				break;
			}
		} 

	}

}
