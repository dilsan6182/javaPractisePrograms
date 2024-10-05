package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("http://192.168.1.76:9097/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Thread.sleep(3000);

//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//
//        
//		List<WebElement> models = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
//		WebElement pages=driver.findElement(By.xpath("//span[@class='s-pagination-item s-pagination-disabled']"));
//		String pagetext=pages.getText();
//		int finalpage=Integer.parseInt(pagetext);
//		for(int i=1;i<=finalpage;i++) {
//			if(i==1) {
//				for (int j = 0; j < models.size(); j++) {
//				try {
//					Thread.sleep(2000);					
//					String priceText = prices.get(j).getText().replaceAll("[^0-9]", "");
//					int price = Integer.parseInt(priceText);
//					if (price > 50000) {
//						String modelName = models.get(j).getText();
//						Thread.sleep(5000);
//						System.out.println("Model: " + modelName + ", Price: " + price);
//					
//			}} catch (Exception e) {
//				System.out.println("Error converting text to integer: " + e.getMessage());
//			}
//				//Thread.sleep(5000);
//				
//			
//		}
//				
//			}
//		
//			if(i>=1) {
//				WebElement finalpagenumber=driver.findElement(By.xpath("//span//a[contains(@class,'s-pagination-item s-pagination')][text()="+i+"]"));
//				
//				try {
//				finalpagenumber.click();
//				}
//				catch(StaleElementReferenceException e){
//					Thread.sleep(3000);
//					finalpagenumber=driver.findElement(By.xpath("//span//a[contains(@class,'s-pagination-item s-pagination')][text()="+i+"]"));
//  				finalpagenumber.click();
//				driver.navigate().refresh();
//				
//				
//				}
//			}
				////span//a[contains(@class,'s-pagination-item s-pagination')][text()='1']
//		for (int j = 0; j < models.size(); j++) {
//			try {
//				Thread.sleep(2000);
//				String priceText = prices.get(j).getText().replaceAll("[^0-9]", "");
//				int price = Integer.parseInt(priceText);
//				if (price > 50000) {
//					String modelName = models.get(j).getText();
//					Thread.sleep(5000);
//					System.out.println("Model: " + modelName + ", Price: " + price);
//				}
//		} catch (Exception e) {
//			System.out.println("Error converting text to integer: " + e.getMessage());
//		}
//			//Thread.sleep(5000);
//		}
//		
		
		driver.findElement(By.xpath("//a[@href='/Bikeentry']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@class='ulogin-input']")).sendKeys("9346166681");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
//		List<WebElement> otpboxes=driver.findElements(By.xpath("//input[@class='ulogin-otp-input']"));
		WebElement otp=driver.findElement(By.xpath("//h4[@class='text-danger']"));
//		String otptext=otp.getText();
//		for(int i=0;i<otptext.length();i++) {
//			char ch=otptext.charAt(i);
//			for(WebElement eachotp:otpboxes) {
//				eachotp.sendKeys(String.valueOf(ch));
//				
//			}break;
//		}
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@maxlength='1'][1]")).sendKeys(otp.getText());
		 
		  
		 String myOpt=otp.getText();
		 for(int i=1;i<5;i++)
		
		 {  
			CharSequence[] ch=   myOpt.charAt(i-1);
			//char to stirng 
	
		 }
	}
}