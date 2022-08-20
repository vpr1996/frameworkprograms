package trainingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myproject {

public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\prakash\\eclipse-workspace\\seleniumclass\\src\\selenium drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	

	driver.get("https://www.usgrocer.com/");
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	
	WebElement sure = driver.findElement(By.xpath("//select[@id='ddl_SelectStateForShipping']"));
 
 
	sure.click();
	sure.sendKeys("new york"+Keys.ENTER);
	
	// login
	WebElement login = driver.findElement(By.id("LoginStatus1"));
	
	login.click();
//	//Register the new usgrocer account
//	WebElement register = driver.findElement(By.id("ContentPlaceHolder1_LoginView1_Login1_CreateUserLink"));
//	register.click();
//	Thread.sleep(1000);	
//	WebElement username = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_CUW1_CreateUserStepContainer_UserName']"));
//    username.click();
//    username.sendKeys("prakashrandy@211996");
//    Thread.sleep(1000);
//    Actions a = new Actions(driver);
//    a.keyDown(Keys.TAB).perform();
//    a.keyUp(Keys.TAB).perform();
//    
//    Thread.sleep(1000);
//    Actions email = a.sendKeys("prakashrandy211996@gmail.com");
//    email.perform();
//    
//    a.keyDown(Keys.TAB).perform();
//    a.keyUp(Keys.TAB).perform();
//    
//    Thread.sleep(1000);
//    Actions password = a.sendKeys("prakash@1996");
//    password.perform();
//    
//    Thread.sleep(1000);
//    a.keyDown(Keys.TAB).perform();
//    a.keyUp(Keys.TAB).perform();
//    
//    
//    
//    Thread.sleep(1000);
//    Actions conpassword = a.sendKeys("prakash@1996");
//    conpassword.perform();
//    
//    
//    a.keyDown(Keys.TAB).perform();
//    a.keyUp(Keys.TAB).perform();
//    
//    
//    Actions firstname = a.sendKeys("prakash");
//    
//    firstname.perform();
//    
//    Thread.sleep(1000);
//    a.keyDown(Keys.TAB).perform();
//    a.keyUp(Keys.TAB).perform();
//    
//
//    Actions lastname = a.sendKeys("randy");
//    lastname.perform();
//    
//    a.keyDown(Keys.TAB).perform();
//    a.keyUp(Keys.TAB).perform();
//    Thread.sleep(1000);
//    WebElement newsletter = driver.findElement(By.id("ContentPlaceHolder1_CUW1_CreateUserStepContainer_ck_NewsLetter"));
//    newsletter.click();
//    
//    
//    a.keyDown(Keys.TAB).perform();
//    a.keyUp(Keys.TAB).perform();
//    
//    Actions qsn = a.sendKeys("what is my year of birth");
//    qsn.perform();
//    
//    a.keyDown(Keys.TAB).perform();
//    a.keyUp(Keys.TAB).perform();
//    
//    Actions answer = a.sendKeys("1996");
//    answer.perform();
//    
//   WebElement usercreate = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
//   
//   usercreate.click();
//   
//   //(upto top account create)
//   
	
	WebElement username = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_LoginView1_Login1_UserName']"));
	username.click();
	username.sendKeys("prakash@211996");
	
	Actions a = new Actions (driver);
	
	
	a.keyDown(Keys.TAB);
	a.keyUp(Keys.TAB);
	
	Actions pass = a.sendKeys("vgk@184221");
	pass.perform();
	
	WebElement logins = driver.findElement(By.xpath("(//input[@role='button'])[2]"));
      logins.click();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
	
	

	
	
	

}
}
