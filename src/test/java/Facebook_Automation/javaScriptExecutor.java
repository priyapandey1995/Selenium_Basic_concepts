package Facebook_Automation;

import java.awt.event.WindowEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScriptExecutor {
	WebDriver driver;
	@Test
	public void toEnter_textInToDisabledTextBox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/pande/OneDrive/Desktop/executor.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('t1').value='priya'");
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('t2').value=''");
		
		js.executeScript("document.getElementById('t2').value='manager'");
		
		js.executeScript("document.getElementById('t2').type='button'");
	}
	@Test
	
	public void scrollUpAndDownToSpecificElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

	     js.executeScript("window.scrollBy(0,-500)");
	     Thread.sleep(2000);
	}
	@Test
	public void navigateToBottomOfThePage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img'][@ alt='Facebook']"));
		int x = logo.getLocation().getX();
		int y = logo.getLocation().getY();
		System.out.println("the x is" + x +"\n"+ "and y is" + y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		
		
	}

}
