package ToptechSchool.Toptech_testAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Basics {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		//WebDriver driver; = new ChromDriver();
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		//driver.get("https://www.facebook.com");
		
		
		
		
		
		
		

	}

}
