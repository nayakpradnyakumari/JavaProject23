package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass3product {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text() = 'Nokia lumia 1520']")).click();   //nokia phone

		driver.findElement(By.xpath("//a[@class = 'btn btn-success btn-lg']")).click();
		
        Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[@id = 'cartur']")).click();
		
		driver.findElement(By.xpath("//button[@class = 'btn btn-success']")).click();
		
		driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys("Pradnya");
		
		driver.findElement(By.xpath("//input[@id = 'country']")).sendKeys("India");
		
		driver.findElement(By.xpath("//input[@id = 'city']")).sendKeys("Solapur");
		
		driver.findElement(By.xpath("//input[@id = 'card']")).sendKeys("1234576");
		
		driver.findElement(By.xpath("//input[@id = 'month']")).sendKeys("September");
		
		driver.findElement(By.xpath("//input[@id = 'year']")).sendKeys("2022");
		
		driver.findElement(By.xpath("//button[text() = 'Purchase']")).click();
		
		 Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text() = 'OK']")).click();
		
	}

}
