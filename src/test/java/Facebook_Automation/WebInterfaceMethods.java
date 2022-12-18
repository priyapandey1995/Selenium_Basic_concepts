package Facebook_Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebInterfaceMethods {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void toClear() throws InterruptedException {
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Priya");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
	}
	@Test
	
	public void toClick() throws InterruptedException {
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Priya");
		WebElement password = driver.findElement(By.name("pass"));
	   	password.sendKeys("pandey");
	   	WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	}
	@Test
	public void toSendKeys() throws InterruptedException {
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Priya");
	}
	@Test
	public void todisplaye() throws InterruptedException {
		driver.findElement(By.id("email")).isDisplayed();
		
	}
	@Test
	public void is_enabled() throws InterruptedException {
		driver.findElement(By.id("email")).isEnabled();
		
	}
	@Test
	public void get_Text() throws InterruptedException {
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Priya");
		String text = element.getText();
		System.out.println("the text is" + text);
	}
	@Test
	public void get_TagName() throws InterruptedException {
		driver.findElement(By.id("email")).getTagName();
	}
	
	@Test
	public void get_Size() throws InterruptedException {
		WebElement element = driver.findElement(By.id("email"));
		Dimension dimension = element.getSize();
		System.out.println("The height is" + dimension.getHeight());
		System.out.println("The height is" + dimension.getWidth());
	}
	@Test
	public void get_location() throws InterruptedException {
		WebElement element = driver.findElement(By.id("email"));
		Point point = element.getLocation();
		System.out.println("The x-cordinate is" + point.getX());
		System.out.println("The y-cordinate  is" + point.y);
		}
	@Test
	public void get_Attribute() throws InterruptedException {
		System.out.println("the value is"+driver.findElement(By.id("email")).getAttribute("id"));
		
		}

	
	
	

	
}
