package testNG;

import org.testng.annotations.Test;

public class GroupingTestDemo {
  @Test(groups="Car")
  public void drive() 
  {
	  System.out.println("Driving the vehicle");
  }
  @Test(groups="Car")
  public void changeGear()
  {
	  System.out.println("Changing gears");
  }
  @Test
  public void accelerate()
  {
	  System.out.println("Accelerating");
  }
}