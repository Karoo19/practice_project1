package webdriver_getmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConditionalCommand {
	
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		//isDispalyed()   isEnabled()
		boolean status=driver.findElement(By.linkText("Your Store")).isDisplayed();
		System.out.println(status);
		
		WebElement searchkbox=driver.findElement(By.cssSelector("input.form-control.input-lg"));
		System.out.println("Display status:"+ searchkbox.isDisplayed());
		System.out.println("Display status:"+ searchkbox.isEnabled());
		
		//isSelected()
		
		WebElement yes_rd=driver.findElement(By.xpath("//div[@class='col-sm-10']//following::label[@class='radio-inline']/child::input[1]"));
		WebElement no_rd=driver.findElement(By.xpath("//div[@class='col-sm-10']//following::label[@class='radio-inline']/child::input[1]"));


		
}
}