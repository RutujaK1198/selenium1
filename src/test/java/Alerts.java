import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(010));  //implicit
		
		WebDriverWait myWait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			//we can't inspect alert window
			// Alert alertWinow=driver.switchTo().alert();  //for implicit
			Alert alertWindow= myWait.until(ExpectedConditions.alertIsPresent()); //for explicit if implicit is taking to much
			System.out.println(alertWindow.getText());
			
			alertWindow.accept();  //will close alert window using ok button
			//alertWindow.dismiss(); //close alert using cancel button
			
	}

}
