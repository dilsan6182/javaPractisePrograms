package seTestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ExampleDataProvider {
	WebDriver driver;
  @Test(dataProvider="getData")
  public void verifyData(String uname,String pwd) {
	 // System.out.println(uname);
	  //System.out.println(pwd);
	  driver.get("https://facebook.com");
	 driver.findElement(By.id("email")).sendKeys(uname);
	 driver.findElement(By.id("pass")).sendKeys(pwd);
	 driver.findElement(By.name("login")).click();
	 boolean result=driver.findElement(By.xpath("//div[contains(text(),'incorrect')]")).isDisplayed();
	 if(result) {
		 System.out.println("test passed");
	 }else {
		 System.out.println("test failed");
	 }
	 driver.navigate().refresh();
	  
  }
  @DataProvider
  public Object[][] getData(){
	  Object[][] data = new Object[3][2];
	  data[0][0]="suresh";
	  data[0][1]="suresh@1234";
	  data[1][0]="ganesh";
	  data[1][1]="ganesh@1234";
	  data[2][0]="naresh";
	  data[2][1]="naresh@1234";
	  return data;
	  
  }
	  @BeforeTest
	  public void setup() {
		  driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  }
  }
