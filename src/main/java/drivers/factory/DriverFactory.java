package drivers.factory;

import drivers.DriverManager;
import enums.Browser;
import enums.Env;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class DriverFactory {

    public static void initDriver(Properties props) {

        Env env = Env.valueOf(props.getProperty("env").toUpperCase());
        Browser browser = Browser.valueOf(props.getProperty("browser").toUpperCase());

        WebDriver driver;

        switch (env) {
            case LOCAL:
                driver = LocalDriverFactory.createDriver(browser);
                break;

            case REMOTE:
                driver = RemoteDriverFactory.createDriver(browser);
                break;

            default:
                throw new RuntimeException("Invalid environment");
        }

        DriverManager.setDriver(driver);
    }
}
