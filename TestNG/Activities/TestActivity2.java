package Activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class TestActivity2 {
	
	// Declare class objects
	WebDriver d;
  
  @BeforeClass
  public void setUp() {
	//Driver initialization
	d = new FirefoxDriver();
	//open the page
	d.get("https://training-support.net/webelements/target-practice/");
		
	}
  
  @Test
  public void testcase1() {
	  String title = d.getTitle();
	  System.out.println("Title is : " + title);
	  assertEquals(title, "Selenium: Target Practice");
  }
  
  @Test
  public void testcase2() {
	// This test case will Fail
	  WebElement blackbutton = d.findElement(By.cssSelector("button.black"));
	  Assert.assertTrue(blackbutton.isDisplayed());
	  Assert.assertEquals(blackbutton.getText(), "black");
  }
  
  @Test(enabled = false)
  public void testcase3() {
	  //This test will be skipped and not counted
	  String subHeading = d.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
  }
  
  @Test
  public void testcase4() {
	// This test will be skipped and will be be shown as skipped
	  throw new SkipException("Skipping the test case");
  }

  @AfterClass
  private void teardown() {
	// close the browser
	d.quit();

}
}
