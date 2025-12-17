package tests;

import drivers.DriverManager;
import drivers.factory.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.ConfigReader;

public class BaseTest {


    @BeforeSuite
    public void setUp() {


    }


    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        DriverFactory.initDriver(ConfigReader.readDefaultProperties());
        DriverManager.getDriver().get("http://www.rediff.com");
        Thread.sleep(5000);


    }


    @AfterMethod
    public void afterMethod() {
        DriverManager.getDriver().quit();
        DriverManager.removeDriver();
    }


    @AfterSuite
    public void tearDown() {


    }
}
