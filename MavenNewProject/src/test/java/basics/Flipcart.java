package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();       //icon closed
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);   //search bar
		
		//driver.findElement(By.cssSelector("div[class='_5THWM1']>*:nth-child(5)")).click();        //price high to low 5th option
		
		driver.findElement(By.cssSelector("div[class='_5THWM1']>*:first-child")).click();        // sort by first option
		
	//	driver.findElement(By.cssSelector("div[class='_5THWM1']>*:last-child")).click();        // newest option last
		
		
		// or
	//	driver.findElement(By.cssSelector("div[class='_5THWM1']>div:last-of-type")).click();
		
	//	driver.findElement(By.cssSelector("div[class='_5THWM1']>div:first-of-type")).click();
		
	//	driver.findElement(By.cssSelector("div[class='_5THWM1']>div:nth-of-type(3)")).click();
		
		
		
		
	}

}
