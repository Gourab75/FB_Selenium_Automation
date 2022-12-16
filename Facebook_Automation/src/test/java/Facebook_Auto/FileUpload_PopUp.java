package Facebook_Auto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload_PopUp {
	WebDriver driver;

	@Test
	public void fileUploadUsingAutoit() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-converter");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='l3tlg0-0 ggoliT']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("G:\\AutoITUpload\\NewResumeUP.exe");
		Thread.sleep(5000);
		//driver.close();
	}

}
