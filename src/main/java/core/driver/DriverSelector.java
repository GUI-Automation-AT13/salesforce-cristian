package core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * .
 */
public class DriverSelector {

    /**
     * Gets a web driver initialized.
     *
     * @param webDriverType is type of web driver.
     * @return a web driver entity.
     */
    public static WebDriver select(final String webDriverType) {
        switch (webDriverType) {
            case "FIREFOX":
                return new FirefoxDriver();
            default:
                return new ChromeDriver();
        }
    }
}
