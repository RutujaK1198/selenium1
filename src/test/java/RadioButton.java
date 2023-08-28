import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		driver.findElement(By.className("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();   //clicked on create new account 
		
		WebElement male_rd=driver.findElement(By.xpath("//*[@id=\"u_h_o_uk\"]/span[1]/label"));
		WebElement female_rd=driver.findElement(By.xpath("//*[@id=\"u_h_o_uk\"]/span[2]/label"));
		
		//before selecting
		System.out.println(male_rd.isSelected());  
		System.out.println(female_rd.isSelected());
		
		//after selecting male, female should be false and vice versa
		
		
	}

}
