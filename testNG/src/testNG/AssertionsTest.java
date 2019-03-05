package testNG;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionsTest {
  @Test(priority=1)
  public void browsersActions() {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("www.gmail.com");
	  String title = driver.getTitle();
	  System.out.println(title);
	  org.testng.Assert.assertEquals(title, "Gmail");
  }
}