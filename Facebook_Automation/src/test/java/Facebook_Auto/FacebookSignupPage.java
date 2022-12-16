package Facebook_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookSignupPage {
	WebDriver driver;

	@Test
	public void signupPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);

		WebElement fst = driver.findElement(By.name("firstname"));
		fst.sendKeys("Gourab");
		Thread.sleep(2000);
		WebElement lst = driver.findElement(By.name("lastname"));
		lst.sendKeys("Gupta");
		Thread.sleep(2000);
		WebElement emal = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emal.sendKeys("gourab.gupta14@gmail.com");
		Thread.sleep(2000);
		WebElement emal1 = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		emal1.sendKeys("gourab.gupta14@gmail.com");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("Gourab1996&");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("12");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Oct");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1996");
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//input[@name='sex'][@value=2]"));
		element.click();

		driver.findElement(By.name("websubmit")).submit();
		Thread.sleep(2000);

		WebElement btn = driver.findElement(By.name("websubmit"));
		btn.click();
	}

	@Test
	public void textfunction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
	}

	@Test
	public void containsfunction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
	}

	@Test
	public void startswithfunction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Create New Account')]")).click();
		Thread.sleep(2000);

	}

	@Test
	public void xpath_endstwith() throws InterruptedException {
		driver.findElement(By.xpath("//a[ends-with(text(),'New Account')]")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

}