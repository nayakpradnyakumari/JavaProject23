package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		  
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Electronics']"));  // find anyway through text or by following or by parent child anyway
		
		Actions trip = new Actions(driver);             // take the cursor in between it will take aotomaticaaly driver while that import option
		
		trip.moveToElement(element).perform();    //it will only move the cursor to electronics by action
		
		

	}

}
