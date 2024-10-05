package seTestNGPrograms;

import org.testng.annotations.Test;

public class FirstTest {
  @Test(priority=2)
  public void test1() {
	  System.out.println("Test1 method");
  }
  @Test(priority=1)
  public void test2() {
	  System.out.println("Test2 method");
  }
  @Test(priority=0)
  public void test3() {
	  System.out.println("Test3 method");
  }
}
