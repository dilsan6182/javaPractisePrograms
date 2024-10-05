package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip { 
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		MakeMyTrip MMT=new MakeMyTrip();
		MMT.setUp();
		MMT.MakeTrip();
	}
		
		
		public void MakeTrip() throws InterruptedException {
     List<WebElement> HeaderIcons = driver.findElements(By.xpath("//span[contains(@class,'headerIconTextAlignment')]"));
		
		 for (WebElement HI : HeaderIcons) {
			 System.out.println(HI.getText());

			if (HI.getText().equals("Hotels")) {
					HI.click();
				}
			if (HI.getText().equals("Homestays & Villas")) {
				HI.click();
			}
			if (HI.getText().equals("Holiday Packages")) {
				HI.click();
			}
			if (HI.getText().equals("Trains")) {
				HI.click();
			}
			if (HI.getText().equals("Buses")) {
				HI.click();
			}
			if (HI.getText().equals("Cabs")) {
				HI.click();
			}
			if (HI.getText().equals("Forex Card & Currency")) {
				HI.click();
			}
			if (HI.getText().equals("Travel Insurance")) {
				HI.click();
			}
			
			
				
//			 String str=HI.getText();
//			 System.out.println(str);
//			 if(str.contains("Hotels")) {
//				 HI.click();
//			 }else {
//				 System.out.println("Element not clickable ");
//			 }
		 
		
        
		
			}
		}
		
//			String str= driver.findElement(By.xpath("//span[contains(@class,'headerIconTextAlignment')]")).getText();
//			System.out.println(str);
//		if(str.contains("Flights")) {
//			
//		}
		
		
		public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

}
}