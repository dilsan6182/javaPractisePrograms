package xpath;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicPaginationTable {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");

		WebElement pwd = driver.findElement(By.id("input-password"));
		pwd.clear();
		pwd.sendKeys("demo");

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		// showing 1 to 10 of 20351 pages
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		int totalPages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
		for (int p = 1; p <= 10; p++) {
			if (p > 1) {
				Thread.sleep(3000);
				WebElement ActivePage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=" + p + "]"));
				ActivePage.click();

			}

			int noOfRows = driver
					.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			for (int r = 1; r <= noOfRows; r++) {
				Thread.sleep(3000);
				String customerName = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[2]"))
						.getText();
				String emailName = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]//td[3]"))
						.getText();
				System.out.println(customerName + "\t" + emailName);
			}
		}

	}
}