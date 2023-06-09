package handlecheckbox_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDownwithoutSelect {

	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		

		// clicking on the dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));

		// find total number of options
		System.out.println("Total number of options:" + options.size());

		// print all the options from dropdown

		// using normal for loop
		/*
		 * for(int i=0;i<options.size();i++) {
		 * System.out.println(options.get(i).getText()); }
		 */

		// select options from dropdown
		/*
		 * for(int i=0;i<options.size();i++) { String option=options.get(i).getText();
		 * 
		 * if(option.equals("Java") || option.equals("Python")) {
		 * options.get(i).click(); }
		 * 
		 * }
		 */

		for (WebElement option : options) {
			String text = option.getText();
			if (text.equals("Java") || text.equals("Python")) {
				option.click();
			}
		}

	}
}