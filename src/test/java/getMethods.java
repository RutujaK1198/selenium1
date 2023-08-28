import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		// System.out.println(driver.getPageSource());  //this will give html source of a page
		//we can store getPageSource in a variable and can apply contains, text methods for validations
		
		String ps= driver.getPageSource();
		System.out.println(ps.contains("html"));
		
		System.out.println(driver.getWindowHandle()); //will return browser id, not constant will keep changing
		
		Thread.sleep(5000);
		//driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.findElement(By.linkText("Mobiles")).click(); //will open another link present on same page
		Set <String>windowsID=driver.getWindowHandles();
		
		for(String winid:windowsID)
		{
			System.out.println(winid);  // 2 diff ids should be printed,also not constants
		}
	}

}
