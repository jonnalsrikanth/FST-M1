package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		
		d.get("https://training-support.net/");
		
		System.out.println("Title is : " + d.getTitle());
		//className is having "card mx-auto my-8 w-52 text-center svelte-4bhb3l"; 
		//we can use any value delimited by space to click as long as the value is unique (only when used with CSSselector)
		d.findElement(By.className("card")).click();
		//Below is used to find the element using the linkText option
	//	d.findElement(By.linkText("About Us")).click();
		
		System.out.println("New title : "+ d.getTitle());
		
		d.close();		
		

	}

}
