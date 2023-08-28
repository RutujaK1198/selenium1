import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver= new ChromeDriver();
 driver.get("https://www.amazon.in/");
 driver.manage().window().maximize();
 
 //driver.findElement(By.id("nav-logo-sprites"));
 WebElement logo=driver.findElement(By.xpath("//a[@id=\'nav-logo-sprites\']"));
 System.out.println(logo.isDisplayed());
 
WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
System.out.println(searchbox.isDisplayed());
System.out.println("Can we feed any value in searchbox   " +searchbox.isEnabled());
 
	}

}
