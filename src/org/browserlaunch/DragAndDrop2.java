package org.browserlaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Actions-->Predefined class
		Actions act = new Actions(driver);
		
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		WebElement accountplace1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
//		act.dragAndDrop(bank, accountplace1).perform();
		
		act.clickAndHold(bank).moveToElement(accountplace1).release(accountplace1).perform();

	}

}
