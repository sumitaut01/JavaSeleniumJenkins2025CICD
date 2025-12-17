package reports;

import com.aventstack.extentreports.Status;
import utils.ScreenShoutUtils;

public class ExtentLogger {

    public static void logPass(String message){
        ExtentReportManager.getTest().log(Status.PASS,message);
    }
    public static void logFail(String message){
        ExtentReportManager.getTest().log(Status.FAIL,message);
    }

    public static void logInfo(String message){
        ExtentReportManager.getTest().log(Status.INFO,message);
    }
    public static void logWarn(String message){
        ExtentReportManager.getTest().log(Status.WARNING,message);
    }
    public  static void addScreenshot(){
        ExtentReportManager.getTest().addScreenCaptureFromBase64String(ScreenShoutUtils.getScreenshot());

    }
}
