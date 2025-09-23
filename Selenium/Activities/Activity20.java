package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/webelements/alerts");
//		Find the button to open a PROMPT alert and click it.
//		Switch the focus from the main window to the Alert box and get the text in it and print it.
//		Type "Awesome!" into the prompt.
//		Close the alert by clicking Ok.
			
		System.out.println("Title is : " + d.getTitle());
		
		d.findElement(By.id("prompt")).click();
		
		Alert simpleAlert = d.switchTo().alert();
		
		System.out.println("text on alert is : " + simpleAlert.getText());
		
		simpleAlert.sendKeys("Awesome!");
		
		simpleAlert.accept();
		
		System.out.println("action performed is : " + d.findElement(By.id("result")).getText());	
		
		d.close();			


	}

}
