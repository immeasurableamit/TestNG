package testNG;

import org.testng.annotations.Test;

public class DisableTestDemo {
  @Test(enabled=true)
  public void firstTest() {
	  System.out.println("first test case");
  }
  @Test(enabled=false)
  public void secondTest() {
	  System.out.println("second test case");
  }
  @Test
  public void thirdTest() {
	  System.out.println("third test case");
  }
}