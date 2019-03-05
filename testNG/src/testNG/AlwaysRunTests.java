package testNG;

import org.testng.annotations.Test;

public class AlwaysRunTests {
  @Test
  public void firstTest() {
	  System.out.println("first test case");
  }
  @Test(dependsOnMethods= {"finalTest"},alwaysRun=true)
  public void secondTest() {
	  System.out.println("second test case");
  }
  @Test
  public void finalTest() {
	  System.out.println("final tset case");
  }
}