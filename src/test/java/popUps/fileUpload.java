package popUps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileUpload {
	WebDriver driver;
	@BeforeTest
	public void driverClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pande\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void uploadFile() throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\pande\\OneDrive\\Desktop\\Testing.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button'][@ng-click='item.upload()']")).click();
		Thread.sleep(2000);
		
	}
//	@Test
//	public void fileUploadUsingAutoIt() throws InterruptedException, IOException {
//		driver.get("https://www.freepdfconvert.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[@class='btn-wrapper upload-btn']")).click();
//		Thread.sleep(5000);
//		Runtime.getRuntime().exec("C:\\Users\\pande\\OneDrive\\Desktop\\autoItfile\\fileUpload.exe");
//		Thread.sleep(5000);
//		driver.close();
//
//	}
	@Test
	public void fileUpload() throws InterruptedException, IOException {
			driver.get("https://smallpdf.com/pdf-converter");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//span[@class='sc-1rd62mt-2 jltaIN']")).click();
			Thread.sleep(5000);
			Runtime.getRuntime().exec("C:\\Users\\pande\\OneDrive\\Desktop\\autoItfile\\saicharita.exe");
			Thread.sleep(5000);
			

		}
	}
	


