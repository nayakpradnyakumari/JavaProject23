package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		//Iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
	/*	
		WebElement resize = driver.findElement(By.xpath("//div[@id = 'resizable']//following::div[2]"));    // to drag that corner button so took that as child, u can directly take that child locators instead using parent & child
		                                                                                                     // this was for downside
		Thread.sleep(10000);
		
		Actions action = new Actions(driver);
	//	action.dragAndDropBy(resize, -80, -70).perform();
		action.dragAndDropBy(resize, 260, 260).perform();
	*/	
		//or
      WebElement resize = driver.findElement(By.xpath("//div[@id = 'resizable']//following::div[1]"));    //which side wanna drag take that side elements in xpath & give the values, this is for right side
		
		Thread.sleep(10000);
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 220, -220).perform();
		
		
	}
}