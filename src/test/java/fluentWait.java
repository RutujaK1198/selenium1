import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args) {

		//taken this example from selenium webpage
		WebDriver driver= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(50L))
			       .pollingEvery(Duration.ofSeconds(10L))   //polling time- within 50 sec it will find element every 10 sec
			       .ignoring(NoSuchElementException.class);
		 
	
		
		 WebElement userName = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//input[@name='username']"));

	}
		 });
		 userName.sendKeys("Admin");
		 
	}
}
	
	


