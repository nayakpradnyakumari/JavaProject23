package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginActitime {

	public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().fullscreen();  
		//or
		driver.manage().window().maximize();
		
		// for username button
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("admin");
		
		Thread.sleep(3000);                                            // it will wait for 3 seconds
		
		// for password button
       WebElement password = driver.findElement(By.name("pwd"));
    //   WebElement password = driver.findElement(By.className("pwdfield"));   // class name should be unique so first check then take , here partial took
		
		password.sendKeys("manager");
		
		// for login button
       WebElement login = driver.findElement(By.id("loginButton"));
		
		login.click();

	}

}
