package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();   
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		//Username 
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		//Password
		WebElement password = driver.findElement(By.className("pwdfield"));  //by using class name locator
		password.sendKeys("manager");
		
		//Login
		WebElement login = driver.findElement(By.id("loginButton"));  //by using id locator
		login.click();
		
		//Fluent Wait for Logout
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Find element logout")
				.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink"))).click();
		
		Thread.sleep(5000);
		
		//Forgot Password 
		driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
		
	}

}
