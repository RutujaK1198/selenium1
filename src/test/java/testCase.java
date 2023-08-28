import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager; //was giving error after doing // on line 12

public class testCase {

	
   public static void main (String []args) throws InterruptedException
   {
	   //System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome\\chromedriver.exe");   //if maven dependency of webDriver is not added
	   
	 //  WebDriverManager.chromedriver().setup();  //no need to add this from selenium 4.6.0 version
	  // ChromeDriver driver=new ChromeDriver();
	   
	   //1. Open chrome
	   WebDriver driver=new ChromeDriver();
	   
	   //2.Open URL
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   Thread.sleep(5000);
	   //3. Provide username
	   
	  //WebElement textUserName= driver.findElement(By.name("username"));
	  //textUserName.sendKeys("Admin");  //or these 2 lines in one line
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	   //4. Provide password
	  driver.findElement(By.name("password")).sendKeys("admin12");
	  
	  //5.click on submit button
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	   Thread.sleep(5000);
	   //6. validate title
	 /* String act_title=driver.getTitle();
	  String exp_title="OrangeHRM";
	  
	  if(act_title.equals(exp_title))
	  {
		  System.out.println("test passed");
	  }
	  else
	  {
		  System.out.println("test failed");
	  }*/
	  
	  //6.Test case 2. after login inside  change wrong password this will give error
	//  String actual_lable= null;  //null pointer excaption program won't execute or else declare in catch block	
	   String actual_lable= "";   //have to declare outside the try block to access it outside of block
	   try
	   {
		actual_lable=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
			  
	   }
	  catch (Exception e)
	   {
		 // actual_lable= "";
	   }
	   String exp_lable="Dashboard"; 
	   
	  if(actual_lable.equals(exp_lable))
	  {
		  System.out.println("test passed");
	  }
	  else
	  {
		  System.out.println("test failed");
	  }
	  //7.close browser
	 // driver.close(); //will show socketException which should ignore else
	 // driver.quit();
	  
	  }
}
