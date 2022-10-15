package iframe;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.NoAlertPresentException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Alert3 {

		public static void main(String[] args) throws InterruptedException {
			
		//	WebDriverManager.firefoxdriver().setup();
			
		//	FirefoxDriver driver = new FirefoxDriver();
			
			WebDriverManager.chromedriver().setup();
			
		    ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();  //Close button

			driver.findElement(By.xpath("//div[@class='_37M3Pb']//child::div[8]")).click();  //Travel
			
			try {
				driver.switchTo().alert().accept();
			}
			/*
			catch(NoAlertPresentException ex) {
				System.out.println("Exception handled " + ex);
			}
			*/
			catch(Throwable ex) {
				System.out.println("Exception handled " + ex);
			}
			
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[text()='Round Trip']")).click();  //Round Trip
			

		}	

	}


