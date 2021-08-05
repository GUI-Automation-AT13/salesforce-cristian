package salesforce.campaign;

import salesforce.base.BaseTest;
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
        String campaignName = "New Campaign Created";
        HomePage homePage = loginPage.setUserName(dotenv.get("SALESFORCE_USERNAME"))
                .setPassword(dotenv.get("PASSWORD_TOKEN")).clickLoginBtn();

//        System.out.println("****************************");
////        System.out.println(driver.getCurrentUrl());
//        System.out.println(driverManager.getDriver().getCurrentUrl());
        campaignPage = pageTransporter.navigateToCampaignPage();
        CreateCampaignPage createCampaignPage = campaignPage.clickCreateCampaignBtn();
        createCampaignPage.setInputField("campaign name", campaignName);
        createCampaignPage.clickActive();
        campaignCreatedPage = createCampaignPage.clickSaveBtn();
        campaignCreatedPage.clickDetailTab();
        campaignCreatedPage.waitElementCampaignNameCreated();
        Assert.assertEquals(campaignCreatedPage.getTextAlertSuccess(), "success\nCampaign " + "\"" + campaignName + "\"" + " was created.\nClose", "Campaign was not created");
        Assert.assertEquals(campaignCreatedPage.getCreatedCampaignTitleText(), campaignName, "Campaign was not created");
        Assert.assertEquals(campaignCreatedPage.getCampaignNameCreatedText(), campaignName, "Campaign was not created");
    }

    @Test
    public void testCreateCampaignWithAllAttributes() {
        String campaignName = "New Campaign Created";
        String startDate = "24/07/2021";
        String endDate = "18/08/2021";
        String expectedRevenue = "200";
        String budgetedCost = "150";
        String actualCost = "180";
        String numSent = "100";
        String description = "Description added";
        HomePage homePage = loginPage.setUserName(dotenv.get("SALESFORCE_USERNAME"))
                .setPassword(dotenv.get("PASSWORD_TOKEN")).clickLoginBtn();
        campaignPage = pageTransporter.navigateToCampaignPage();
        CreateCampaignPage createCampaignPage = campaignPage.clickCreateCampaignBtn();
        createCampaignPage.setInputField("campaign name", campaignName);
        createCampaignPage.clickActive();
        createCampaignPage.setInputField("start date", startDate);
        createCampaignPage.setInputField("end date", endDate);
        createCampaignPage.setInputField("expected revenue in campaign", expectedRevenue);
        createCampaignPage.setInputField("budgeted cost in campaign", budgetedCost);
        createCampaignPage.setInputField("actual cost in campaign", actualCost);
        createCampaignPage.setInputField("num sent in campaign", numSent);
        createCampaignPage.setDescription(description);
        campaignCreatedPage = createCampaignPage.clickSaveBtn();
        campaignCreatedPage.clickDetailTab();
        campaignCreatedPage.waitElementCampaignNameCreated();
        Assert.assertEquals(campaignCreatedPage.getTextAlertSuccess(), "success\nCampaign " + "\"" + campaignName + "\"" + " was created.\nClose", "Campaign was not created");
        Assert.assertEquals(campaignCreatedPage.getCreatedCampaignTitleText(), campaignName, "Campaign was not created");
        Assert.assertEquals(campaignCreatedPage.getCampaignNameCreatedText(), campaignName, "Campaign was not created");
    }
}
