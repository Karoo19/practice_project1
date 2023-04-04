package handleallertpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlert {

	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		//Alert alertwindow=driver.switchTo().alert();
		Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());

		System.out.println(alertwindow.getText());

		// alertwindow.accept(); // this will close alert window using ok button
		alertwindow.dismiss(); // close alert window by using cancel button

	}

}
