package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date1 {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//input[@id = 'datepicker']")).click();
		
		
		// current date
	  driver.findElement(By.xpath("//span[text() = 'September']")).click();
	   
	  driver.findElement(By.xpath("//a[text() = '7']")).click();
	   
	  driver.findElement(By.xpath("//span[text() = '2022']")).click();
	   
	   
		
		
	}

}
