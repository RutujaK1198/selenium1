package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage2 {

	WebDriver driver;
	
	//constructor -
	loginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//WebElement locators +identification
	@FindBy(xpath="\"//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[1]/img\"") WebElement img_logo;
	@FindBy(name="usesrname") WebElement txt_userName;
	@FindBy(name="password") WebElement txt_pwd;
    @FindBy(xpath="\"//*[@id=\\\"app\\\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button\"") 
    WebElement login;
	
	//action methods
	
	public void setUsername(String username)
	{
		txt_userName.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txt_pwd.sendKeys(password);
	}
	
	public void Click()
	{
		login.click();
	}
	
	public boolean checkLogoPresense()
	{
		boolean status=img_logo.isDisplayed();
		return status;
	}
}
