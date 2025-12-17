package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import utils.ConfigReader;

public final class ExtentReportManager {

    private static ExtentReports extentReports;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    private ExtentReportManager() {}

    public static void initReports() {
        if (extentReports == null) {
            extentReports = new ExtentReports();

            String env = ConfigReader.readDefaultProperties().get("env").toString().toUpperCase();
            ExtentSparkReporter reporter =
                    new ExtentSparkReporter(env + "_ExtentReport.html");

            extentReports.attachReporter(reporter);
        }
    }

    public static void createTest(String testName) {
        ExtentTest test = extentReports.createTest(testName);
        extentTest.set(test);
    }

    public static ExtentTest getTest() {
        return extentTest.get();
    }

    public static void flushReports() {
        if (extentReports != null) {
            extentReports.flush();
        }
    }
}
