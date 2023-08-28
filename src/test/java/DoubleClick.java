import java.time.Duration;

import javax.swing.plaf.basic.BasicIconFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("iframeResult");
		
		WebElement f1=driver.findElement(By.xpath("//input[@id=\"field1\"]"));
		f1.clear();
		f1.sendKeys("Welcome");
		
		WebElement button=driver.findElement(By.xpath("/html/body/button"));
		
		//need to double click on button to fill value in field 2
		
		Actions act= new Actions(driver);
		act.doubleClick(button).perform();
		WebElement f2=driver.findElement(By.xpath("//input[@id=\"field2\"]"));
	//	f2.getText();  //gettext won't work as attribute is given 
		String str=f2.getAttribute("value");
		System.out.println("Copied element "+ str);

		//for f2 value tag won't visible in DOM but value is creating in running time
		if(f2.equals("Welcome"))
		{
			System.out.println("Copied value is correct");
		}
		else
		{
			System.out.println("Copied value is not correct");
		}
}
}