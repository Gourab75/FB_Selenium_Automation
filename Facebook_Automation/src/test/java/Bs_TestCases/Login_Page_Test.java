package Bs_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseClass;
import Bs_utility.Utility_test;
import Pages.Login_Page;

@Listeners(Lisner.lisner_Test.class)
public class Login_Page_Test extends BaseClass {
	Login_Page log_Page;
	Utility_test utility;
	
	public String SheetName = "Sheet1";
	

	public Login_Page_Test() { // constructor create
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		utility= new Utility_test();
		log_Page = new Login_Page(); // initialize the object
	}

	@Test
	public void login_Test() {
		log_Page.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@DataProvider     // for multiple data getting form sheet
	public Object[][] getLoginTestDatas(){
		Object data[][]=utility.getTestData(SheetName);
		return data;
	}
	
	@Test(dataProvider = "getLoginTestDatas")
		public void multiUserlogintest(String Username, String Password) {
		log_Page.multiUserlogin(Username, Password);
	}
	
}
