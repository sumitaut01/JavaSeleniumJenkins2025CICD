package drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    // prevent instantiation
    private DriverManager() {}
    public static final ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
    public static WebDriver getDriver() {
        if (driver.get() == null) {
            throw new IllegalStateException("WebDriver not initialized for this thread.");
        }
      return driver.get();
    }


    public static void setDriver(WebDriver driverinstance) {
        driver.set(driverinstance);
    }

    public static void removeDriver(){
        driver.remove();
    }
}
