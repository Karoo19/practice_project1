package handleallertpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertWithInputBox {

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

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

		Alert alertwindow = driver.switchTo().alert();

		System.out.println(alertwindow.getText());

		alertwindow.sendKeys("welcome");

		alertwindow.accept();
		// alertwindow.dismiss();

		// validation

		String act_text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		String exp_text = "You entered: welcome";

		System.out.println(act_text);
		System.out.println(exp_text);

		if (act_text.equals(exp_text)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
