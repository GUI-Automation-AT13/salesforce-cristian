package salesforce.ui.pages;


import core.driver.DriverManager;
import core.driver.WebElementAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This abstract class is the base for all web pages.
 */
public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected WebElementAction webElementAction;
    protected DriverManager driverManager;

    /**
     * Initializes the elements and wait for page to be loaded.
     */
    public BasePage() {
        driverManager = DriverManager.getInstance();
        driver = driverManager.getDriver();
        webElementAction = new WebElementAction();
        PageFactory.initElements(driver, this);
        waitForPageLoaded();
    }

    protected abstract void waitForPageLoaded();

}
