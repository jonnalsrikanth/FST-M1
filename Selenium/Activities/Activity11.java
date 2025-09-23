package activities;

import java.awt.Button;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
	    // Create a new Firefox browser instance
        WebDriver d = new FirefoxDriver();
        
        // Create a WebDriverWait object to wait up to 10 seconds for a specific condition to be met
	    // This helps handle dynamic elements that may take time to appear or become clickable
	    WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));


        d.get("https://training-support.net/webelements/dynamic-controls");
        
//        Find the checkbox on the page.
//        Click the "Toggle Checkbox" button to remove the checkbox.
//        Wait for the checkbox to disappear.
//        Toggle the checkbox again.
//        Wait for it appear and then select it.
        
        WebElement checkbox = d.findElement(By.id("checkbox"));
        
        // Locate the button with the exact text 'Toggle Checkbox' and click it
        // This action will likely show or hide the checkbox element on the page
        d.findElement(By.xpath("//button[text() = 'Toggle Checkbox']")).click();

	    // Wait until the checkbox element becomes invisible on the page
	    // This is useful when you want to ensure the element has disappeared before continuing
	    wait.until(ExpectedConditions.invisibilityOf(checkbox));

        
        System.out.println("visibility of checkbox : " + checkbox.isDisplayed());
           
        d.findElement(By.xpath("//button[text() = 'Toggle Checkbox']")).click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        
        System.out.println("visibility of checkbox : " + checkbox.isDisplayed());        
        
        // Close the browser window
        d.close();

	}

}
