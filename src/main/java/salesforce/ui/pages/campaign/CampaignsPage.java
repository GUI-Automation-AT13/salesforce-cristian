package salesforce.ui.pages.campaign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

/**
 * This Class is for feature campaign.
 */
public class CampaignsPage extends BasePage {

    /**
     * defines locator for Login Button.
     */
    @FindBy(css = "a[title='New']")
    private WebElement newBtn;

    /**
     * defines the expected conditions for a element.
     */
    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(newBtn));
    }

    /**
     * Clicks on new button.
     *
     * @return a ContactsFormPage instance
     */
    public CreateCampaignPage clickNewBtn() {
        newBtn.click();
        return new CreateCampaignPage();
    }


}