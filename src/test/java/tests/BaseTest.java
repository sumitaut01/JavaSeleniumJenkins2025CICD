package tests;

import drivers.DriverManager;
import drivers.factory.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import reports.ExtentReportManager;
import utils.ConfigReader;

import java.lang.reflect.Method;

public class BaseTest {


    @BeforeSuite
    public void setUp() {

        ExtentReportManager.initReports();

    }


    @BeforeMethod
    public void beforeMethod(Method m) throws InterruptedException {
        DriverFactory.initDriver(ConfigReader.readDefaultProperties());
        DriverManager.getDriver().get("http://www.rediff.com");
        Thread.sleep(5000);
        ExtentReportManager.createTest(m.getName());


    }


    @AfterMethod
    public void afterMethod() {
        DriverManager.getDriver().quit();
        DriverManager.removeDriver();
    }


    @AfterSuite
    public void tearDown() {

        ExtentReportManager.flushReports();

    }
}
