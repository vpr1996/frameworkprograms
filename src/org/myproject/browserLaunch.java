package org.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserLaunch {
	
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\prakash\\eclipse-workspace\\seleniumclass\\src\\selenium drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.usgrocer.com/");
		driver.manage().window().maximize();
		
		
		WebElement selection = driver.findElement(By.xpath("//select[@name='ctl00$ddl_SelectStateForShipping']"));
		
		selection.click();
		selection.sendKeys("New york"+Keys.ENTER);
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
