package seTestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class HandlingWindows {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
  @Test
  public void VerifyWindowHandles() throws Exception {
	  String mWindId= driver.getWindowHandle();
	  System.out.println("Main WindId: "+mWindId);
	  driver.findElement(By.xpath("//a/strong[text()='Login']")).click();
	  Set<String> windIDs = driver.getWindowHandles();
	  System.out.println("Wind ID's: "+windIDs);
	  String childWind1=null;
	  for(String windID:windIDs) {
		  if( !windID.equals(mWindId) ){
			  childWind1 = windID;  
		  }
	  }
	  driver.switchTo().window(childWind1);
	  driver.findElement(By.id("inputEmail")).sendKeys("suresh@gmail.com");
	  driver.switchTo().window(mWindId);
	  driver.findElement(By.xpath("//li/a[text()='Demo']")).click();
	 
	  driver.findElement(By.name("first_name")).sendKeys("suresh");
	  driver.findElement(By.name("last_name")).sendKeys("potti");
	  driver.findElement(By.xpath("//a/strong[text()='Signup']")).click();
	  windIDs = driver.getWindowHandles();
	  String childWind2= null;
	  for(String windID : windIDs) {
		  if(!windID.equals(mWindId) || !windID.equals(childWind1)) {
			  childWind2 = windID;
		  }
	  }
	  driver.switchTo().window(childWind2);
	  driver.findElement(By.id("inputFirstName")).sendKeys("Ramesh");
	  driver.findElement(By.id("inputLastName")).sendKeys("podugu");
	  driver.findElement(By.id("inputFirstName")).click();
	  driver.findElement(By.id("inputFirstName")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
	  driver.findElement(By.id("inputFirstName")).sendKeys(Keys.chord(Keys.CONTROL, "c"));
	  driver.findElement(By.id("inputEmail")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	  Thread.sleep(20000);
	  driver.close();
	  System.out.println("Driver After Close Method: "+driver);
	  driver.switchTo().window(mWindId);
	  driver.findElement(By.name("business_name")).sendKeys("Quality Thought");
	  Thread.sleep(2000);
	  driver.quit();
	  System.out.println("Driver after Quit Method: "+driver);	
	  
			  
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.get("https://phptravels.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  action = new Actions(driver);
  }
  

  @AfterTest
  public void afterTest() {
  }

}
