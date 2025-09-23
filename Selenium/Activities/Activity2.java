package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
			
		d.get("https://training-support.net/webelements/login-form");
		
		System.out.println("Title is : " + d.getTitle());
		
		//<input type="text" class="focus:ring-0 svelte-1pdjkmx" placeholder="Username" name="username" id="username" required data-gtm-form-interact-field-id="1"> = $0
		d.findElement(By.id("username")).sendKeys("admin");

		//<input type="password" class="focus:ring-0 svelte-1pdjkmx" placeholder="Password" name="password" id="password" required data-gtm-form-interact-field-id="0">
		d.findElement(By.name("password")).sendKeys("password");
		
		//<button class="svelte-1pdjkmx" data-svelte-h="svelte-gtkoxm">Submit</button> == $0
		d.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		
		System.out.println("New title : "+ d.getTitle());
		
		d.close();	

	}

}
