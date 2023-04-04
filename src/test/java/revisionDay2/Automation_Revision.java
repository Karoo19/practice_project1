package revisionDay2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Automation_Revision {
	
	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
		driver.get("https://rediff.com");
		
		
		//what you want to do in the browser
		
		//id,class,name,linkText,partialLinkText,xpath,cssSelector,tagName  >> most popular
		//ByAll,ByidOrName,ByChained
		//near,above,below,toRightOf,
		
		//driver.findElement(By.clasName("bmailicon relative")).click();
		

		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();

	}

}
