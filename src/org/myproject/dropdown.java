package org.myproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

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

		WebElement householdsupplies = driver.findElement(By.xpath("//span[text()='HOUSEHOLD SUPPLIES']"));
		
		String text = householdsupplies.getText();
		System.out.println(text);
		householdsupplies.click();
		
		Robot r = new Robot();
		for (int i = 0; i <2; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Kitchen Supplies']")).click();
		
		driver.findElement(By.xpath("//a[text()='Cooking Bags']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}