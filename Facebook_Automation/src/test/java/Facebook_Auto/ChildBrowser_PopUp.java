package Facebook_Auto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChildBrowser_PopUp {
	WebDriver driver;

	@Test
	public void closeParent_Window() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String ParentId = driver.getWindowHandle();
		//System.out.println("Parent id :" + ParentId);
		driver.findElement(By.linkText("Register")).click();
		Set<String> AllWindow = driver.getWindowHandles();
		int count = AllWindow.size();
		System.out.println("Number of window open in the system :" + count);
		for (String windowHandle : AllWindow) {
			// switch to each browser window
			driver.switchTo().window(windowHandle);
			/*
			 * compare the window id with the Parent browser window id, if both are equal,
			 * then only close the main browser window.
			 */
			if (windowHandle.equals(ParentId)) {
				Thread.sleep(5000);
				 driver.close();
			}
		}
	}

	@Test
	public void closeChild_Window() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String Parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Register")).click();
		Set<String> AllWindow = driver.getWindowHandles();
		int size = AllWindow.size();
		for (String windowHandle : AllWindow) {
			driver.switchTo().window(windowHandle);
			if (!windowHandle.equals(Parent)) {
				Thread.sleep(5000);
				driver.close();
			}
		}

	}

}
