package seTestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class FindElementsLinks {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;

	@Test(priority = 1)
	public void VerifyTotalLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int LinksCount = links.size();
		System.out.println("toatl links count is: " + LinksCount);
	}

	@Test(priority = 2)
	public void verifyFooterLinks() {
		WebElement FooterSection = driver.findElement(By.id("glbfooter"));
		int FooterLinksCount = FooterSection.findElements(By.tagName("a")).size();
		System.out.println("total footer links count: " + FooterLinksCount);
	}

	@Test(priority = 3)
	public void VerifyFooterSectionLinks() {
		WebElement ColSection = driver.findElement(By.xpath("//div[@id='gf-BIG']//td[2]"));
		List<WebElement> ColSectionList = ColSection.findElements(By.tagName("a"));
		int ColSectionListCount = ColSectionList.size();

		for (int i = 0; i < ColSectionListCount; i++) {
			String text = ColSectionList.get(i).getText();
			System.out.println(text);
		}
		System.out.println("****************************");
		for (WebElement el : ColSectionList) {
			System.out.println(el.getText());

			if (el.getText().equals("Developers")) {
				el.click();
			}
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='logo']")));
		boolean result = driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
		String url = driver.getCurrentUrl();
		System.out.println("URL: " + url);
		String title = driver.getTitle();
		System.out.println("TITLE: " + title);

		
		/*
		 * if (result && url.contains("developer") && title.contains("Developers")) {
		 * System.out.println("developers page displayed successfully"); } else {
		 * System.out.println("developers page not displayed");
		 * 
		 * }
		 */
	//}
	   
	
	  
	  assertEquals(result, false, "failed to validate developers logo");
	  System.out.println("developers logo validated successfully");
	  
	  assertTrue(url.contains("developer"), "failed to validate current url developers");
	  System.out.println("successfully validated current url");
	  
	  assertNotEquals(!title.contains("Developers"),true,"failed to validate");
	  System.out.println("successfully validated");
		
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https:www.ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		action = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
