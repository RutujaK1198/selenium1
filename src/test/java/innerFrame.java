import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class innerFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://ui.vision/demo/webtest/frames/");
	Thread.sleep(5000);
	
	
	WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
	driver.switchTo().frame("frame1");
	driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("123456");
	
	}

}
