package org.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextPartial {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Link text
//WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));
//		forgot.click();

		//Partial Link Text
WebElement forgo = driver.findElement(By.partialLinkText("Forgotten "));
forgo.click();
		
	}

}
