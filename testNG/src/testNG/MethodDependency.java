package testNG;

import org.testng.annotations.Test;

public class MethodDependency {
  @Test
  public void firstTest() {
  System.out.println("first test case");
  }
  @Test(dependsOnMethods= {"finalTest"})
  public void secondTest() {
  System.out.println("second test case");
  }
  @Test
  public void finalTest() {
  System.out.println("final test case");
  }
}