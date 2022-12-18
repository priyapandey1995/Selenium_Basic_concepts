package Facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	@Test
	
	public void login_page_id_name() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Priya");
		
		WebElement password = driver.findElement(By.name("pass"));
	   	password.sendKeys("pandey");
	   	
		
		driver.findElement(By.linkText("Forgotten password?")).click();
       	
	}
		@Test
		public void login_by_css_selectors() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.cssSelector("input[id='email'][type='text']"));
		email.sendKeys("Priya Pandey");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.cssSelector("input[id='pass'][class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys("priya@1234");
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.cssSelector("button[value='1'][name='login']"));
		btn.click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Forgotten password")).click();
		
	}
		
		@Test
		public void login_xpath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("Priya Pandey");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password'][@name='pass']"));
		pass.sendKeys("Pandey");
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath("//button[text()='Log in']"));
		btn.click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
}
	

}
