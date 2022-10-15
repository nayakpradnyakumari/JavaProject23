package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragdrop2 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
		driver.switchTo().frame(iframe1);
		
		 WebElement dropdown = driver.findElement(By.xpath("//input[@id = 'datepicker']"));   //Source
		
		 driver.findElement(By.xpath("//span[text() = 'September']")).click();
		 
		 driver.findElement(By.xpath("//span[text() = '2022']")).click();
		 
		 driver.findElement(By.xpath("//a[text() = '7']")).click();
		 
		 
		 

	}

}
