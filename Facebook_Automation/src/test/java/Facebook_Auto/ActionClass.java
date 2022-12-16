package Facebook_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
	WebDriver driver;

	@Test
	public void contextClick_Method() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement MobNum = driver.findElement(By.xpath("//input[@id='email']"));
		Actions actions = new Actions(driver);
		actions.contextClick(MobNum).perform();
		Thread.sleep(2000);
		// driver.close();

	}

	@Test
	public void dragAndDrop_Method() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(src, des).perform();
	}

	@Test
	public void doubleClick_Method() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement MobNum = driver.findElement(By.id("email"));
		WebElement Pass = driver.findElement(By.name("pass"));
		actions.doubleClick(Pass).perform();
		Thread.sleep(2000);
		actions.doubleClick(MobNum).perform();
		Thread.sleep(2000);

	}

	@Test
	public void keyboard_Method() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.partialLinkText("Forgotten password"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		actions.sendKeys(Keys.DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);

	}

}