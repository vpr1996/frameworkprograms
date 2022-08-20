package trainingselenium;
import java.util.*;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class classtaskselenium {
             
	   
	
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\prakash\\eclipse-workspace\\seleniumclass\\src\\selenium drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("email")).sendKeys("9566903783");
		driver.findElement(By.id("pass")).sendKeys("9444091064");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("(//div[@aria-label=\"Messenger\"])[1]")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		w.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		a.accept();
		
		
	
		
	
	
	}
	
}
			

		
		
		

	 


