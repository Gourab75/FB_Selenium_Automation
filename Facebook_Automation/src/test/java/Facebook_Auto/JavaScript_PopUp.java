package Facebook_Auto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript_PopUp {
	WebDriver driver;

	@Test
	public void simple_Alert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
	}

	@Test
	public void time_alert() {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("timerAlertButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

	@Test
	public void confirmation_PopUp() {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
	}
	
	@Test
	public void confirmation_PopUp2() {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

	@Test
	public void promptbox_PopUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("button[id='promtButton']")).click();
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.sendKeys("Gourab");
		alert.accept();

	}

}
