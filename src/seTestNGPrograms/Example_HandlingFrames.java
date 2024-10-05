package seTestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_HandlingFrames {
   WebDriver driver;
   
   @Test
   public void verifyFrames() {
	   driver.switchTo().frame("frame1");
	   String text=driver.findElement(By.xpath("//html/body/h1[@id='sampleHeading']")).getText();
	   System.out.println(text);
	   driver.switchTo().defaultContent();
	   driver.findElement(By.xpath("//span[text()='Alerts']")).click();	   
	   }
   @BeforeTest
   public void beforeTest() {
	   driver = new ChromeDriver();
	   driver.get("https://demoqa.com/frames");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   @AfterTest
   public void afterTest() {
	   
   }
   
}
