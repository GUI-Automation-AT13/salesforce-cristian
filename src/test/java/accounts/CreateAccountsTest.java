package accounts;

import static core.config.Configuration.dotenv;

import base.BaseTest;
import org.testng.annotations.Test;
import salesforce.ui.pages.HomePage;

public class CreateAccountsTest extends BaseTest {

    @Test
    public void testCreateAccountWithRequiredFields() {
        HomePage homePage = loginPage.setUserName(dotenv.get("USER"))
                .setPassword(dotenv.get("PASSWORD"))
                .clickLoginBtn();
    }
}
