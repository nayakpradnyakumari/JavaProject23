package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Preceding {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();      // it will go from back, find the unique id of login according to that precede the html tag of that username & password & give the number by checking it on which position, take the cursor on attribute u will get
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://demo.actitime.com/login.do");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[@id=\"loginButton\"]//preceding::input[3]")).sendKeys("admin");
			
			driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[2]")).sendKeys("manager");
			
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();

	}

}
