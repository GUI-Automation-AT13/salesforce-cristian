package salesforce.campaign;

import salesforce.base.BaseTest;
import org.testng.Assert;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.campaign.CampaignCreatedPage;
import salesforce.ui.pages.campaign.CampaignPage;
import org.testng.annotations.Test;
import salesforce.ui.pages.campaign.FormToCreateCampaign;
import static core.config.Configuration.dotenv;

public class CreateCampaignTest extends BaseTest {
    private HomePage homePage;
    private FormToCreateCampaign formToCreateCampaign;
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
        FormToCreateCampaign formToCreateCampaign = campaignPage.clickCreateCampaignBtn();
        formToCreateCampaign.setInputField("campaign name", campaignName);
        formToCreateCampaign.clickActive();
        campaignCreatedPage = formToCreateCampaign.clickSaveBtn();
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
        FormToCreateCampaign formToCreateCampaign = campaignPage.clickCreateCampaignBtn();
        formToCreateCampaign.setInputField("campaign name", campaignName);
        formToCreateCampaign.clickActive();
        formToCreateCampaign.setInputField("start date", startDate);
        formToCreateCampaign.setInputField("end date", endDate);
        formToCreateCampaign.setInputField("expected revenue in campaign", expectedRevenue);
        formToCreateCampaign.setInputField("budgeted cost in campaign", budgetedCost);
        formToCreateCampaign.setInputField("actual cost in campaign", actualCost);
        formToCreateCampaign.setInputField("num sent in campaign", numSent);
        formToCreateCampaign.setDescription(description);
        campaignCreatedPage = formToCreateCampaign.clickSaveBtn();
        campaignCreatedPage.clickDetailTab();
        campaignCreatedPage.waitElementCampaignNameCreated();
        Assert.assertEquals(campaignCreatedPage.getTextAlertSuccess(), "success\nCampaign " + "\"" + campaignName + "\"" + " was created.\nClose", "Campaign was not created");
        Assert.assertEquals(campaignCreatedPage.getCreatedCampaignTitleText(), campaignName, "Campaign was not created");
        Assert.assertEquals(campaignCreatedPage.getCampaignNameCreatedText(), campaignName, "Campaign was not created");
    }
}
