package Facebook_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;
	
	@Test
	public void Frames_Function() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///G:/Workspace%20directory/JSE-Html/Page3.html");	
		driver.manage().window().maximize();
		driver.switchTo().frame(0);		
	    driver.findElement(By.id("t1")).sendKeys("Gourab");
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("t2")).sendKeys("Gupta");
	    Thread.sleep(2000);
	   driver.close();
	}	
	
}
