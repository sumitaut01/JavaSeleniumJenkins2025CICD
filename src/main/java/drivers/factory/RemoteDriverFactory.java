package drivers.factory;

import enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.ConfigReader;

import java.net.URL;

public class RemoteDriverFactory {

    public static WebDriver createDriver(Browser browser) {

        DesiredCapabilities caps = new DesiredCapabilities();

        switch (browser) {
            case CHROME:
                caps.setBrowserName("chrome");
                break;
            case EDGE:
                caps.setBrowserName("MicrosoftEdge");
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser");
        }

        try {
            return new RemoteWebDriver(
                    new URL(ConfigReader.readDefaultProperties().getProperty("remoteurl")),
                    caps
            );
        } catch (Exception e) {
            throw new RuntimeException("Failed to create RemoteWebDriver", e);
        }
    }
}
