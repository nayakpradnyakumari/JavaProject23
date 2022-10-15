package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath2 {
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		//And   ---   //HtmlTag[@firstAttribute='value' and @secondAttribute='value']
		driver.findElement(By.xpath("//input[@class='textField' and @placeholder='Username']")).sendKeys("admin");
		
		//OR   ---   //HtmlTag[@firstAttribute='value' or @secondAttribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Password' or @class='textField pwdfield']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

	}
}