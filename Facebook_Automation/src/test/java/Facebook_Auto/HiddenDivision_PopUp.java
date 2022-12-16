package Facebook_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenDivision_PopUp {
	WebDriver driver;
	@Test
	public void Hidden_PopUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
		driver.findElement(By.linkText("13")).click();
		Thread.sleep(2000);
	}
}
