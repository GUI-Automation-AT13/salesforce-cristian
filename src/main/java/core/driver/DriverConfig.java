package core.driver;

import static core.config.Configuration.dotenv;

/**
 * This class is to choose the browser.
 */
public class DriverConfig {
    static DriverConfig driverConfig;
    private String browser;
    private int implicitWaitTime;
    private int explicitWaitTime;

    private DriverConfig() {
        initialize();
    }

    /**
     * Controls initializing of driverConfig.
     *
     * @return a DriverConfig entity.
     */
    public static DriverConfig getInstance() {
        if (driverConfig == null) {
            driverConfig = new DriverConfig();
        }
        return driverConfig;
    }

    private void initialize() {
        browser = dotenv.get("FIREFOX");
        implicitWaitTime = Integer.parseInt(dotenv.get("IMPLICIT_WAIT_TIME"));
        explicitWaitTime = Integer.parseInt(dotenv.get("EXPLICIT_WAIT_TIME"));
    }

    public String getBrowser() {
        return browser;
    }

    public int getImplicitWaitTime() {
        return implicitWaitTime;
    }

    public int getExplicitWaitTime() {
        return explicitWaitTime;
    }
}
