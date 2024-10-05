package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Selenium.Example_WebDriver;

public class Base {
	FileInputStream  fi;
	WebDriver driver;
	Properties prop;
	public void setUp() throws Exception {
		fi= new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\Configuration\\Config.properties"));
		prop= new Properties();
		prop.load(fi);
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
  public void quit() throws Exception {
	  fi.close();
	  driver.quit();
	  
  }
}
