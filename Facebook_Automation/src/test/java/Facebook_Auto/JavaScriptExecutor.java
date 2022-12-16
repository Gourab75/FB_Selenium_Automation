package Facebook_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
	ChromeDriver driver;

	@Test
	public void disabledTextbox() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///G:/Workspace%20directory/JSE-Html/DisableTextbox.html");

		// Typecast the driver object to JavascriptExecutor interface type
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		// enter "Gourab" in first textbox using javascript
		
		js.executeScript("document.getElementById('t1').value='Gourab'");
		Thread.sleep(2000);

		// clear the value in second textbox using javascript
		
		js.executeScript("document.getElementById('t2').value=''");
		Thread.sleep(2000);

		// enter "manager" in second textbox using javascript
		
		js.executeScript("document.getElementById('t2').value='Manager'");
		Thread.sleep(2000);

		// change the second text box to button type using Javascript
		
		js.executeScript("document.getElementById('t2').type='button'");
		Thread.sleep(2000);
	}

	@Test
	public void scrool_updown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// ChromeDriver js1 = driver;
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);

		js1.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
//		driver.close();
	}

	@Test
	public void scroll_updown_SpecificElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.name("login"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(" + x + ", " + y + ")");

	}

	@Test
	public void frameIndexValue() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("file:///G:/JSE-Html/page2.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// using index of the frame - [ int value] [ index of frames starts with zero]
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("a");

	}

	@Test
	public void frameIndexID() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("file:///G:/JSE-Html/page2.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// using id attribute of the frame -string
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("b");
	}

	@Test
	public void frameIndexName() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("file:///G:/JSE-Html/page2.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// using name attribute of the frame -string
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("c");

	}

	@Test
	public void frameIndexAddress() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("file:///G:/JSE-Html/page2.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// using address of the frame -webelement
		WebElement f = driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t1")).sendKeys("d");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("d");
		// driver.close();

	}

}
