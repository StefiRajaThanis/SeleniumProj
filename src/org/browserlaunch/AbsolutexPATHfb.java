package org.browserlaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutexPATHfb {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
WebElement user = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div[2]/div/div/form/div/div/input"));
		user.sendKeys("Stefi");
		
WebElement pass = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]/div[2]/div/div/form/div/div[2]/div/input"));
pass.sendKeys("Stefi@555");

driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button")).click();

//driver.get("https://www.amazon.in/");
//
//driver.findElement(By.xpath("/html/body/div/header/div/div[1]/div[2]/div/form/div[2]/div[1]/div/input")).sendKeys("Apple Ipone");
//
//driver.findElement(By.xpath("/html/body/div/header/div/div/div[2]/div/form/div[3]/div/span/input")).click();


		
		

	}

}
