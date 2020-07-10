package Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class learnigassertion {
	WebDriver driver;
	@Test
	public void l() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\driver\\chromedriver.exe");
		//create web driver object
		driver = new ChromeDriver();
		//maximizing window
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//go to to link
		
		driver.get("https://www.google.com/");
		
		
		 String atl = driver.getTitle();
		 System.out.println(atl);
		 String ex = "Google";
		 Assert.assertEquals(atl, ex);
		 driver.close();
		 
		
	}

}
