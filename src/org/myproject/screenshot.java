package org.myproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshot {

	static WebDriver driver;

	private static void Screenshot(String name) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;

		File screenst = tk.getScreenshotAs(OutputType.FILE);

		File f = new File("D:\\screenshot\\" + name + ".jpg");

		FileUtils.copyFile(screenst, f);

	}

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prakash\\eclipse-workspace\\seleniumclass\\src\\selenium drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.usgrocer.com/");

		driver.manage().window().maximize();
		System.out.println("Url=" + driver.getCurrentUrl());
		System.out.println("Title=" + driver.getTitle());
		Thread.sleep(2000);
		WebElement selection = driver.findElement(By.xpath("//select[@name='ctl00$ddl_SelectStateForShipping']"));
         Thread.sleep(3000);
		selection.click();
		selection.sendKeys("New york" + Keys.ENTER);
		Thread.sleep(2000);
		Screenshot("homepage");

		WebElement household = driver.findElement(By.xpath("//span[@id='rp_ListCats_lb_catName_1']"));
		System.out.println(household.getText());
		household.click();
		Thread.sleep(3000);
		WebElement laundry = driver.findElement(By.xpath("//span[text()='Laundry']"));
		laundry.click();
		Screenshot("laundry");
		
		
		
		WebElement list = driver.findElement(By.xpath("//a[text()='Laundry Detergents']"));
		
		list.click();
		
		Screenshot("laundrylist");
		
		
	}
}
