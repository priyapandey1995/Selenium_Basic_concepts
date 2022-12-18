package Facebook_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
	WebDriver driver;
	
	@Test
	public void browser_navigation() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("The title" +  " "+ title);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL is" + " " +url );
		
	    String source_Code  = driver.getPageSource();
		System.out.println(source_Code);
		
		driver.navigate().to("https://www.flipkart.com/");
	    Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.close();
	}

}
