package popUps;

import java.io.Console;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selectbar {
	
		WebDriver driver;
		@BeforeTest
		public void driverClass() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		@Test
	public void  getOption() {
		driver.get("file:///C:/Users/pande/OneDrive/Desktop/select.html");
		WebElement option = driver.findElement(By.id("everest"));
		
		Select s = new Select(option);
		
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Number of elements present inside the listbox is : "+ size);
	}
		@Test
		public void toPrintAllTheElement() {
			driver.get("file:///C:/Users/pande/OneDrive/Desktop/select.html");
			WebElement option = driver.findElement(By.id("everest"));
			
			Select s = new Select(option);
			
			List<WebElement> options = s.getOptions();
			int size = options.size();
			System.out.println("Number of elements present inside the listbox is : "+ size);
			
			for (WebElement webElement : options) {
				String text = webElement.getText();
				System.out.println(text);
				}
			}
		@Test
		public void byIndex() {
			driver.get("file:///C:/Users/pande/OneDrive/Desktop/select.html");
			WebElement option = driver.findElement(By.id("everest"));
			
			Select s = new Select(option);
			s.selectByIndex(1);
			
		}
		@Test
		public void byValue() {
			driver.get("file:///C:/Users/pande/OneDrive/Desktop/select.html");
			WebElement option = driver.findElement(By.id("everest"));
			
			Select s = new Select(option);
			s.selectByValue("r");
			
		}
		@Test
		public void toPrintAllOptions() {
			driver.get("file:///C:/Users/pande/OneDrive/Desktop/select.html");
			WebElement option = driver.findElement(By.id("everest"));
			Select s = new Select(option);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			s.selectByVisibleText("DAAL");
			int size = allSelectedOptions.size();
			System.out.println("Number of items that is selected in the list box is : "+size);
			System.out.println(" Selected items are printed below ");
			for (WebElement webElement : allSelectedOptions) {
				String str=webElement.getText();
			System.out.println(str);
			}
		}
			
		@Test	
		public void deselectByIndex() throws InterruptedException {
			driver.get("file:///C:/Users/pande/OneDrive/Desktop/select.html");
			WebElement option = driver.findElement(By.id("everest"));
			
			Select s = new Select(option);
			s.selectByIndex(1);
			Thread.sleep(3000);
			s.deselectByIndex(1);
			
		}
		@Test
		public void toPrintTheSelectedOption() {
			driver.get("file:///C:/Users/pande/OneDrive/Desktop/select.html");
			WebElement option = driver.findElement(By.id("everest"));
			
			Select s = new Select(option);
			s.selectByIndex(1);
			WebElement SelectedOption = s.getFirstSelectedOption();
			System.out.println(SelectedOption.getText()+" is the  selected item");
			}
		@Test
		public void deselectbyValue() throws InterruptedException {
			driver.get("file:///C:/Users/pande/OneDrive/Desktop/select.html");
			WebElement option = driver.findElement(By.id("everest"));
			
			Select s = new Select(option);
			s.selectByValue("r");
			Thread.sleep(3000);
			s.deselectByValue("r");
			
		}
}
