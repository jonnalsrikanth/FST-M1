package activities;

import java.awt.font.ImageGraphicAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
	       // Create a new Firefox browser instance
        WebDriver d = new FirefoxDriver();
        
        // Create an Actions object to perform keyboard and mouse actions like typing, clicking, etc.
        Actions builder = new Actions(d);

        // Open the webpage that demonstrates keyboard events
        d.get("https://training-support.net/webelements/drag-drop");
        
//        Find the ball and simulate a click and drag to move it into "Dropzone 1".
//        Verify that the ball has entered Dropzone 1.
//        Once verified, move the ball into "Dropzone 2".
//        Verify that the ball has entered Dropzone 2.

        // Print the title of the page to verify it's loaded correctly
        System.out.println("Title is : " + d.getTitle());

        // Locate the football image element using its CSS class 'absolute'
        WebElement football = d.findElement(By.cssSelector("img.absolute"));

        // Locate the first drop zone by its ID
        WebElement dropzone1 = d.findElement(By.id("dropzone1"));

        // Locate the second drop zone by its ID
        WebElement dropzone2 = d.findElement(By.id("dropzone2"));

        // Simulate dragging the football and dropping it into dropzone1
        builder.clickAndHold(football)           // Click and hold the football
               .moveToElement(dropzone1)         // Move it to dropzone1
               .release()                        // Release the mouse to drop
               .build().perform();               // Execute the action

        // Get the text from the dropzone to verify if the ball was successfully dropped
        String string = d.findElement(By.className("dropzone-text")).getText();

        // Check if the dropzone text confirms the drop and print a message
        if(string.equals("Dropped!"))
            System.out.println("Ball is dropped into dropzone1");

        // Repeat the drag-and-drop action to drop the ball into dropzone2
        builder.clickAndHold(football)
               .moveToElement(dropzone2)
               .release()
               .build().perform();

        // Verify if dropzone2 shows the "Dropped!" message and print confirmation
        if(d.findElement(By.xpath("//*[@id='dropzone2']/span")).getText().equals("Dropped!"))
            System.out.println("Ball is dropped into dropzone2");

        	
        
        // Close the browser window
        d.close();

	}

}
