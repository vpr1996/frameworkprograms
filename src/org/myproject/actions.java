package org.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prakash\\eclipse-workspace\\seleniumclass\\src\\selenium drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.usgrocer.com/");

		driver.manage().window().maximize();

		WebElement selection = driver.findElement(By.xpath("//select[@name='ctl00$ddl_SelectStateForShipping']"));

		selection.click();
		selection.sendKeys("New york" + Keys.ENTER);
		//to get url
		System.out.println(driver.getCurrentUrl());
		//to get title
		System.out.println(driver.getTitle());
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		WebElement householdsuppliers = driver.findElement(By.id("rp_ListCats_lb_catName_1"));
		Thread.sleep(2000);
		a.moveToElement(householdsuppliers).perform();
		a.click().perform();
		for (int i = 0; i <4; i++) {
			a.keyDown(Keys.DOWN).perform();
			a.keyUp(Keys.DOWN).perform();
		}
		
		a.click().perform();
		
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='tb_Search']"));
		Thread.sleep(2000);
		a.moveToElement(searchbox).perform();
		a.click().perform();
		a.sendKeys("electric stove").perform();
		
		WebElement search  = driver.findElement(By.xpath("//input[@id='bn_Search']"));
		Thread.sleep(2000);
		a.click(search).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
