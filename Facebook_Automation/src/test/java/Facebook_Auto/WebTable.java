package Facebook_Auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	WebDriver driver;
	
	//print the total number of ROWS present
	@Test
	public void Web_Table_RowsCount() {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///G:/WebTable.html");
		driver.manage().window().maximize();
		List<WebElement> allRow = driver.findElements(By.xpath("//tr"));
		 int RowC = allRow.size();
		System.out.println("Total Row Count : "+RowC);	
	}
	
	//print the total number of COLUMNS present
	@Test
	public void Web_Table_ColumnCount() {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///G:/WebTable.html");
		driver.manage().window().maximize();
		List <WebElement> allColumn = driver.findElements(By.xpath("//th"));
		int ColumnC=allColumn.size();
		System.out.println("Total Column Count : "+ColumnC);
	}
	
	//print the total number of CELLS present
	@Test
	public void Web_Table_TotalNumber_Of_Cells() {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///G:/WebTable.html");
		driver.manage().window().maximize();
		List <WebElement> Row =driver.findElements(By.xpath("//tr"));	
		int row = Row.size();
		List <WebElement> Colunm =driver.findElements(By.xpath("//th"));
		int column= Colunm.size();
		int totalCell = row * column;
		System.out.println("Total number of Cells : "+totalCell);
	}
	
	@Test
	public void Web_Table_PrintNumeric_Value() {
		System.setProperty("webdriver.chrome.driver", "G:\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///G:/WebTable.html");
		driver.manage().window().maximize();
		List <WebElement> list = driver.findElements(By.xpath("//td"));
		int NumericCount=0;
		int Sum =0;
		System.out.println("List of Numeric value :");
		for(WebElement element : list)
		{
			String value = element.getText();
			try {
			int numericValue = Integer.parseInt(value);		
			System.out.println(numericValue);
			NumericCount++;
			Sum=Sum+numericValue;
			}
			catch(Exception e) {
				
			}		
		}
		System.out.println("Count of Numeric value : "+NumericCount);
		System.out.println("Sum of Numeric value :"+Sum);
	}
}
