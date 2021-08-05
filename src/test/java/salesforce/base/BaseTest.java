package salesforce.base;

import core.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import salesforce.ui.PageTransporter;
import salesforce.ui.pages.LoginPage;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DriverManager driverManager;
    protected PageTransporter pageTransporter;

    @BeforeClass
    public void init() {
//        driverManager = DriverManager.getInstance();
//        pageTransporter = new PageTransporter();
//        loginPage = pageTransporter.navigateToLoginPage();
    }

    @AfterClass
    public void tearDown() {
        DriverManager.getInstance().getDriver().quit();
    }
}
