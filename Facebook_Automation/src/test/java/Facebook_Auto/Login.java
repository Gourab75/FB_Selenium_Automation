package Facebook_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;

	@Test
	public void login_Page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);



		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String source = driver.getPageSource();
		System.out.println(source);

//		driver.findElement(By.id("email")).sendKeys("Gourab");

//		-------By using CssSelector-------

//		driver.findElement(By.cssSelector("input[id='email']"));
//		element.sendKeys("Gourab Gupta");

		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Gourab Gupta");
		Thread.sleep(2000);
		element.clear();

		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Gourab123@");
		Thread.sleep(2000);

		WebElement btn = driver.findElement(By.name("login"));
		btn.click();

		// driver.close();

		driver.findElement(By.partialLinkText("Forgotten")).click();

	}

	@Test
	public void webElementFunctions() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

//		sendkeys()
		driver.findElement(By.cssSelector("[class='inputtext _55r1 _6luy']")).sendKeys("gourab");

//		sleep()
		Thread.sleep(3000);

//		clear()
		driver.findElement(By.cssSelector("[class='inputtext _55r1 _6luy']")).clear();
	}

	@Test
	public void getLocation() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Point pnt = driver.findElement(By.id("email")).getLocation();

		System.out.println("The x cordinate position of text area field is " + pnt.x);

		System.out.println("The y cordinate position of text area field is " + pnt.y);
	}

	@Test
	public void getSize() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Dimension dimension = driver.findElement(By.name("login")).getSize();

		System.out.println("Height of the login box field is: " + dimension.height);

		System.out.println("Height of the login box field is: " + dimension.width);
	}

	@Test
	public void isSelected() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.id("checkbox1")).isSelected());

	}

	@Test
	public void isDisplayed() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.name("login")).isDisplayed());

	}

	@Test
	public void getTagNameFunction() {
		driver.get("https://www.facebook.com/");
		String getTagName = driver.findElement(By.name("email")).getTagName();
		System.out.println("getTagName menthod return :" + getTagName);
	}

	@Test
	public void getAttributeFunction() {
		driver.get("https://www.facebook.com/");
		String getAttribute = driver.findElement(By.cssSelector("[class='inputtext _55r1 _6luy']"))
				.getAttribute("name");
		System.out.println("getAttribute menthod return :" + getAttribute);
	}

	@Test
	public void submitFunction() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("adarsh");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("1234566");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[type=submit]")).submit();

	}

	@Test
	public void isEnabledFunction() {
		driver.get("https://www.facebook.com/");
		boolean isEnabled = driver.findElement(By.cssSelector("[class='inputtext _55r1 _6luy']")).isEnabled();
		System.out.println("is enabled menthod return :" + isEnabled);

	}

}