package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        // username
        // CssSelector using any attribute                "html tag[attribute=value of that attribute']" (syntax)...but check it should be unique
        driver.findElement(By.cssSelector("input[id='user-name']"));
        driver.findElement(By.cssSelector("input[placeholder='username']"));   //can use any one from these but it should be unique
        driver.findElement(By.cssSelector("input[type='text']"));
        driver.findElement(By.cssSelector("input[name='user-name']"));
        driver.findElement(By.cssSelector("input[data-test='username']"));
	}

}
