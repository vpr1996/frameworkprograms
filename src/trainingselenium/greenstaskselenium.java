package trainingselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.myproject.robotclass;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.language.Value;
import io.netty.handler.codec.http.websocketx.extensions.compression.PerMessageDeflateClientExtensionHandshaker;

public class greenstaskselenium {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\prakash\\eclipse-workspace\\seleniumclass\\src\\selenium drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://en.zalando.de/?_rfl=de");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.xpath("//button[@class=\"uc-btn uc-btn-primary\"]")).click();
		
		Actions a = new Actions(driver);
		Robot r = new Robot();
		WebElement shoes = driver.findElement(By.xpath("//span[text()='Shoes']"));
		
		a.moveToElement(shoes).perform();
		
		for (int i = 0; i <14; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		a.click().perform();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
