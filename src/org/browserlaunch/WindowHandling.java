package org.browserlaunch;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class WindowHandling {
	
	public static WebDriver driver;
	
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Screenshot\\"+name+".png");
		Files.copy(source, destination);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		screenshot("AmazonHomepage");
		
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple phone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		screenshot("Mobile list");
	driver.findElement(By.xpath("//span[text()='Apple iPhone 16 (128 GB) - Black']")).click();
		Thread.sleep(5000);
	screenshot("Applephone1");
		//Parent Window Id
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent window Id: "+parentWindowId);
		
		//All Windows Id
		Set<String> allwindowsId = driver.getWindowHandles();
		System.out.println("All windows Id: "+allwindowsId);
		
		//Set value based --->Enhanced for loop
		for(String x : allwindowsId) {
			if(!parentWindowId.equals(x)) {
				driver.switchTo().window(x);
				System.out.println("First Child window Id: "+x);
			}	
		}
		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - (Product) RED']")).click();
Thread.sleep(5000);
		screenshot("Apple iphone2");
		
		Set<String> allWindowsId2 = driver.getWindowHandles();
		System.out.println(allWindowsId2); //3
		
		//List-Index based
		List<String> li = new LinkedList<String>();
		System.out.println(li); //Empty
		li.addAll(allWindowsId2);
		System.out.println(li); //3 windows id
		
		String secondChild = li.get(2);
		System.out.println("Second Child window id: "+secondChild);
		
		driver.switchTo().window(parentWindowId);
	}

}
