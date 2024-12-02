package org.browserlaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Drag and Drop actions
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		
		WebElement place1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		//Actions
		Actions act = new Actions(driver);
		act.dragAndDrop(bank, place1).perform();
		
		WebElement sales = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
		
		WebElement place2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		act.dragAndDrop(sales, place2).perform();
		

	}

}
