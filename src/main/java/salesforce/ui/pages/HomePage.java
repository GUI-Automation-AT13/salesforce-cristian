package salesforce.ui.pages;

import core.utils.FeaturePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Load the home page.
 */
public class HomePage extends BasePage {
    protected WebDriver driver;
    public FeaturePage featurePage;

    @FindBy(css = ".breadcrumbDetail.uiOutputText")
    private WebElement homePageText;

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(homePageText));
    }

    /**
     * .
     *
     * @param driver .
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}
