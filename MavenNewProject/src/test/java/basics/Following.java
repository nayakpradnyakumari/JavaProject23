package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Following {

	public static void main(String[] args) {          // following is used suppose u get only one attribute unique eg username & rest all are not unique then with that unique attribute remove others by giving its html tah & no of positionafter username it has that number as done down

        WebDriverManager.chromedriver().setup();       // u can even start from anywhere user name or password give the correct number
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='username']//following::input[1]")).sendKeys("manager");
		
		driver.findElement(By.xpath("//input[@id='username']//following::a[1]")).click();
		
	//	driver.findElement(By.xpath("//input[@id='username']//following::input[2]")).sendKeys("keep me logged in");       // for keep me loged in option bcoz password is the first to have input after that this is second on the page so 2. 

	//	driver.findElement(By.xpath("//input[@id='username']//following::a[1]")).click();    // forgot password
		
		
	}

}
