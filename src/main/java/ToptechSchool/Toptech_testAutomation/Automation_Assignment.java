package ToptechSchool.Toptech_testAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Assignment {
public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		String url = "https://testenvironment.toptechschool.us/";
		driver.get(url);
		
		//driver.get("https://login.gmail.com");
		
		//To findElement
		
	    
	    WebElement MyAccount =driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
	    MyAccount.click();


	    WebElement Login =driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
	    Login.click();

	    WebElement Email =driver.findElement(By.id("input-email"));
	    Email.sendKeys("najib.sakha7@gmail.com");
	    
	    WebElement password =driver.findElement(By.name("password"));
	    password.sendKeys("Nj@sk0306");
	    driver.findElement(By.id("signinbtn")).click();
	   
		WebElement image = driver.findElement(By.className("super_container"));
	    image.click();
	
	 
		WebElement productName = driver.findElement(By.className("text-left"));
		productName.click();
		
		 
	  
	    
		WebElement productType = (WebElement) driver.findElements(By.id(""));
	    productType.click();
	    
	    
	    WebElement checkOut = driver.findElement(By.id(""));
	    checkOut.click();
	  
	    
	    WebElement billingDetails = driver.findElement(By.xpath("<h2>Billing Details</h2>"));
	    billingDetails.click();
	  
	    
	    WebElement firstName = driver.findElement(By.id("input-firstName"));
	    firstName.sendKeys("Najibullah");
	
	    
	    WebElement lastName = driver.findElement(By.id("input-lastname]"));
	    lastName.sendKeys("Sakha");
	  
	    
	    WebElement country = driver.findElement(By.id("input-country"));
	    country.sendKeys("France");
	  
	    
	    WebElement address = driver.findElement(By.id("input-address"));
	    address.sendKeys("3 Rue de blory");
	  
	    
	    WebElement city = driver.findElement(By.id("input-city"));
	    city.sendKeys("Montigny Les Metz");
	 
	    
	    WebElement state = driver.findElement(By.id("input-state"));
	    state.sendKeys("Mosselle");
	   
	    
	    WebElement zipCode = driver.findElement(By.id("input-zipCode"));
	    zipCode.sendKeys("57950");
	 
	    
	    WebElement phone = driver.findElement(By.id("input-phone"));
	    phone.sendKeys("0618910188");
	  

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    
	    
		
	
		
		

	}

	}


