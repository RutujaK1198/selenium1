import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertWithInputBox {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(010));  //implicit
		
		//WebDriverWait myWait= new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		 Alert alertWindow=driver.switchTo().alert();
		 alertWindow.sendKeys("Welcome");
		 alertWindow.accept();
		 
		 //validation
		 String act_text= driver.findElement(By.xpath("//p[@id='result']")).getText();
		 String exp_text="You entered: Welcome";
		 
		 if(act_text.equals(exp_text))
		 {
			 System.out.println("Test passed");
		 }
		 
		 
		 
		 
		 

	}

}
