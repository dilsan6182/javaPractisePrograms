package Selenium;

import java.net.HttpURLConnection;
import java.net.*;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);
		
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links) {
			String linkurl =link.getAttribute("href");
		try {	
		URL url=new URI(linkurl).toURL();
		//	URL linkURL=new URL(linkurl);
			HttpURLConnection URlConn=(HttpURLConnection) url.openConnection();
			URlConn.setConnectTimeout(5000);
			URlConn.connect();
			int rescode=URlConn.getResponseCode();
			if(rescode<400) {
				System.out.println(linkurl+" - "+" is a valid link");
			}
			
			else			{
				System.err.println(linkurl+" - "+URlConn.getResponseMessage()+" is a broken link");
			}
			URlConn.disconnect();
		}catch(Exception e) {
			System.err.println(linkurl);
			driver.navigate().refresh();
		}
		}
			
	driver.quit();
		}
}