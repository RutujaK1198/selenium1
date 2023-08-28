import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this command is avaialble with selenium 4 and onwords
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.switchTo().newWindow(WindowType.TAB);  //new tab will open
		//driver.switchTo().newWindow(WindowType.WINDOW); //new window will open
		
		driver.get("https://demo.opencart.com/");
		
	}

}
