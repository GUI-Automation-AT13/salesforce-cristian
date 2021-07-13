package salesforce.ui.pages;

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
     * @param driver as a final parameter.
     */
    public BasePage(final WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
        waitForPageLoaded();
    }

    protected abstract void waitForPageLoaded();

}
