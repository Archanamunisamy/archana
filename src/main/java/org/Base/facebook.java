package org.Base;

import org.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class facebook extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		windowMaximize();
		
		WebElement email = driver.findElement(By.id("email"));
		passText("archana09", email);
		
		WebElement password = driver.findElement(By.name("pass"));
		passText("12345678", password);
		
		driver.navigate().refresh();
		passText("archu09012", email);
		passText("ar1234", password);
		
	
}
}