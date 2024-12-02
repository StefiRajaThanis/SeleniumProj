package org.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//xPATH
		WebElement user = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		user.sendKeys("Stefi@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("Stefi@555");
//
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		login.click();
		
//		WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(), 'Facebook helps')]"));
		String t = text.getText();
		System.out.println(t);
		
		boolean displayed = text.isDisplayed();
		System.out.println(displayed);
		
		String attribute = text.getAttribute("class");
		System.out.println(attribute);
	}

}
