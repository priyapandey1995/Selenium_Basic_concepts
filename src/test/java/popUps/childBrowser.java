package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class childBrowser {
	WebDriver driver;
	@BeforeTest
	public void driverClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void toPrintWindowHandle() {
		driver.get("https://www.irctc.co.in/nget/train-search");
		String windowHandle = driver.getWindowHandle();
		System.out.println("id is"+ " "+windowHandle);
		
	}
	@Test
	public void countNoOfBrowser() {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ntc__chip-label'][@title='Data Science']")).click();
		Set<String> WindowHandles = driver.getWindowHandles();
		int count = WindowHandles.size();
		System.out.println("browser count is " + count);
		
		for (String windowHandle : WindowHandles) {
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			System.out.println("title is"+ title +" --> is : "+windowHandle);
	}
	}
	@Test
	public void closeChildBrowsersOnly() {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ntc__chip-label'][@title='Data Science']")).click();
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		driver.switchTo().window(windowHandle);
		String title = driver.getTitle();
		if (!windowHandle.equals(parentWindowhandleID)) {
			driver.close();
			System.out.println("Child Browser window with title"+ title +"is closed");
		}
		}
	}
	@Test
	public void colseAnySpecifiedWindow() {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ntc__chip-label'][@title='Data Science']")).click();
		String expected_title = "Marketing";
		Set<String> WindowHandles = driver.getWindowHandles();
		int count = WindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : WindowHandles) {
		driver.switchTo().window(windowHandle);
		String actual_title = driver.getTitle();
		if (actual_title.contains(expected_title)) {
		driver.close();
		System.out.println("Specified Browser window with title"+ actual_title +" is closed");
		}}

	}
	}


