package org.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		firstname.sendKeys("Stefi");
		
		boolean enabled = firstname.isEnabled();
		System.out.println(enabled);
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastname.sendKeys("Stef");
		
		String attribute = lastname.getAttribute("id");
		System.out.println(attribute);
		
		boolean displayed = lastname.isDisplayed();
		System.out.println(displayed);

	}

}
