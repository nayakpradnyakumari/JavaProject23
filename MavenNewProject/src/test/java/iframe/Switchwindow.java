package iframe;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchwindow {

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
		
		String window1 = windowList.get(0);      // phones list
		String window2 = windowList.get(1);     // particular phone detail after clicking on it i.e here infinity clicked
		
		driver.switchTo().window(window2);       // switching to window2
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@class ='_2KpZ6l _2U9uOA _3v1-ww']")).click(); // add to cart
	}

}
