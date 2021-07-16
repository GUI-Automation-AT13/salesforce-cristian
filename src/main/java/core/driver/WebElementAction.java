package core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class if for actions of web elements.
 */
public class WebElementAction {

    private WebDriver driver;
    private WebDriverWait wait;

    public WebElementAction() {
        driver = DriverManager.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
    }

    /**
     * Sets the text of an input field.
     *
     * @param webElement webElement to be set.
     * @param text       text as value that will be set.
     */
    public void setInputField(final WebElement webElement, final String text) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }

    /**
     * Waits fot a web element to be visible.
     *
     * @param webElement web element to wait for.
     */
    public void waitForVisibilityOfElement(final WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
