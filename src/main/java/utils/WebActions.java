package utils;

import drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebActions {
    private WebActions(){};

    private static WebDriver getDriver(){
        return DriverManager.getDriver();
    }

    public static void sedKeys(By by, String string){
        getDriver().findElement(by).sendKeys(string);
    }


    public static void click(By by){
        getDriver().findElement(by).click();
    }




}
