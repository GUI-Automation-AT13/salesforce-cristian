package salesforce.ui.pages;

import core.Manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This abstract class is the base for all web pages.
 */
public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    /**
     * Method to Base page.
     *
     * @param manager is to manage driver.
     */
    public BasePage(final Manager manager) {
        this.driver = manager.getDriver();
        wait = manager.getWait();
        PageFactory.initElements(driver, this);
        waitForPageLoaded();
    }

    protected abstract void waitForPageLoaded();

}
