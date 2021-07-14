package base;

import static core.config.Configuration.dotenv;

import core.Manager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.ui.pages.LoginPage;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected Manager manager;

    @BeforeClass
    public void setup() {
        manager = Manager.getInstance();
        driver = manager.getDriver();
        driver.get(dotenv.get("URL_SALESFORCE"));
        loginPage = new LoginPage(manager);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
