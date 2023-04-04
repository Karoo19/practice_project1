package revision1March_ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PriceOfTshirts {

	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=tshirts&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

		// Casual T shirts
		List<WebElement> casualTShirts = driver.findElements(By.cssSelector("img._2r_T1I"));
		System.out.println("total of casual T Shirts: " + casualTShirts.size());

		List<WebElement> priceTShirts = driver.findElements(By.cssSelector("//div[@ class='_30jeq3']"));
		System.out.println("total price T Shirts: " + priceTShirts.size());

	
		for (int i =0; i< casualTShirts.size(); i++) {
			System.out.println(casualTShirts.get(i).getText());
		}
	
	}

}
