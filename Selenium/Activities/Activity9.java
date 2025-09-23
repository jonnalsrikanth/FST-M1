package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {

	public static void main(String[] args) {
       // Create a new Firefox browser instance
        WebDriver d = new FirefoxDriver();
        
        // Create an Actions object to perform keyboard and mouse actions like typing, clicking, etc.
        Actions builder = new Actions(d);

        // Open the webpage that demonstrates keyboard events
        d.get("https://training-support.net/webelements/keyboard-events");

        // Print the title of the page to verify it's loaded correctly
        System.out.println("Title is : " + d.getTitle());

        // Use the Actions object to type "Hello!" and press the Enter key
        // Note: We use Actions here because the target element is not a typical <input> field
        builder.sendKeys("Hello!").sendKeys(Keys.RETURN).build().perform();

        // After typing, get the message displayed on the page and print it to the console
        System.out.println("message in console is : " + d.findElement(By.cssSelector("h1.mt-3")).getText());

        // Close the browser window
        d.close();
 
    }	

	}

