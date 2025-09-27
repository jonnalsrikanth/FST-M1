package Activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class TestActivity3 {
	WebDriver d;
	WebDriverWait wait; 
	
	@BeforeClass
	  public void setUp() {
		//Driver initialization
		d = new FirefoxDriver();
		wait = new WebDriverWait(d, Duration.ofSeconds(10));
		//open the page
		d.get("https://training-support.net/webelements/login-form/");
			
		}
		
	  @Test (priority = 1)
	  public void testcase1() {
		  //this will fail
		  String title = d.getTitle();
		  System.out.println("Title is : " + title);
		  assertEquals(title, "Selenium: Target Practice");
	  }
	  
	  @Test (priority = 2)
	  public void loginTest() {
		  d.findElement(By.id("username")).sendKeys("admin");
		  d.findElement(By.id("password")).sendKeys("password");
		  d.findElement(By.xpath("//button[text()='Submit']")).click();
		  
		  // Read login message
		  String loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.text-center"))).getText();
		  
		  assertEquals("Welcome Back, Admin!", loginMessage);
	  }
  

	  @AfterClass
	  private void teardown() {
		// close the browser
		d.quit();

	}

}
