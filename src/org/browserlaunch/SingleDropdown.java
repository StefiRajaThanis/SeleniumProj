package org.browserlaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Stefi");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("Arul");
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select s = new Select(date);
//	    s.selectByIndex(5);
		s.selectByValue("18");
//		s.selectByVisibleText("20");
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = s.getOptions();
		//For loop
		System.out.println("Iterate values using for loop: ");
		for(int i = 0; i<options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
		
		//Enhanced for loop
		System.out.println("Enhanced for loop: ");
		for(WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
		}

	}

}
