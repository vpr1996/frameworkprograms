package org.myproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowshandling {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prakash\\eclipse-workspace\\seleniumclass\\src\\selenium drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.usgrocer.com/");

		driver.manage().window().maximize();
		WebElement selection = driver.findElement(By.xpath("//select[@name='ctl00$ddl_SelectStateForShipping']"));

		selection.click();
		selection.sendKeys("New york" + Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement down = driver.findElement(By.xpath("//a[text()='customerservice@usgrocer.com']"));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView", down);
		
		Actions a =new Actions(driver);
		a.moveToElement(down).perform();
		a.contextClick().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String parentid = driver.getWindowHandle();
		
		Set<String> allid = driver.getWindowHandles();
		
		for (String x : allid) {
			
			if (x.equals(parentid)) {
			driver.switchTo().window(x);	
			}
			
			
		}
	
		
	
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}