import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions act= new Actions(driver);
		//right click --contextClick 
		act.contextClick(button).build().perform();
		
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click(); //clicked on copy button
		
		//click on copy will open alert window
		
		driver.switchTo().alert().accept();
	}

}
