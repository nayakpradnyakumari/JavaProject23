package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;   // parent child xpath... see the syntax
public class Xpathflipcart2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class = '_3704LK']")).sendKeys("mobiles" + Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class = '_1kidPb']//child::a[2]")).click();       // offerzone
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class = '_1kidPb']//child::span[6]")).click();     // homes & furniture
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class = '_2I9KP_']//parent::div[1]")).click();    // parent full menu bar display
		
		
		
		
	}

}
