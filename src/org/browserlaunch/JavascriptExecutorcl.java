package org.browserlaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorcl {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		//Javascript Executor-->downcasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement username = driver.findElement(By.id("email"));
		
		//Sendkeys using jsexecutor
		js.executeScript("arguments[0].setAttribute('value', 'Stefi')", username);
		//get the values using JSexecutor
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", username);
		System.out.println(executeScript);
		
		WebElement pass = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		
		js.executeScript("arguments[0].setAttribute('value', 'Stefi@555')", pass);
		
		Object executeScript2 = js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(executeScript2);
		
		//Click using JS executor
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		
		js.executeScript("arguments[0].click()", login);
		
		Thread.sleep(3000);
		
		//Scroll down using JS Executor
		js.executeScript("window.scrollBy(0, 250)");
		
		Thread.sleep(3000);
		//Scroll up using JS Executor
		js.executeScript("window.scrollBy(0, -250)");
		
		
		driver.get("https://greenstech.in/");
		Thread.sleep(3000);
		WebElement home = driver.findElement(By.linkText("Home"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", home);
		
		js.executeScript("arguments[0].scrollIntoView(false)", home);

	}

}
