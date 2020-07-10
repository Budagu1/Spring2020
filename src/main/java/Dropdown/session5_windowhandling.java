package Dropdown;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class session5_windowhandling {

	WebDriver driver;
	@Test
	public void launchBrowser() throws Exception {
		// setting properties for chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\driver\\chromedriver.exe");
		//create web driver object
		driver = new ChromeDriver();
		//maximizing window
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//go to to link
		
		driver.get("https://www.yahoo.com/");
		// window handling 
		System.out.println(driver.getTitle());
		//System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("xpath");
		driver.findElement(By.xpath("//button[@id='header-desktop-search-button']")).click();
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
		//System.out.println(driver.getWindowHandles());
		// how to move driver to new window: we need advance for loop 
		for(String i:driver.getWindowHandles() ) {
			System.out.println(i);
			driver.switchTo().window(i);
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("CSS")).click();
		
}
}
