package salesforce.ui.pages.campaign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;
import salesforce.utils.strategy.FeaturesPage;

/**
 * This class is of Campaign Page.
 */
public class CampaignPage extends BasePage  implements FeaturesPage {

    @FindBy(xpath = "//a[@class='forceActionLink'][@role='button']")
    private WebElement createCampaignBtn;

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(createCampaignBtn));
    }

    /**
     * Returns a Campaing page form to create.
     *
     * @return a object CreateCampaignPage.
     */
    public FormToCreateCampaign clickCreateCampaignBtn() {
        createCampaignBtn.click();
        return new FormToCreateCampaign();
    }

    @Override
    public FormToCreateCampaign clickNewButton() {
        webElementAction.clickButton(createCampaignBtn);
        return new FormToCreateCampaign();
    }
}
