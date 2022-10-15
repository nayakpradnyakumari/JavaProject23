package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();  //click on close icon
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);  //search box
		
		Thread.sleep(3000);
		
		driver.navigate().back();  //FlipKart Homepage
		
		driver.navigate().forward();  //Again on List page of mobiles
		
		Thread.sleep(3000);
		
		driver.close();
		
	//driver.close() and driver.quit() - difference

	}

}