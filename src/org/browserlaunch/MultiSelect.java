package org.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		//Select-->Predefined class
		Select s = new Select(fruits);
		s.selectByIndex(0);
//		s.selectByValue("Apple");
		s.selectByVisibleText("Grape");
		s.selectByIndex(2);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		

	}

}
