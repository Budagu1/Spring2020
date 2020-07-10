package testloct;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class varlocator {
	WebDriver driver;
@Before
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\objecttec\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get(" http://objectspy.space/");
	driver.manage().window().maximize();
}
@Test
public void test() throws InterruptedException {

driver.findElement(By.id("sex-0")).click();
	//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	Thread.sleep(5000);
	//driver.findElement(By.cssSelector("input#exp-2")).click();
}
@After
public void teardown() {
	driver.close();
	
}

}
