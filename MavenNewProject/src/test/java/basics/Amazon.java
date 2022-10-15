package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
         WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//or
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.cssSelector("#email"));
		
		username.sendKeys("pradnyanayak3@gmail.com");
		
		Thread.sleep(3000);                                            // it will wait for 3 seconds
		
       WebElement password = driver.findElement(By.cssSelector("#pass"));
  
		password.sendKeys("Pradnya@97");
		
		
       WebElement Login = driver.findElement(By.cssSelector("#u_0_5_bN"));
		
		Login.click();

	}

}
