package org.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Send values in user
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Stefi@gmail.com");
		
		//password
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Stefi2555");
		
		//click login
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

}
