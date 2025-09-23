package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/webelements/alerts");
//		Get the title of the page and print it to the console.
//		Find the button to open a SIMPLE alert and click it.
//		Switch the focus from the main window to the Alert box and get the text in it and print it.
//		Close the alert once with OK.
			
		System.out.println("Title is : " + d.getTitle());
		
		d.findElement(By.id("simple")).click();
		
		Alert simpleAlert = d.switchTo().alert();
		
		System.out.println("text on alert is : " + simpleAlert.getText());
		
		simpleAlert.accept();
		
		System.out.println("action performed is : " + d.findElement(By.id("result")).getText());		
		

		d.close();			


	}

}
