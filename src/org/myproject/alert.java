package org.myproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prakash\\eclipse-workspace\\seleniumclass\\src\\selenium drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.usgrocer.com/");

		driver.manage().window().maximize();
		System.out.println("Url="+driver.getCurrentUrl());
		System.out.println("Title="+driver.getTitle());
		WebElement selection = driver.findElement(By.xpath("//select[@name='ctl00$ddl_SelectStateForShipping']"));

		selection.click();
		selection.sendKeys("New york" + Keys.ENTER);
		Robot r = new Robot();
		Thread.sleep(3000);
		for (int i = 0; i < 3; i++) {

			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	//Alert
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		String text = al.getText();
		System.out.println("Alert text="+text);	
		al.accept();
		
		
		driver.quit();
			
	}	
	
}
