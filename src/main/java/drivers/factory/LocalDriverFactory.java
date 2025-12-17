package drivers.factory;
import drivers.ChromeDriverProvider;
import drivers.EdgeDriverProvider;
import enums.Browser;
import org.openqa.selenium.WebDriver;

public class LocalDriverFactory {

    public static WebDriver createDriver(Browser browser) {

        switch (browser) {
            case CHROME:
                return new ChromeDriverProvider().createDriver();
            case EDGE:
                return new EdgeDriverProvider().createDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }
}
