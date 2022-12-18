//package popUps;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import java.util.HashMap;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//public class download {
//	
//	WebDriver driver;
//	@BeforeTest
//	public void driverClass() {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}
//	
//	public void fileDownload() {
//		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//		chromePrefs.put("profile.default_content_settings.popups", 0);
//		chromePrefs.put("download.default_directory", "D:\\");
//		
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("prefs", chromePrefs);
//		
//		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		cap.setCapability(ChromeOptions.CAPABILITY, options);
//		//WebDriver driver = new ChromeDriver(cap); 
//		driver.get("http://www.seleniumhq.org/download/");
//		Thread.sleep(3000);
//		String xp = "//td[.='Java']/following-sibling::td/a[.='Download']";
//		driver.findElement(By.xpath(xp)).click();
//		}
//		
//
//		
//	}
//
//
