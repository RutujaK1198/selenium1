import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links present "+links.size());
		
		int brokenLinks=0;
		for(WebElement allLinks: links)
		{
		String hrefAttribute=allLinks.getAttribute("href");
		//System.out.println(hrefAttribute);  //printed links successfully
		
		if(hrefAttribute==null || hrefAttribute.isEmpty())
		{
			System.out.println("href value is empty.");
			continue;
		}
		
		URL linkurl=new URL(hrefAttribute);  //convert string to URL so that we can click
		
		//Send request to server
		//1.open the connection through url 2.Connect to server
		
		linkurl.openConnection();   //opens connection, cannot connect directly to server 
		
	//	URLConnection conn= (HttpURLConnection)linkurl.openConnection(); //need to typecast
		HttpURLConnection conn= (HttpURLConnection)linkurl.openConnection();
		conn.connect();
		if(conn.getResponseCode()>=400)
		{
			System.out.println(hrefAttribute+"    "+"=======> Broken link");
			brokenLinks++;
		}
		else
		{
			System.out.println(hrefAttribute+"       "+"Not a broken link");
		}
		
	
		}
		System.out.println("Total number of broken links "+brokenLinks);
		//Will get unknown host exception at last can ignore them
	}

}
