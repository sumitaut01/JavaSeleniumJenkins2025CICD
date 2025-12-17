package utils;

import drivers.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShoutUtils {

    public static String getScreenshot(){
        TakesScreenshot ts=(TakesScreenshot)DriverManager.getDriver();
        return ts.getScreenshotAs(OutputType.BASE64);
    }
}
