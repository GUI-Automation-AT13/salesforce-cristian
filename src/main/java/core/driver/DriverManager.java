package core.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Controls initializing of webDriver and webDriverWait.
 */
public class DriverManager {
    static DriverManager driverManager;
    private WebDriver driver;
    private WebDriverWait wait;
    private DriverConfig driverConfig;

    private DriverManager() {
        driverConfig = DriverConfig.getInstance();
        setDriverManagerType();
        wait = new WebDriverWait(driver, driverConfig.getExplicitWaitTime());
        driver.manage().window().maximize();
    }

    /**
     * Controls initializing of driverManager.
     *
     * @return a DriverManager entity.
     */
    public static DriverManager getInstance() {
        if (driverManager == null) {
            driverManager = new DriverManager();
        }
        return driverManager;
    }

    /**
     * Initializes the web driver.
     */
    private void setDriverManagerType() {
        DriverManagerType driverManagerType = DriverManagerType.valueOf(driverConfig.getBrowser());
        WebDriverManager.getInstance(driverManagerType).setup();
        driver = DriverSelector.select(driverConfig.getBrowser());
    }

    /**
     * Returns a driver.
     *
     * @return driver.
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Returns a wait.
     *
     * @return a wait.
     */
    public WebDriverWait getWait() {
        return wait;
    }
}
