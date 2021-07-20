package salesforce.ui.pages.campaign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

/**
 * .
 */
public class CampaignCreatedPage extends BasePage {

    @FindBy(css = ".slds-theme--success")
    private WebElement alertSuccess;

    @FindBy(xpath = "//span[@class='custom-truncate uiOutputText'][normalize-space()='aqzzqaaz']")
    private WebElement createdCampaingTitle;

    @FindBy(xpath = "//ul[contains(@class,\'branding-actions\')]/li/div//a[@role=\'button\']")
    private WebElement createdCampaignOptionBtn;

    public MenuPage clickCreatedCampaignOptionBtn() {
        createdCampaignOptionBtn.click();
        return new MenuPage();
    }

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccess));
    }

    public String getCreatedCampaignTitleText() {
        return createdCampaingTitle.getText();
    }

    /**
     * Gets the alert text.
     *
     * @return the text value.
     */
    public String getTextAlertSuccess() {
        return alertSuccess.getText();
    }
}
