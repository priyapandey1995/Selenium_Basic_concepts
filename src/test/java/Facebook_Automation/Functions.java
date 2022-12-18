package Facebook_Automation;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriverException;
import com.google.common.io.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Functions {
	private static final String FileUtils = null;
	WebDriver driver;

	@Test
	public void Xpath_expression_using_contains_text_Or_attribute() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		link.click();
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.xpath("//input[contains(@placeholder,'First name')]"));
		name.sendKeys("priya");
		Thread.sleep(3000);
		}
	@Test
	public void Xpath_expression_using_start_with() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.xpath("//a[starts-with(text(),'Create New')]"));
		link.click();
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.xpath("//input[starts-with(@placeholder,'First name')]"));
		name.sendKeys("priya");
		Thread.sleep(3000);
		}
	@Test
	public void Xpath_expression_using_group_index() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		link.click();
		Thread.sleep(3000);
		
		WebElement female = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		female.click();
		Thread.sleep(3000);
		
		WebElement last_value = driver.findElement(By.xpath("(//label[@class='_58mt'])[last()]"));
		last_value.click();
		Thread.sleep(3000);
	}
	@Test
	public void Xpath_expression_using_getText() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		link.click();
		Thread.sleep(3000);
	
		WebElement element = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		String text = element.getText();
		System.out.println("the text is" +" "+ text);
		Thread.sleep(3000);
	}
	@Test
	public void Xpath_expression_using_getTagname() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		link.click();
		Thread.sleep(3000);
	
		WebElement element = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		String tag = element.getTagName();
		System.out.println("the tagname is" +" "+ tag);
		Thread.sleep(3000);
	}
	
	@Test
	public void take_Screenshots() throws InterruptedException,IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
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
		

		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(".//Facebook_Screenshot//" + "signup_page.png");
		Files.copy(srcFile, destFile);
		driver.close();
	}
}
