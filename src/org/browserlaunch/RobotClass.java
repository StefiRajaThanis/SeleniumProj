package org.browserlaunch;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.event.KeyEvent;

public class RobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement user = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		user.sendKeys("Stefi");
		
		Actions act = new Actions(driver);
		act.doubleClick(user).perform();
		
		act.contextClick(user).perform();
		
		Thread.sleep(3000);
		//Robot ->Predefined class
		Robot r = new Robot();
		
		for(int i = 0; i<5; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		
	}

}
