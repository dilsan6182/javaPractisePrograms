package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathW3schools {
	WebDriver driver;

	public static void main(String[] args) throws Exception {
		xpathW3schools x=new xpathW3schools();
		x.setUp();
		x.xpathW3schools();
	}
public void setUp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    } 
public void xpathW3schools() throws Exception{
	driver.findElement(By.linkText("Create new account")).click();
	//facebook account creation
    
/*	driver.findElement(By.name("firstname")).sendKeys("dileep");
	driver.findElement(By.name("lastname")).sendKeys("bandloju");
	driver.findElement(By.name("reg_email__")).sendKeys("9876543211");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Dileep@1234");
	new Select(driver.findElement(By.id("day"))).selectByVisibleText("20");
	new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jan");
	new Select(driver.findElement(By.id("year"))).selectByVisibleText("1993");*/
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("dileep");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bandloju");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543211");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Dileep@123");
	new Select(driver.findElement(By.xpath("//select[@id='day']"))).selectByValue("20");
	new Select(driver.findElement(By.xpath("//select[@id='month']"))).selectByVisibleText("Dec");
	new Select(driver.findElement(By.xpath("//select[@id='year']"))).selectByVisibleText("1992");
	driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input/..")).click();
	}

}
