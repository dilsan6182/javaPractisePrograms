package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver al=new driver();
		al.setUp();
		al.Autolist();
	}
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.autolist.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		}
	public void Autolist() {
		driver.findElement(By.xpath("//div[contains(@class,'jsx-117a8c59f9434783 jsx-596401589 arrow active-arrow')]")).click();
	
	}
}