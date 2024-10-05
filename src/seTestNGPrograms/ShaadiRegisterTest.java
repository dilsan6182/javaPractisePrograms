package seTestNGPrograms;

import org.testng.annotations.Test;

import Configuration.Base;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ShaadiRegisterTest extends Base{
  @Test
  public void registerTest() {
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  setUp();
  }

  @AfterTest
  public void afterTest() throws Exception {
	  quit();
  }

}
