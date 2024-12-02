package org.browserlaunch;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSeXECUTOR {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Static wait
		Thread.sleep(3000);
		//Implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
		//DownCasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Send values using JS Executor-->Username
		WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		js.executeScript("arguments[0].setAttribute('value', 'Stefi')", username);
		
		//get Value using JS Executor-->Username
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", username);
		System.out.println(executeScript);
		
		//Send values using JS Executor-->Password
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value', 'Stefi@555')", pass);
		
		//Explicit wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
				wait.until(ExpectedConditions.visibilityOf(pass));
				
		//get Value using JS Executor-->Password
		Object passtext = js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(passtext);
		
		//Click login using JS Executor
		WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		js.executeScript("arguments[0].click()", login);
		
//		driver.get("https://greenstech.in/");
		
		Thread.sleep(3000);
//		WebElement home = driver.findElement(By.linkText("Home"));
		//Scrolldown using JS Executor
//		js.executeScript("arguments[0].scrollIntoView(true)", home);
		
//		js.executeScript("window.scrollBy(0, 500)");
		
		Thread.sleep(4000);
//		js.executeScript("window.scrollBy(0, -500)");

	}

}
