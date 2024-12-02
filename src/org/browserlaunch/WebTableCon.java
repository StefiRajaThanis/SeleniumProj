package org.browserlaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> theadings = driver.findElements(By.xpath("(//table)[1]/tbody/tr[1]/th"));
		theadings.size();
		
		//Enhaned for loop
		System.out.println("Table Headings: ");
		for(WebElement x : theadings) {
			String text = x.getText();
			System.out.println(text);
		}
		
		List<WebElement> trows = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
		
		System.out.println("Table rows: ");
		for(WebElement x : trows) {
			String text = x.getText();
			System.out.println(text);
		}
		

	}

}
