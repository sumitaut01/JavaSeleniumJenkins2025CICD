package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reports.ExtentLogger;
import reports.ExtentReportManager;

public class TestListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart invoked");
        ExtentLogger.logInfo("On Test Start");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess invoked");
        ExtentLogger.logPass("Test Passed");

    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure invoked");
        ExtentLogger.logFail(result.getThrowable().toString());
        ExtentLogger.addScreenshot();
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped invoked");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage invoked");
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);

        System.out.println("onTestFailedWithTimeout invoked");
    }

    public void onStart(ITestContext context) {  System.out.println("onStart invoked");

    }

    public void onFinish(ITestContext context) {

        try{
            ExtentReportManager.flushReports();
        }
        catch (Exception oex){
            System.out.println("onFinish invoked");
        }

    }
}
