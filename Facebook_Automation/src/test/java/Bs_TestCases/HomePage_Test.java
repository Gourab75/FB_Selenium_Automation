package Bs_TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import Bs_utility.Utility_test;
import Pages.Home_Page;
import Pages.Login_Page;

public class HomePage_Test extends BaseClass {
	Utility_test utility;
	public String SheetName = "Sheet3";
	public HomePage_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	@DataProvider
	public Object[][] homePageData(){
		Object data[][] = utility.getTestData(SheetName);
		return data;
	}
	
	@Test(dataProvider = "homePageData")
	public void singleUserHomePageTest(String username, String password) throws InterruptedException{
		Login_Page logPg = new Login_Page();
		Home_Page hmpg = new Home_Page();
		logPg.login(username, password);
		hmpg.performActions();
	}
}
