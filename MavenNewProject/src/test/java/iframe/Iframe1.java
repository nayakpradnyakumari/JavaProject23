package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		//Iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		//To drag from source to destination
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));   //Source
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));   //Destination
		
		Thread.sleep(10000);
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();

		
	}

}
