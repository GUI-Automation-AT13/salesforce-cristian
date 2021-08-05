package rest.salesforce.com.steps;

import core.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.HomePage;
import salesforce.ui.pages.LoginPage;

import static core.config.Configuration.dotenv;

public class CampaignHooks {

    private Logger log = Logger.getLogger(getClass());
    private PageTransporter pageTransporter;
    private LoginPage loginPage;

    public CampaignHooks(final PageTransporter pageTransporter) {
        log.info("GeneralHooks constructor");
        this.pageTransporter = pageTransporter;
    }

    @Before(value = "@CreateCampaign", order  = 1)
    public void setUp() {
        log.info("Set up Methods");
        loginPage = pageTransporter.navigateToLoginPage();
        HomePage homePage = loginPage.setUserName(dotenv.get("SALESFORCE_USERNAME"))
                .setPassword(dotenv.get("PASSWORD_TOKEN")).clickLoginBtn();
    }

    @After(value = "@CreateCampaign", order = 100)
    public void tearDown() {
        log.info("Close Driver");
        DriverManager.getInstance().getDriver().close();
    }
}
