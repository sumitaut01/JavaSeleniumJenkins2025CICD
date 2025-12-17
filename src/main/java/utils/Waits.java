package utils;

import enums.WaitType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

WebDriver driver;
    public Boolean WaitForInvisibility(By by, WaitType waitType) {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(waitType.getWait()));
        return wait.until(ExpectedConditions.invisibilityOf(driver.findElement(by)));
    }


}
