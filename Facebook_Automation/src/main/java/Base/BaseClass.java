package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
	public ExtentReports extent =new ExtentReports();
	public ExtentSparkReporter spark = new ExtentSparkReporter("Report_Generate/ExtentReport.html");
	ExtentTest test;
	public BaseClass() {
		prop=new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream(
					"G:\\Workspace directory\\Facebook_Automation\\src\\main\\java\\Bs_ConfigureProperties\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void initialization() {		
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
	
	public void takeScreenShot() {
		TakesScreenshot tksht =(TakesScreenshot)driver;
		File file= tksht.getScreenshotAs(OutputType.FILE);
		File filesave = new File("G:\\Workspace directory\\Facebook_Automation\\ScreenShot\\" + "ScreenShot.png");
		try {
			FileHandler.copy(file, filesave);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
}
