package campaign;

import base.BaseTest;
import org.testng.Assert;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.campaign.CampaignCreatedPage;
import salesforce.ui.pages.campaign.CampaignPage;
import org.testng.annotations.Test;
import salesforce.ui.pages.campaign.CreateCampaignPage;
import static core.config.Configuration.dotenv;

public class CreateCampaignTest extends BaseTest {
    private HomePage homePage;
    private CreateCampaignPage createCampaignPage;
    protected CampaignPage campaignPage;
    protected CampaignCreatedPage campaignCreatedPage;

    @Test
    public void testCreateCampaignWithNecesaryAttributes() {
        HomePage homePage = loginPage.setUserName(dotenv.get("USER"))
                .setPassword(dotenv.get("PASSWORD")).clickLoginBtn();
        campaignPage = pageTransporter.navigateToCampaignPage();
        String campaignName = "New Campaign Created";
        CreateCampaignPage createCampaignPage = campaignPage.clickCreateCampaignBtn();
        createCampaignPage.setCampaignName("New Campaign Created");
        createCampaignPage.clickActive();
        campaignCreatedPage = createCampaignPage.clickSaveBtn();
        campaignCreatedPage.clickDetailTab();
        campaignCreatedPage.waitElementCampaignNameCreated();
        Assert.assertEquals(campaignCreatedPage.getTextAlertSuccess(), "success\nCampaign " + "\"" + campaignName + "\"" + " was created.\nClose", "Campaign was not created");
        Assert.assertEquals(campaignCreatedPage.getCreatedCampaignTitleText(), campaignName, "Campaign was not created");
        Assert.assertEquals(campaignCreatedPage.getCampaignNameCreatedText(), campaignName, "Campaign was not created");
    }
}
