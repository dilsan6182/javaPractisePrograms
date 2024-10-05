package seTestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseOperators {
	WebDriver driver;
	Actions action;
  /*@Test(priority=1)
  public void verifyDraggable() {
	  driver.findElement(By.linkText("Draggable")).click();
	  driver.switchTo().frame(0);
	  String text=driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
	  System.out.println("text: "+text);
	  action.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
	  action.moveByOffset(20, 80).build().perform();
	  action.release().build().perform();
	  driver.switchTo().parentFrame();
  }
  @Test(priority=2)
  public void verifyDroppable(){
	  driver.findElement(By.linkText("Droppable")).click();
	  driver.switchTo().frame(0);
	  action.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
	  action.moveToElement(driver.findElement(By.id("droppable"))).build().perform();
	  action.release().build().perform();
	  driver.switchTo().defaultContent(); 
	  
	  
  }*/
 @Test(priority=3)
  public void verifySortable() {
	  driver.findElement(By.linkText("Sortable")).click();
	  driver.switchTo().frame(0);
	  action.clickAndHold(driver.findElement(By.xpath("//li[contains(@class,'ui-state-default ui-sortable-handle')and text()='Item 1']"))).build().perform();
	  action.moveByOffset(0, 160).build().perform();
	  action.release().build().perform();
	  driver.switchTo().defaultContent();
	  }
  @Test(priority=4)
  public void verifyResizable() throws InterruptedException {
	  driver.findElement(By.linkText("Resizable")).click();
	  Thread.sleep(10000);
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("resizable"));
	  action.clickAndHold(driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"))).build().perform();
      action.moveByOffset(80,80).build().perform();
      action.release().build().perform();
	  driver.switchTo().defaultContent();
      
  }
  @Test(priority=5)
  public void verifySelectable() throws InterruptedException {
	  driver.findElement(By.linkText("Selectable")).click();
	  Thread.sleep(1000);
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//li[text()='Item 3']")).click();
      action.release().build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test(priority=6)
  public void verifyDatePicker() throws InterruptedException {
	  action.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("Datepicker")).click();
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("datepicker")).click();
  }
	  
	  
	  
	  
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.get("https://jqueryui.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  action = new Actions(driver);
  }

  @AfterTest
  public void afterTest() {
  }

}
