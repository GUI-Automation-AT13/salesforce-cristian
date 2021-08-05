package rest.salesforce.com.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.campaign.CampaignPage;
import salesforce.utils.strategy.CreatedFeature;
import salesforce.utils.strategy.FeatureNew;
import salesforce.utils.strategy.FeaturesPage;
import salesforce.utils.strategy.MapPages;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static core.config.Configuration.dotenv;

public class CampaignSteps {

    private CampaignPage campaignPage;
    private LoginPage loginPage;
    private PageTransporter pageTransporter;
    private Map<String, String> tableFeature;
    private FeaturesPage featurePage;
    private MapPages mapPages = new MapPages();
    private FeatureNew featureNew;
    private CreatedFeature createdFeature;

    public CampaignSteps(final PageTransporter pageTransporter) {
        this.pageTransporter = pageTransporter;
    }

    @Given("I login to salesforce site as an developer user")
    public void iLoginToSalesforceSiteAsAnDeveloperUser() {
        loginPage = pageTransporter.navigateToLoginPage();
        HomePage homePage = loginPage.setUserName(dotenv.get("SALESFORCE_USERNAME"))
                .setPassword(dotenv.get("PASSWORD_TOKEN")).clickLoginBtn();
    }

    @And("I navigate to Campaign page")
    public void iNavigateToCampaignPage() {
        pageTransporter.navigateToCampaignPage();
    }

    @And("I navigate to {string} page")
    public void iNavigateToPage(String arg0) {
        System.out.println("----------------------");
        System.out.println(arg0);
        campaignPage = pageTransporter.navigateTofeaturePage(arg0);
    }

    @When("^I create a new (.*) with (?:.*)$")
    public void iCreateANewWorkTypeOnlyWithRequiredFields(String nameFeature, final Map<String, String> table) {
        tableFeature = table;
        featurePage = mapPages.featuresPage(nameFeature);
        featureNew = featurePage.clickNewButton();
        featureNew.fillUpField(table);
        createdFeature = featureNew.clickSaveButton();
    }

    @Then("^I verify (?:.*) created with (?:.*)$")
    public void iVerifyWorkTypeCreatedWithRequirementFields() {
        List<String> valuesField = createdFeature.getValueField(tableFeature);
        Assert.assertEquals(valuesField, new ArrayList<String>(tableFeature.values()));
    }
}
