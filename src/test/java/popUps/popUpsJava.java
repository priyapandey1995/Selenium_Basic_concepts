package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class popUpsJava {
	WebDriver driver;
	@BeforeTest
	public void driverClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void alert() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
	}
	@Test
	public void alertForFiveSeconds() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Alert alert = driver.switchTo().alert();

}
	@Test
	public void confirmationUsingAccept() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();

}
	@Test
	public void confirmationUsingDismiss() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	@Test
	public void Prompt_input() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor jsexe=(JavascriptExecutor)driver;
		jsexe.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.sendKeys("priyapandey@gmail.com");
	}
		
	
	@Test
	public void promptUsingaccept() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	@Test
	public void promptUsingdismiss() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.dismiss();
		
	}
	}
	

