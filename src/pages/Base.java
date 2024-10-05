package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;

	
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.autolist.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}
}