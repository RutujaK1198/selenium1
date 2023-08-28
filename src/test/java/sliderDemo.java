import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderDemo {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		
	Actions act=new Actions(driver);
	
	System.out.println("min location of slider i.e x & y points "+min_slider.getLocation());;
	
	act.dragAndDropBy(min_slider, 100, 250).perform(); // x=59+100 y=250+0 but 2 to 3 points variation will be there
	
	System.out.println("min location of slider i.e x & y points after moving "+min_slider.getLocation());
	
	
	}

}
