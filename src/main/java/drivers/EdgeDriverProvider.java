package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverProvider implements DriverProvider {

    @Override
    public WebDriver createDriver() {
        return new EdgeDriver();
    }
}
