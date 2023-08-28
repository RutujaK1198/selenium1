import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//finding a xpath where to send keys
		driver.findElement(By.xpath("//textarea[@name=\"text1\"]")).sendKeys("Welcome to automation");
		
		//Actions class to add to perform copy paste etc operations
		
		Actions act= new Actions(driver);
		
		//ctrl +a
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		//control+c
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		//tab
	//	act.keyDown(Keys.TAB).keyUp(Keys.TAB);
		act.sendKeys(Keys.TAB).perform();  //directly use sendkeys for single button operation
		
		//control +v
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				
		
		
		
	}

}
