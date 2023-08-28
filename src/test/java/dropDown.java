import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[8]/a")).click();
		Thread.sleep(2000);		
		// Dropdown is one webElement inside it there are various webElements
	     WebElement drpElement=driver.findElement(By.xpath("//select[@name='country_id']"));  //just capture dropdown not the option
	     Select country_drp= new Select(drpElement);
	     //1. Selecting option from dropdown
	     country_drp.selectByVisibleText("Argentina");
	     country_drp.selectByValue("2");  //if only value is available
	     country_drp.deselectByIndex(3);  //based on assumption, index won't ba avialblae on DOM
	     
	     //2.Find total no of options from dropdown
	     List <WebElement>options =country_drp.getOptions();
	     System.out.println(options.size());
	     
	     //3.Print options in console
	     for (int i=0; i<options.size(); i++)
	     {
	    	System.out.println(options.get(i).getText()); ;
	     }
	     
		

	}

}
