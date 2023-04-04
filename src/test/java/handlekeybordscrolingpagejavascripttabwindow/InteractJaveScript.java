package handlekeybordscrolingpagejavascripttabwindow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InteractJaveScript {
	
	public static ChromeOptions options;
	public static WebDriver driver;
//	public static WebDriverWait wait;

	public static void main(String[] args) throws Exception {
		options = new ChromeOptions();

		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		driver.switchTo().frame(0);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//JavascriptExecutor js=driver;
		
		
		//First name - inputbox
		WebElement inputbox=driver.findElement(By.id("RESULT_TextField-1"));
		js.executeScript("arguments[0].setAttribute('value','john')", inputbox);
		
		//Radio button
		WebElement male_Rd=driver.findElement(By.id("RESULT_RadioButton-7_0"));
		//male_Rd.click();  //ClickInterceptedException
		js.executeScript("arguments[0].click();",male_Rd);
		
		
		//Checkbox
		WebElement chkbox=driver.findElement(By.id("RESULT_CheckBox-8_0"));
		js.executeScript("arguments[0].click();",chkbox);
		
		
		//button
		WebElement button=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();",button);
		
	}

}