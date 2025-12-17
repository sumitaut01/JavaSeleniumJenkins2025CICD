package utils;

import drivers.DriverManager;
import enums.WaitType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class Waits {

    private Waits() {
        // prevent instantiation
    }

    private static WebDriverWait getWait(WaitType waitType) {
        return new WebDriverWait(
                DriverManager.getDriver(),
                Duration.ofSeconds(waitType.getWait())
        );
    }

    /* ---------------- INVISIBILITY ---------------- */

    public static boolean waitForInvisibility(By by, WaitType waitType) {
        return getWait(waitType)
                .until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    /* ---------------- VISIBILITY ---------------- */

    public static WebElement waitForVisibility(By by, WaitType waitType) {
        return getWait(waitType)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /* ---------------- CLICKABLE ---------------- */

    public static WebElement waitForClickable(By by, WaitType waitType) {
        return getWait(waitType)
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    public static WebElement waitForClickable(WebElement element, WaitType waitType) {
        return getWait(waitType)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    /* ---------------- INTERACTABLE ---------------- */

//    public static WebElement waitForInteractable(By by, WaitType waitType) {
//        return getWait(waitType)
//                .until(ExpectedConditions.and(
//                        ExpectedConditions.visibilityOfElementLocated(by),
//                        ExpectedConditions.elementToBeClickable(by)
//                ));
//    }
}
