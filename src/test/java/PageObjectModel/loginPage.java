package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
	
	//constructor -
	loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//locators
	By img_logo=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img");
	By txt_userName=By.name("username");
	By txt_pwd=By.name("password");
	By login=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	//action methods
	
	public void setUsername(String username)
	{
		driver.findElement(txt_userName).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(txt_pwd).sendKeys(password);
	}
	
	public void Click()
	{
		driver.findElement(login).click();
	}
	
	public boolean checkLogoPresense()
	{
		boolean status=driver.findElement(img_logo).isDisplayed();
		return status;
	}
}
