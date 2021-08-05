package rest.salesforce.com.steps;

import core.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import salesforce.ui.PageTransporter;

public class CampaignHooks {

    private Logger log = Logger.getLogger(getClass());
    private PageTransporter pageTransporter;

    public CampaignHooks(final PageTransporter pageTransporter) {
        log.info("GeneralHooks constructor");
        this.pageTransporter = pageTransporter;
    }

    @Before(value = "@CreateCampaign", order  = 1)
    public void setUp() {
        log.info("Set up Methods");
    }

    public void login() {

    }

    @After(value = "@CreateCampaign", order = 100)
    public void tearDown() {
        log.info("Close Driver");
        DriverManager.getInstance().getDriver().close();
    }
}
