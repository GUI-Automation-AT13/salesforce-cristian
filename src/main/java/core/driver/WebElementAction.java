package core.driver;

import static core.config.Configuration.dotenv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        wait = new WebDriverWait(driver, Integer.parseInt(dotenv.get("IMPLICIT_WAIT_TIME")));
    }

    /**
     * Clicks on a WebElement.
     *
     * @param element for click
     */
    public void clickElement(final WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    /**
     * Sets the text of an input field.
     *
     * @param webElement webElement to be set.
     * @param text       text as value that will be set.
     */
    public void setTextInputField(final WebElement webElement, final String text) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }

    /**
     * Clicks the button.
     *
     * @param webElement webElement to be clicked.
     */
    public void clickButton(final WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }

    /**
     * Waits for a web element to be visible.
     *
     * @param webElement web element to wait for.
     */
    public void waitForVisibilityOfElement(final WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    /**
     * Finds a web element.
     *
     * @param webElement web element to find.
     */
    public String getTextOfElement(final WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.getText();
    }

    /**
     * Selects a webElement isn't able to click.
     *
     * @param locator type WebElement object.
     */
    public void clickByLocator(final By locator) {
        waitForVisibilityOfLocator(locator);
        driver.findElement(locator).click();
    }

    /**
     * Returns a Web Element out of a By selector.
     *
     * @param locator represents a selector
     * @return WebElement
     */
    public WebElement getElement(final By locator) {
        return driver.findElement(locator);
    }

    /**
     * Selects a webElement isn't able to click.
     *
     * @param locator type WebElement object.
     */
    public void waitForVisibilityOfLocator(final By locator) {
        wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
    }

    /**
     * Scrolls to the end of the page.
     */
    public void dropDownTillTheEnd() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    /**
     * Gets the text of a web element.
     *
     * @param locator web element to get text.
     * @return web element's text
     */
    public String getTextOfByFieldByLocator(final By locator) {
        waitForVisibilityOfLocator(locator);
        return driver.findElement(locator).getText();
    }
}
