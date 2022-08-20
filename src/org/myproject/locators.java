package org.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

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
		
		// to click Groceries
		
		WebElement groceries = driver.findElement(By.id("rp_ListCats_lb_catName_3"));
		groceries.click();
		
		// click home page
		WebElement home = driver.findElement(By.xpath("(//div[@class='TopMenu LinkBn'])[1]"));
		home.click();
		
		//click no frill brands
		WebElement nofrillbrands = driver.findElement(By.xpath("//div[text()='No Frill Brands']"));
		nofrillbrands.click();
		//click product
		WebElement clickproduct = driver.findElement(By.xpath("//a[contains(@id,'ContentPlaceHolder1_GridView1_url_Product_0')]"));
		String text = clickproduct.getText();
		System.out.println(text);
		clickproduct.click();
		
		//to quite a browser

		driver.quit();
		
		
		
		
		
		
		
		
		
		

	}

}
