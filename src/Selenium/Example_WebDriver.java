package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_WebDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		/*
		 * driver.get("https://facebook.com");
		 * driver.findElement(By.id("email")).sendKeys("dileepbandloju123@gmail.com");
		 * driver.findElement(By.linkText("Create new account")).click();
		 * Thread.sleep(10000);
		 * driver.findElement(By.name("firstname")).sendKeys("dileep");
		 * driver.findElement(By.name("lastname")).sendKeys("bandloju");
		 * driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
		 * driver.findElement(By.name("reg_passwd__")).sendKeys("Sandeep@123"); ;
		 */
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='YGcVZO']  [text()='mobiles']")).click();
		
	}

}
