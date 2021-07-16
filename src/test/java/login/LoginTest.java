package login;

import static core.config.Configuration.dotenv;

import base.BaseTest;
import org.testng.annotations.Test;
import salesforce.ui.pages.HomePage;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginInTheWebPage() {
        HomePage homePage = loginPage.setUserName(dotenv.get("USER"))
                .setPassword(dotenv.get("PASSWORD"))
                .clickLoginBtn();
    }
}