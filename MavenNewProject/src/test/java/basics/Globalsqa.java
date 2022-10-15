package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Globalsqa {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id = 'g2599-experienceinyears']"));
		
		Select one = new Select(dropdown);
		
		one.selectByVisibleText("1-3");         //1-3
		Thread.sleep(3000);
		
		one.selectByIndex(5);          //10+
		Thread.sleep(3000);
		
		one.selectByValue("7-10");       //7-10
		
		
	}

}
