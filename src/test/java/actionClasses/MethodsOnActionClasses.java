package actionClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MethodsOnActionClasses {
	WebDriver driver;
	
	@BeforeTest
	public void driverClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void contextClickUsingActionClass() throws InterruptedException, AWTException {
		driver.get("https://www.facebook.com/");
		WebElement login =  driver.findElement(By.xpath("//button[text()='Log in']"));
		Actions action = new Actions(driver);
		action.contextClick(login).perform();
		Thread.sleep(2000);
	}
	@Test
	public void moveToElement() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Create New Account"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(link).perform();
	}
	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement des = driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.dragAndDrop(source, des).perform();
	}
	@Test
   public void usingDoubleClick() throws InterruptedException {
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
	   WebElement pass = driver.findElement(By.xpath("//input[@type='password'][@name='pass']"));
	   Actions action = new Actions(driver);
	   action.doubleClick(pass).perform();
	   Thread.sleep(3000);
	   action.doubleClick(mail).perform();
	   Thread.sleep(2000);
	}
	@Test
	public void keyboardMethods() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	   WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
	   Actions action = new Actions(driver);
	   action.contextClick(mail).perform();
	   action.sendKeys(Keys.DOWN).perform();
	   Thread.sleep(2000);
	   action.sendKeys(Keys.ENTER).perform();
	   Thread.sleep(2000);
	}
	@Test
	public void googleShortcuts() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q"));
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.sendKeys("webdriver").perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("A").perform();
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("c").perform();
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("t").perform();
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("v").perform();
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
	}
	
	
	
}
