package salesforce.ui.pages;

import org.openqa.selenium.WebDriver;

/**
 * This class return a instance of HomePage.
 */
public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected void waitForPageLoaded() {

    }
}
