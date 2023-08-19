package ToptechSchool.Toptech_testAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Locators {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		String url = "https://testenviroment.toptechschool.us/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.get("https://login.gmail.com");
		
		
		driver.findElement(By.cssSelector("#login-email")).sendKeys("najib.sakha7@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("login-singin")).click();
		
		
		
		
		

	}

}
