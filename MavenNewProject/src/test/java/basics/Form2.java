package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form2 {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id = 'g2599-name']")).sendKeys("Pradnya");
		
		driver.findElement(By.xpath("//input[@id = 'g2599-email']")).sendKeys("test3@gmail.com");
		
		driver.findElement(By.xpath("//input[@id = 'g2599-website']")).sendKeys("https://www.globalsqa.com/samplepagetest/");

        WebElement spoil = driver.findElement(By.id("g2599-experienceinyears"));
		
		Select one = new Select(spoil);
		
		one.selectByVisibleText("1-3");

		driver.findElement(By.xpath("//input[@value = 'Functional Testing']")).click();
		
		driver.findElement(By.xpath("//input[@value = 'Automation Testing']")).click();
		
		driver.findElement(By.xpath("//input[@value = 'Manual Testing']")).click();
		
		driver.findElement(By.xpath("//input[@value = 'Graduate']")).click();
		
		driver.findElement(By.xpath("//textarea[@id = 'contact-form-comment-g2599-comment']")).sendKeys("Assignment completed");
	    Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class = 'pushbutton-wide']")).click();

	}

}
