package assignement_automation;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverIssue {

	

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().browserVersion("111.0.5563.64").setup();

		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeOptions options = new ChromeOptions();

		//options.addArguments("--headless");

		options.addArguments("--disable-notifications");

		options.addArguments("--disable-gpu");

		options.addArguments("--disable-extensions");

		options.addArguments("--no-sandbox");

		options.addArguments("--disable-dev-shm-usage");

		options.addArguments("--remote-allow-origins=*");  // this i added  this and it worked, Thanks a ton  xinchao zhang !! 

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		options.merge(capabilities);

		wd = new ChromeDriver(options);

		wd.manage().window().maximize();

		wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
