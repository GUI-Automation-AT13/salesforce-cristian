package salesforce.ui;

import static core.config.Configuration.dotenv;

import core.driver.DriverManager;
import salesforce.ui.pages.LoginPage;
import salesforce.ui.pages.campaign.CampaignPage;

/**
 * Navigates to an specified url.
 */
public class PageTransporter {

    private String urlSalesforce = dotenv.get("URL_SALESFORCE");

    /**
     * Got to the specified url.
     *
     * @param url string with the url.
     */
    public void goToUrl(final String url) {
        DriverManager.getInstance().getDriver().navigate().to(url);
    }

    /**
     * Navigates to the Legal entities page.
     *
     * @return a CampaignPage.
     */
    public CampaignPage navigateToCampaignPage() {
        goToUrl(dotenv.get("END_POINT_URL_CAMPAIGN"));
        return new CampaignPage();
    }

    /**
     * Navigates to the login page.
     *
     * @return a LoginPage.
     */
    public LoginPage navigateToLoginPage() {
        goToUrl(urlSalesforce);
        return new LoginPage();
    }
}
