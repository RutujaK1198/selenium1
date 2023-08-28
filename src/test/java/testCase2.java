import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	
	 public static void main (String []args) throws InterruptedException 
	   {
		 
		 WebDriver driver= new ChromeDriver();
		 
		 //1.Open website with credentials
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		 //add username & password
		 driver.findElement(By.name("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 
		 //click on login
		 driver.findElement(By.id("login-button")).click();
		 
		 //to click link inside
		 driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		//driver.findElement(By.partialLinkText(" Labs "));   //generally we prefer linkText
		 
		 //all images in home page
		List <WebElement>images= driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
	   }
	 
	   }

