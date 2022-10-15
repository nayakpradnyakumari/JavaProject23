package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
	
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.cssSelector("input[class*='_2IX_2- VJZDxU']"));
		username.sendKeys("7028831791");
	
		WebElement pwd=driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']"));
		pwd.sendKeys("m@yudn111219");
	
		WebElement login =driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']"));
		login.click();
		Thread.sleep(3000);
	
	
		WebElement search=driver.findElement(By.cssSelector("input[class='_3704LK']"));
		search.sendKeys("mobiles" + Keys.ENTER);
	
		driver.findElement(By.cssSelector("div[class='_1kidPb']>*:first-child")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='_1kidPb']>*:last-child")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span[class^='_2I9KP_']>*:last-child")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='_1kidPb']>span:nth-of-type(6)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='_1kidPb']>*:nth-child(4)")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='_1kidPb']>*:last-child")).click();
		Thread.sleep(3000);
	

	}

}
