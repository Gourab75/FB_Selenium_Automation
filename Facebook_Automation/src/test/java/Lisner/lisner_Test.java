package Lisner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;

import Base.BaseClass;

public class lisner_Test extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName() + " : onTestStart");
		extent.attachReporter(spark);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName() + " : onTestSuccess");
		ExtentTest test = extent.createTest(result.getMethod().getMethodName());
		test.pass("Test successfully executed");
		extent.flush(); // for saving a file
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName() + " : onTestFailure");
		ExtentTest test = extent.createTest(result.getMethod().getMethodName()).assignAuthor("Gourab").assignDevice("Chrome");
		test.fail("Test method failed");
		takeScreenShot();
		extent.flush(); 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
