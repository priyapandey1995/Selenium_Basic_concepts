package Facebook_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_Up {
	WebDriver driver;

	@Test
	public void singUp_Using_XPath() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		link.click();
		Thread.sleep(3000);
		

		WebElement name = driver.findElement(By.xpath("//input[@type='text'][@placeholder='First name']"));
		name.sendKeys("Priya");
		Thread.sleep(2000);
		
		
		WebElement lastname = driver.findElement(By.xpath("//input[@type='text'][@name='lastname']"));
		lastname.sendKeys("Pandey");
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.xpath("//input[@type='text'][@name='reg_email__']"));
		mobile.sendKeys("8884327526");
		Thread.sleep(2000);
		
		WebElement newPassword = driver.findElement(By.xpath("//input[@id='password_step_input'][@type='password']"));
		newPassword.sendKeys("Pandey");
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day'][@class='_9407 _5dba _9hk6 _8esg']"));
		day.sendKeys("18");
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		month.sendKeys("july");
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		year.sendKeys("1995");;
		Thread.sleep(3000);
		
		WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
		female.click();
		Thread.sleep(3000);
		
		WebElement sign = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		sign.click();
		Thread.sleep(3000);
	}
	@Test
	
	public void signUp_Using_Css_Selector() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	    driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.cssSelector("input[type='text'][class='inputtext _58mg _5dba _2ph-'][id='u_4_b_S5']"));
		name.sendKeys("Priya");
		Thread.sleep(3000);
		
		WebElement lastname = driver.findElement(By.cssSelector("input[type='text'][id='u_2_d_CB']"));
		lastname.sendKeys("Pandey");
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.cssSelector("input[type='text'][class='inputtext _58mg _5dba _2ph-'][id='u_4_g_2r']"));
		mobile.sendKeys("8884327526");
		Thread.sleep(2000);
		
		WebElement newPassword = driver.findElement(By.xpath("//input[@id='password_step_input'][@type='password']"));
		newPassword.sendKeys("Pandey");
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.cssSelector("[id='day']"));
		day.sendKeys("18");
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.cssSelector("[id='month'][class='_9407 _5dba _9hk6 _8esg']"));
		month.sendKeys("july");
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.cssSelector("[id='year'][class='_9407 _5dba _9hk6 _8esg']"));
		year.sendKeys("1995");;
		Thread.sleep(3000);
		
		WebElement female = driver.findElement(By.cssSelector("[id='u_0_4_OF'][value='1']"));
		female.click();
		Thread.sleep(3000);
		
		WebElement btn = driver.findElement(By.cssSelector("button[type='submit'][id='u_0_s_hn']"));
		btn.click();
		Thread.sleep(3000);
		
	}	
	
}
