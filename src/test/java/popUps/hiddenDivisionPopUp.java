package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hiddenDivisionPopUp {
	WebDriver driver;
	@BeforeTest
	public void driverClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void hiddenDivisionPopUp() throws InterruptedException {
		driver.get("https://www.irctc.co.in/nget/train-search");
	WebElement link =driver.findElement(By.xpath("//input[@type='text'][@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
	link.click();
//	Actions action = new Actions(driver);
//	action.contextClick(link).perform();
//	action.sendKeys(Keys.DOWN).perform();
//	Thread.sleep(2000);
//	action.sendKeys(Keys.ENTER).perform();
//	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='18']")).click();
}

}
