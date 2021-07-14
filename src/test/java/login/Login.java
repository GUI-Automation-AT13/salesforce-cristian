package login;

import static core.config.Configuration.dotenv;

import base.BaseTest;
import org.testng.annotations.Test;
import salesforce.ui.pages.HomePage;

public class Login extends BaseTest {

    @Test
    public void testLoginInTheWebPage() {
        HomePage homePage = loginPage.loginSuccessful(dotenv.get("USER"), dotenv.get("PASSWORD"));
        driver.get(dotenv.get("END_POINT_URL"));
    }
}