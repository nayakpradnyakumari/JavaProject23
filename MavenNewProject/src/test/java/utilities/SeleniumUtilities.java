package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtilities {
	
	public static WebDriver driver = null;
	
	public WebDriver setuUp(String browserName, String url) {
			
		if (browserName.equalsIgnoreCase("chrome")) {          // in ignorance its ok to write capital & small chrome
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("firefox")) {          // in ignorance its ok to write capital & small chrome
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			
		}
		else if (browserName.equalsIgnoreCase("edge")) {          // in ignorance its ok to write capital & small chrome
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 
		}
			
        driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;
	}

}
