package org.browserlaunch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTask {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int size = frames.size();
		System.out.println(size);
		
		//Switching to the frames by name or id
		driver.switchTo().frame("firstFr");
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Stefi");
		
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Arul");
		
		//Switching to the frames by WebElement refname
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Stefi@gmail.com");

		
	}

}
