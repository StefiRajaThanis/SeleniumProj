package org.browserlaunch;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		//Implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Simple Alert
		WebElement simple = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		simple.click();
		
		Thread.sleep(3000);
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		
		//Confirm Alert
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
		confirm.click();
		
		Thread.sleep(3000);
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();

		
		//Prompt Alert
		WebElement prompt = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
		prompt.click();
		
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Stefi");
		promptAlert.accept();
	}

}
