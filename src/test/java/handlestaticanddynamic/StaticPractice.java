package handlestaticanddynamic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticPractice {

	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		// 1) Find total number of rows

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")); // 7 preferred
		rows.size();

		// 2) Find total number of columns

		//int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7  preferred
		//int rows=driver.findElements(By.tagName("tr")).size(); //8   prefered only if you have one single table
		//System.out.println("Number of rows:"+ rows); //7

		List<WebElement> rows1= driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		rows1.size();
		// 2) Find total number of columns
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		//int cols=driver.findElements(By.tagName("th")).size(); // dont prefer if you have multiple tables
		
		System.out.println("Number of columns:"+ cols); //4
		
		//3) Read specific row & column data
		
		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		System.out.println(value);
		
		//4) Read data from all the rows & columns
		
	    System.out.println("BookName"+ "   "+"author"+"     "+"Subject"+"      "+"Price");
	    
	    for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t"); 
			}
			System.out.println();
		}
		
	}

}

