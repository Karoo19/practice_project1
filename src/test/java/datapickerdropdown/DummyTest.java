package datapickerdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DummyTest {

	static void selectDate(WebDriver driver, WebElement datePicker, String date, String month, String year) {
		datePicker.click();

		Select drp = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
		drp.selectByVisibleText(month);

		drp = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
		drp.selectByVisibleText(year);

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));

		for (WebElement dt : dates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	public static ChromeOptions options;
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

		driver.findElement(By.id("product_550")).click(); // 990
		driver.findElement(By.id("travname")).sendKeys("John"); // First Given name
		driver.findElement(By.id("travlastname")).sendKeys("Kenedy"); // Last Surname (optional)
		driver.findElement(By.id("order_comments")).sendKeys("Testing"); // order_comments

		// Selecting DOB
		WebElement dobDatePicker = driver.findElement(By.xpath("//input[@id='dob']"));
		selectDate(driver, dobDatePicker, "9", "Jun", "1987"); // date, month,year //User defined method to select DOB.

		driver.findElement(By.id("sex_2")).click(); // Sex
		driver.findElement(By.id("traveltype_2")).click(); // Round Trip
		driver.findElement(By.name("fromcity")).sendKeys("Hyderabad"); // From city / Origin
		driver.findElement(By.name("tocity")).sendKeys("Delhi"); // To city. /Destination

		WebElement depdatePicker = driver.findElement(By.xpath("//input[@id='departon']"));
		selectDate(driver, depdatePicker, "30", "Mar", "2023");

		WebElement retdatePicker = driver.findElement(By.xpath("//input[@id='returndate']"));
		selectDate(driver, retdatePicker, "8", "Apr", "2023");

		// What is the dummy ticket for...? //Boostrap DropDown
		driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Visa extension" + Keys.ENTER);

		//Billing Details:
		
		
		driver.findElement(By.name("billname")).sendKeys("John");
		driver.findElement(By.name("billing_phone")).sendKeys("703-789-5417");
		driver.findElement(By.name("billing_email")).sendKeys("abcd@gmail.com");
		
		
		driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("United Kingdom (UK)" + Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("12 s potomac st");
		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Baltimore");
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("21224");
		
		driver.findElement(By.xpath("//button[@id='place_order']")).click();
	}

}
