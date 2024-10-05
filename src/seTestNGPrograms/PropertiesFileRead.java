package seTestNGPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileRead {
  @Test
  public void f() throws Exception{
	  String path= System.getProperty("user.dir");
	 System.out.println(path);
	 File file= new File(path+"\\src\\Configuration\\Config.properties");
	 FileInputStream fi=new FileInputStream(file);
	 Properties prop= new Properties();
	 prop.load(fi);
	 String browser=prop.getProperty("browser");	
	 System.out.println(browser);
	 fi.close();
	 
	  
	 
	  
  
  
  
  
  
  }
   
}
