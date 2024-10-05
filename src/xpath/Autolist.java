package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autolist {
	WebDriver driver;
	WebDriverWait wait;

	public static void main(String[] args) throws InterruptedException {
		Autolist al=new Autolist();
		al.setUp();
		al.Autolist();
		
		

	}

	public void Autolist() throws InterruptedException {
//		driver.findElement(By.xpath("//span[text()='More']")).click();
//		driver.findElement(By.xpath("//span//a[text()='Settings']")).click();
//		driver.findElement(By.xpath("//a[text()='… or I already have an account']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Log in with Email']")).click();
//		driver.findElement(By.id("email")).sendKeys("dileepbandloju123@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Sandeep@123");
//		driver.findElement(By.xpath("//button[text()='Log in']")).click();
//		driver.findElement(By.xpath("//li[contains(@class,'jsx-2081075172 ')]/a[text()='Search']")).click();
//		driver.findElement(By.xpath("//input[@data-testid='text-search-input']")).sendKeys("audi 100");
//		driver.findElement(By.xpath("//div[text()='Audi 100']")).click();
//		
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='mobiles']")).click();
	
	
	
	}

	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		
		
	}

}
