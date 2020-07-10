package Dropdown;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {
	WebDriver driver;

	@Test
	public void launchBrowser() throws InterruptedException {
		// setting properties for chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\driver\\chromedriver.exe");
		// create web driver object
		driver = new ChromeDriver();
		// maximizing window
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// go to to link

		driver.get("https://www.dell.com/en-us");
		//Mouse overe
		WebElement PLOCATOR = driver.findElement(By.xpath("//button[@id='11']"));
		WebElement NETWORK_MENU = driver.findElement(By.xpath("//a[@id=\"11_5\"]/span"));
		
		Actions action = new Actions(driver);
		action.moveToElement(PLOCATOR).build().perform();
		Thread.sleep(1000);
		action.moveToElement(NETWORK_MENU).build().perform();

}
}
