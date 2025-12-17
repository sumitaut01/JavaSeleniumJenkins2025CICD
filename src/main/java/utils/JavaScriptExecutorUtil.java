package utils;

import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class JavaScriptExecutorUtil {

    private JavaScriptExecutorUtil() {
        // prevent instantiation
    }

    private static JavascriptExecutor getJsExecutor() {
        return (JavascriptExecutor) DriverManager.getDriver();
    }

    public static void click(WebElement element) {
        getJsExecutor().executeScript(
                "arguments[0].click();", element);
    }

    public static void scrollIntoView(WebElement element) {
        getJsExecutor().executeScript(
                "arguments[0].scrollIntoView(true);", element);
    }
}
