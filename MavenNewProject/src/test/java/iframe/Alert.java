package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		
	//WebDriverManager.chromedriver().setup();
		
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();  //Close button

		driver.findElement(By.xpath("//div[@class='_37M3Pb']//child::div[8]")).click();  //Travel
		
		//ChromeOptions options = new ChromeOptions();
		FirefoxOptions options = new FirefoxOptions();
		//options.addArguments("--disable-notifications");
		
	//	driver.switchTo().alert().accept();   // to allow something
		//driver.switchTo().alert().dismiss();  // to cancel or block something
		
		driver.findElement(By.xpath("//div[text()='Round Trip']")).click();  //Round Trip
		
		
		/*
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Alert Handling")
				.ignoring(NoAlertPresentException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Round Trip']"))).click();
		*/
		
		
		
		
		
	}

}
