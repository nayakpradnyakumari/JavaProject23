package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assdragdrop {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@class = 'demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe1);
		
		WebElement drag1 = driver.findElement(By.xpath("//img[@src = 'images/high_tatras2_min.jpg']"));   //Source
		WebElement drop1 = driver.findElement(By.xpath("//div[@id= 'trash']"));
		
      Thread.sleep(10000);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag1, drop1).perform();

	}

}
