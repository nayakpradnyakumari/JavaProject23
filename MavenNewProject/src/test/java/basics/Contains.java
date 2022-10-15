package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contains {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@id, 'username')]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Password')]")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

	}

}
