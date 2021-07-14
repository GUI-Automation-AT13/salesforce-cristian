package base;

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
        driver.get("https://login.salesforce.com/");
        loginPage = new LoginPage(manager);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
