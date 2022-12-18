package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javascriptPopUps {
	WebDriver driver;
	@BeforeTest
	public void driverClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void alert() throws InterruptedException {
		driver.get("file:///C:/Users/pande/OneDrive/Documents/javaScript/advance/pop-window.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()=' ClickAlert ']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
	}
	@Test
	public void confirmationPopUpToAccept() throws InterruptedException {
		driver.get("file:///C:/Users/pande/OneDrive/Documents/javaScript/advance/pop-window.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()=' click -Delete Profile']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		alert.accept();
	}
	@Test
	public void confirmationPopUpToDismiss() throws InterruptedException {
		driver.get("file:///C:/Users/pande/OneDrive/Documents/javaScript/advance/pop-window.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()=' click -Delete Profile']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();
		alert.accept();
	}
	@Test
	public void prompt() throws InterruptedException {
		driver.get("file:///C:/Users/pande/OneDrive/Documents/javaScript/advance/pop-window.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()=' click-download file']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.sendKeys("priyapandey@gmail.com");
		alert.accept();
		alert.accept();
	}
	
	
	
	

}
