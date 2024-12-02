package org.browserlaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Actions-->Predefined class
		Actions act = new Actions(driver);
		WebElement courses = driver.findElement(By.xpath("//div[@title='Courses']"));
		act.moveToElement(courses).perform();
		
		WebElement softtest = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		act.moveToElement(softtest).perform();
		
	}

}
