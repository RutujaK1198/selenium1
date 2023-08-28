import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement rome=driver.findElement(By.xpath("//div[@id=\"box6\"]")); //source- we have to move this
		WebElement italy= driver.findElement(By.xpath("//div[@id=\"box106\"]")); //target- rome will move here
		
		Actions act= new Actions(driver);
		act.dragAndDrop(rome, italy).perform();
		
		WebElement washington= driver.findElement(By.xpath("//div[@id=\"box3\"]"));
		WebElement usa= driver.findElement(By.xpath("//div[@id=\"box103\"]"));
		
		act.dragAndDrop(washington, usa).perform();
	}

}
