package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Prioritization {
	@Test
	  public void A() {
		  System.out.println("in testCase A");
	  }
	  @Test
	  public void B() {
		  System.out.println("in testCase B");
	  }
	  @Test
	  public void C() {
		  System.out.println("in testCase C");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("in beforeClass");
	  }
	  @AfterClass
	  public void afterClass() {
		  System.out.println("in afterClass");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("in beforeMethod");
	  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("in afterMethod");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("in beforeTest");
	  }
	  @AfterTest
	  public void afterTest() {
		  System.out.println("in afterTest");
	  }
	}
