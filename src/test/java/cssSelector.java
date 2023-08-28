import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//tag and id
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Samsung");
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Samsung"); //will match with element which comes first
		
		//tag and class
		//driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute")).sendKeys("macbook");  
		//driver.findElement(By.cssSelector("input.nav-input")).sendKeys("macbook");  //remove the text after space
		//driver.findElement(By.cssSelector(".nav-input")).sendKeys("macbook"); 
		
		//tag and attribute. we can use any attribute
		//driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("Women Clothes");
		//driver.findElement(By.cssSelector("[dir='auto']")).sendKeys("Women Clothes");
		
		
		//driver.findElement(By.cssSelector("input.nav-input[type='text']")).sendKeys("Foot wear");
				
       //by using relative x path
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("watches");
				
	}

}
