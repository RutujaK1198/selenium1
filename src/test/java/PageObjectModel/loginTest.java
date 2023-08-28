package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest 
{
	
	WebDriver driver;
	//loginPage lp;
	loginPage2 lp;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
  @Test(priority=1)
  public void testlogo() 
  {
	  lp=new loginPage2(driver);
	//  lp.checkLogoPresense();
	  Assert.assertEquals(lp.checkLogoPresense(),true);
  }
  
  @Test(priority=2)
  public void testLogin()
  {
	  lp.setUsername("Admin");
	  lp.setPassword("admin123");
	  lp.Click();
	  
	  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
  }
  
  @AfterClass
  void tearDown()
  {
	  driver.quit();
  }
}
