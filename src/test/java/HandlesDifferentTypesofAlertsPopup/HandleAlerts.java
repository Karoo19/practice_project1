package HandlesDifferentTypesofAlertsPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		
		Alert alertwindow=driver.switchTo().alert();
		
		System.out.println(alertwindow.getText());
		
		//alertwindow.accept();      //will accept alert window by click ok
		
		alertwindow.dismiss();    // will close alert window

	}

}
