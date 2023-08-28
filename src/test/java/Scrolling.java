import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= driver;
		
		//scroll down page to pixel
		js.executeScript("window.scrollBy(0,5000)", "");
        System.out.println(	js.executeScript("return window.pageYOffset;"));
        
        //scroll down upto India flag
        WebElement IndFlag=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div/div[79]/div/div"));
        js.executeScript("arguments[0].scrollIntoView();", IndFlag);
        System.out.println(	js.executeScript("return window.pageYOffset;"));
        Thread.sleep(3000);
        //scrolldown to end of a page
      //  js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
        //System.out.println(	js.executeScript("return window.pageYOffset;"));
        
       // Thread.sleep(3000);
        //scrolldown to start of a page
        js.executeAsyncScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(	js.executeScript("return window.pageYOffset;"));
	}

}
