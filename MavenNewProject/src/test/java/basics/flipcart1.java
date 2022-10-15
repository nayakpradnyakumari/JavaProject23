package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class flipcart1 {

			public static void main(String[] args) throws InterruptedException {
				
				 WebDriverManager.chromedriver().setup();
					
					ChromeDriver driver = new ChromeDriver();
					
					driver.get("https://www.flipkart.com/");
					
					driver.manage().window().maximize();
					
					//driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();     
					driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
					
					driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);
					Thread.sleep(5000);
					
					//driver.findElement(By.cssSelector("div[class='_1kidPb']>*:first-child")).click();    //1kidpb is parent      
					//Thread.sleep(5000);
					
					driver.findElement(By.cssSelector("div[class='_1kidPb']>*:last-child")).click();
					Thread.sleep(3000);
					
					driver.findElement(By.cssSelector("div[class='_1kidPb']>*:nth-child(5)")).click(); 
					Thread.sleep(3000);
					
					

			

	}

}