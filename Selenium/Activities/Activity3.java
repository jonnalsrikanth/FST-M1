package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(10));
		
		d.get("https://training-support.net/webelements/login-form");
		
		System.out.println("Title is : " + d.getTitle());

		//<input type="text" class="focus:ring-0 svelte-1pdjkmx" placeholder="Username" name="username" id="username" required data-gtm-form-interact-field-id="1"> = $0
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		//<input type="password" class="focus:ring-0 svelte-1pdjkmx" placeholder="Password" name="password" id="password" required data-gtm-form-interact-field-id="0">
		d.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("password");
		
		//<button class="svelte-1pdjkmx" data-svelte-h="svelte-gtkoxm">Submit</button> == $0
		d.findElement(By.xpath("//button[@data-svelte-h='svelte-gtkoxm']")).click();
		
		//WebDriverWait is applied on certain element with defined expected condition and time. This wait is only applied to the specified element.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(@class,'text-gray-800')]")));
		//<h2 class="mt-5 text-center text-4x1 font-semibold text-gray-800">Welcome Back, Admin !< /h2>
		String str = d.findElement(By.xpath("//h2[contains(@class,'text-gray-800')]")).getText();
		
		System.out.println(str);
		
		System.out.println("New title : "+ d.getTitle());
		
		d.close();	
	}

}
