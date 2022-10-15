package iframe;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchwindowiterator {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);
		
		System.out.println(driver.getTitle());
	
		driver.findElement(By.xpath("//img[@class = '_396cs4 _3exPp9' and @alt = 'Infinix HOT 12 Play (Horizon Blue, 64 GB)']")).click();

		Set<String> windowsID = driver.getWindowHandles();   // windowhandle is used for single window only for multiple use windowhandles, id changes everytime u run take from sir program handle wala
		
		ArrayList<String> windowList = new ArrayList<String>(windowsID);
		
		Iterator point = windowList.iterator();
		
		// by iterator has next method
		
		String window1 = (String)point.next();
		String window2 = (String)point.next();
		
		driver.switchTo().window(window2);
		
		driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2U9uOA _3v1-ww']")).click(); // add to cart
	}
}
		
		
		
		
		/*
		// by for each loop
		
		for (String window:windowList) {
			driver.switchTo().window(window).getTitle();
		}
		
		driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2U9uOA _3v1-ww']")).click(); // add to cart

	}

}
*/