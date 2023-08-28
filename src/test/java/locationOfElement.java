import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class locationOfElement {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		
		System.out.println("Normal window size "+logo.getLocation());
		
		driver.manage().window().maximize();
		System.out.println("After maximizing "+logo.getLocation());
		
		driver.manage().window().minimize();
		System.out.println("After minimizing "+logo.getLocation());
		
		driver.manage().window().fullscreen();
		System.out.println("After full screen "+logo.getLocation());
		
		Point p= new Point(100,100);
		driver.manage().window().setPosition(p);
		System.out.println("after setting point "+logo.getLocation());
		
		
		
	}

}
