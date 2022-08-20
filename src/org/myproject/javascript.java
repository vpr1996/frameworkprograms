package org.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) throws Throwable {
		
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
		
		
		WebElement nofrillbrands = driver.findElement(By.xpath("//div[text()='No Frill Brands']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()",nofrillbrands);
		Thread.sleep(5000);
		WebElement scroll = driver.findElement(By.xpath("//a[text()='WhiteRose Heavy Duty Spoons 24 ct']"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
		
		WebElement lastitem = driver.findElement(By.xpath("//a[text()='WhiteRose Tender Sweet Peas 15 oz (Pack of 24)']"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()",lastitem);
		Thread.sleep(5000);	
		WebElement scroll2 = driver.findElement(By.xpath("//span[@id='ContentPlaceHolder1_lb_ProductName']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",scroll2);
		
		WebElement qty = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_tb_Qty']"));
		Thread.sleep(5000);
		js.executeScript("arguments[0].setAttribute('value','10')",qty);
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
