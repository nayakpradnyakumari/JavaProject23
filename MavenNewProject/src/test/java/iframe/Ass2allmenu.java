package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass2allmenu {

	public static void main(String[] args) {
		
		    WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			    
			driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
			
		    WebElement allmenu = driver.findElement(By.xpath("//div[@class = '_331-kn _2tvxW']"));
			
			System.out.println("All menus are =" + allmenu.getText());
			
	}

}
