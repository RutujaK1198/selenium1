import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestedDropDown {

	public static void main(String[] args) {

		//this drop down options won't be same everytime
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium");
		
		//try to complete by own.
	}

}
