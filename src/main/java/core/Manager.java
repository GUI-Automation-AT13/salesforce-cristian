package core;

import static core.config.Configuration.dotenv;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class is to manage driver.
 */
public class Manager {
    static Manager manager;
    private WebDriver driver;
    private WebDriverWait wait;

    private Manager() {
        if ("chrome".equals(dotenv.get("BROWSER_CHROME"))) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        wait = new WebDriverWait(driver, Long.parseLong(dotenv.get("EXPLICIT_WAIT_TIME")));
        driver.manage().window().maximize();
    }

    /**
     * Controls initializing of manager.
     *
     * @return an manager entity.
     */
    public static Manager getInstance() {
        if (manager == null) {
            manager = new Manager();
        }
        return manager;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }
}
