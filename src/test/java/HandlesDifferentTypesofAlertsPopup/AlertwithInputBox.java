package HandlesDifferentTypesofAlertsPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertwithInputBox {

	public static void main(String[] args) {

		WebDriver driver;

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

		Alert alertwindow = driver.switchTo().alert();

		System.out.println(alertwindow.getText());

		alertwindow.sendKeys("welcome");

		// alertwindow.accept();
		// alertwindow.dismiss();

		// validation

		String act_text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		String exp_text = "You entered: welcome";

		if (act_text.equals(exp_text))
			;
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}

		
	
	}

}
