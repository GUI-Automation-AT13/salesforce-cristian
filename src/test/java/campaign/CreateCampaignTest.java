package campaign;


import base.BaseTest;
import org.testng.Assert;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.campaign.CampaignCreatedPage;
import salesforce.ui.pages.campaign.CampaignPage;
import salesforce.ui.pages.campaign.CampaignsPage;
import org.testng.annotations.Test;
import salesforce.ui.pages.campaign.CreateCampaignPage;

import static core.config.Configuration.dotenv;
import static org.testng.Assert.assertEquals;


public class CreateCampaignTest extends BaseTest {
    private HomePage homePage;
    //    private ContactsPage contactsPage;
//    private CampaignsPage campaignsPage;
    private CreateCampaignPage createCampaignPage;
//    private CampaignsPage campaignsPage;
//    private CampaignPage campaignPage;
//    protected AssetPage assetPage;
    protected CampaignPage campaignPage;
    protected CampaignCreatedPage campaignCreatedPage;

    @Test
    public void testCreateContactOnlyWithRequiredFields() {
//        String campaignName = "Campaign Created";
//        homePage = loginPage.setUserName(dotenv.get("USER"))
//                .setPassword(dotenv.get("PASSWORD")).clickLoginBtn();
//
//        campaignsPage = pageTransporter.navigateToCampaignPage();
//        createCampaignPage = campaignsPage.clickNewBtn();
//        createCampaignPage = createCampaignPage.setCampaignName(campaignName).clickSaveBtn();
//        assertEquals("success\nContact " + "\"" + contactLastName + "\"" + " was created.\nClose",
//                contactPage.getTextAlertSuccess());
    }

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
        Assert.assertEquals(campaignCreatedPage.getTextAlertSuccess(), "success\nCampaign " + "\"" + campaignName + "\"" + " was created.\nClose",
                "Campaign was not created");

//        assertEquals("success\nContact " + "\"" + contactLastName + "\"" + " was created.\nClose",
//                contactPage.getTextAlertSuccess());
    }

//
//    @Test
//    public void createContactWithAllFields() {
//        String salutation = "Dr.";
//        String firstName = "Contact";
//        String lastName = "Test";
//        String title = "Title";
//        String department = "Tarija";
//        String birthdate = "19/7/2021";
//        String phone = "1789654";
//        String homePhone = "1789654";
//        String mobilePhone = "1789654";
//        String otherPhone = "1789654";
//        String fax = "1789654";
//        String email = "example@gmail.com";
//        String assistantName = "AssistantName";
//        String assistantPhone = "1789654";
//        String languages = "English";
//
//        homePage = loginPage.loginSuccessful(EnvConfig.getInstance().getUserName(), EnvConfig.getInstance().getPassword());
//        contactsPage = pageTransporter.navigateToContactsPage();
//        contactsFormPage = contactsPage.clickNewBtn();
//        contactPage = contactsFormPage.selectFromDropdown("Salutation", salutation)
//                .setInputField("firstName", firstName)
//                .setInputField("lastName", lastName)
//                .setInputField("Title", title)
//                .setInputField("Department", department)
//                .setInputField("Birthdate", birthdate)
//                .selectFromDropdown("Lead Source", "Web")
//                .setInputField("Phone", phone)
//                .setInputField("HomePhone", homePhone)
//                .setInputField("MobilePhone", mobilePhone)
//                .setInputField("OtherPhone", otherPhone)
//                .setInputField("Fax", fax)
//                .setInputField("Email", email)
//                .setInputField("AssistantName", assistantName)
//                .setInputField("AssistantPhone", assistantPhone)
//                .setMailingStreet("mailing Street")
//                .setMailingPostalCode("postal code")
//                .setMailingCity("city")
//                .setMailingProvince("province")
//                .setMailingCountry("county")
//                .setOtherStreet("other street")
//                .setOtherPostalCode("other postal code")
//                .setOtherCity("other city")
//                .setOtherProvince("other Province")
//                .setOtherCountry("other country")
//                .setInputField("Languages__c", languages)
//                .selectFromDropdown("Level", "Primary")
//                .setDescription("description")
//                .clickSaveBtn();
//        assertEquals("success\nContact " + "\"" + salutation + " " + firstName + " " + lastName + "\"" + " was created.\nClose",
//                contactPage.getTextAlertSuccess());
//    }


}
