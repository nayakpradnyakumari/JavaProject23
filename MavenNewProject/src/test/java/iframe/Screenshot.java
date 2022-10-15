package iframe;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		//Iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']//child::div[3]"));
		
		Thread.sleep(10000);
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 150, -70).perform();
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);    // select java io file after dot
	//	FileUtils.copyFile(screenshot, new File(".//target//screenshot.png")); // select first copy file
		//or 
		
		FileUtils.copyFile(screenshot, new File(".//target//screenshot " + timestamp() + ".png"));

	}
	
	public static String timestamp() {
	return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());  // whlie importing select change to new date dont select first option to import after format this
				
	}
}