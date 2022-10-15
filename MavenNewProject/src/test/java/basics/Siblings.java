package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Siblings {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class = '_2i7N3j']//following-sibling::div[3]")).click();  // it is same like parent child only difference is u have to choose the unique name as parent it can also be a child..n then through that go to parent by html tag n number.
                                                                                                        ////here everyone is sibling except one unique
		
		
		//driver.findElement(By.xpath("//div[@class ='_5THWM1']//ancestor::div[1]")).click();       //it will go from self to parent granparent by giving its html tag & nmbr otherwise it will go direct to first html tag similar...
	}

}
