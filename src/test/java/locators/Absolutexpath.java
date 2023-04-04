package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpath {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/a/span"));

	}

}
