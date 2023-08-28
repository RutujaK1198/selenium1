import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShots {

	public static void main(String[] args)   {

		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		
		driver.manage().window().maximize();
		
		//1.Full page screenshot
		TakesScreenshot ts= driver;
		File src=ts.getScreenshotAs(OutputType.FILE);   //getScreenshotAs will take input
		File target= new File("F:\\Selenium1\\ScreenShots\\fullPage.png");
		
	//FileUtils.copyFile(src,target);
		
		
		
	}

}
