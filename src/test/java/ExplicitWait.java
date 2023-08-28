import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
		
	WebDriverWait myWait= new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit, need to pass webDriver instance
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userName=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))); //conditions first priority, time is secondary
		userName.sendKeys("Admin");
		
		//driver.findElement(By.id("//input[@name='username']")).sendKeys("Admin");
		//driver.findElement(By.id("//input[@name='password']")).sendKeys("admin123");
		
		WebElement Password=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))); //conditions first priority, time is secondary
		Password.sendKeys("admin123");
		
	}

}
