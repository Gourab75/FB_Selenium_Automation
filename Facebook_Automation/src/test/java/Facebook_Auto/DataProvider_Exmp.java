package Facebook_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Exmp {      //14/22

	@DataProvider
	public Object[][] datas() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Gourab";
		data[0][1] = "Gourab123";
		data[1][0] = "Papai";
		data[1][1] = "Papai123";
		return data;
	}
	@Test(dataProvider="datas")
	public void login(String firstname , String password){
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys(firstname);
		
		driver.findElement(By.name("pass")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.close();
		
	}
}
