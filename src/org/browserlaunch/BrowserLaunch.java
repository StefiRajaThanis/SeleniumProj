package org.browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		//Browser launch
		WebDriver driver = new EdgeDriver();
		//Browser Maximize
		driver.manage().window().maximize();
		
		//Cookies delete
		driver.manage().deleteAllCookies();
		
		//Url launch
	    driver.get("https://www.facebook.com/");
		
	    //Get the title from the webpage
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    //Get the URL from the Current page
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    //Get the page source
//	    String pageSource = driver.getPageSource();
//	    System.out.println(pageSource);
	    
	    //Navigate() METHOD
	    //Url Launch
	    driver.navigate().to("https://www.amazon.in/");
	    //previous web page
	    driver.navigate().back();
	    
	    driver.navigate().forward();
	    
	    driver.navigate().refresh();
	    
	    //Close the current browser
//	    driver.close();
	    
	    //Kill the driver
//	    driver.quit();

	}

}
