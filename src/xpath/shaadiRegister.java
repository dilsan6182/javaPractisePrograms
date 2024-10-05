package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class shaadiRegister {
WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		shaadiRegister y=new shaadiRegister();
		y.setUp();
		y.shaadiRegister();
		
		}
public void setUp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shaadi.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
}
public void shaadiRegister() throws InterruptedException{
	driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div//div[contains(@class,'is-selected')]")).click();
	driver.findElement(By.xpath("//div[text()='Woman']")).click();
	driver.findElement(By.xpath("//div[contains(@class,'ageFrom')]//div[contains(@class,'is-selected')]")).click();
	Actions action=new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	driver.findElement(By.xpath("//div[text()='25']")).click();
	action.sendKeys(Keys.PAGE_UP).build().perform();
	driver.findElement(By.xpath("//div[contains(@class,'ageUpto')]//div[contains(@class,'is-selected')]")).click();
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	driver.findElement(By.xpath("//div[text()='30']")).click();
	
	driver.findElement(By.xpath("//label[text()='of religion']/following-sibling::div/div/div[contains(@class,'is-selected')]")).click();
	driver.findElement(By.xpath("//div[text()='Hindu']")).click();
	action.sendKeys(Keys.PAGE_UP).build().perform();
	driver.findElement(By.xpath("//label[text()='and mother tongue']/following-sibling::div//div[contains(@class,'is-selected')]")).click();
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	driver.findElement(By.xpath("//div[text()='Frequently Used']/following-sibling::div[7]")).click();
	action.sendKeys(Keys.PAGE_UP).build().perform();
	driver.findElement(By.xpath("//button[text()=\"Let's Begin\"]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[text()='This Profile is for']/following::span[text()='Myself']")).click();
	driver.findElement(By.xpath("//div[text()='Gender']/following::span[text()='Male']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//label[text()='First name']/following-sibling::div/input[@maxlength='20']")).sendKeys("dileep");	
    driver.findElement(By.xpath("//div/div/label[text()='Last name']/following-sibling::div/input[@maxlength='20']")).sendKeys("bandloju");
    driver.findElement(By.xpath("//input[@placeholder='DD']")).sendKeys("20");
    driver.findElement(By.xpath("//input[@name='month']")).sendKeys("12");
    driver.findElement(By.xpath("//input[@name='year']")).sendKeys("1992");
    
}

}
