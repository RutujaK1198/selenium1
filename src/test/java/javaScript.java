import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript {

	public static void main(String[] args) {

		//WebDriver driver= new ChromeDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;  // if we use WebDriver

		JavascriptExecutor js=driver;  //cause JavaScriptExecutor is a parent of chromeDriver. No need of typecasting
		
		//input box
		WebElement name=driver.findElement(By.xpath("//input[@id=\"name\"]"));
		js.executeScript("arguments[0].setAttribute('value','Rutu')", name);
		
		//radio button
		WebElement female_rd=driver.findElement(By.xpath("//input[@id=\"female\"]"));
		//female_rd.click();  //InterruptedException due to delay
		js.executeScript("arguments[0].click();", female_rd);  //arguments[0] always cause we r interacting with one element at a time
		
		//check box
		WebElement sunday=driver.findElement(By.xpath("//input[@id=\"sunday\"]"));
		js.executeScript("arguments[0].click();", sunday);
		
		
		//same for submit button as we perform click action on submit button
	}

}
