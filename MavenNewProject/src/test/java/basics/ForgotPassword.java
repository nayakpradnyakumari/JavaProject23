package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://demo.actitime.com/login.do");
		
			driver.manage().window().maximize();
			
		//	WebElement forgotpwd = driver.findElement(By.linkText("Forgot your password?"));
			
		//	Thread.sleep(5000);
			
         //       forgotpwd.click();
                
                //or
                WebElement forgotpwd = driver.findElement(By.partialLinkText("Forgot"));  //partial any one value can take & run
                forgotpwd.click();
	}

}
