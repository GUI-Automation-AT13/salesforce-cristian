package accounts;

import base.BaseTest;
import org.testng.annotations.Test;
import salesforce.ui.pages.HomePage;

import static core.config.Configuration.dotenv;

public class CreateAccountsTest extends BaseTest {

    @Test
    public void testCreateAccountWithRequiredFields() {
        HomePage homePage = loginPage.setUserName(dotenv.get("USER"))
                .setPassword(dotenv.get("PASSWORD"))
                .clickLoginBtn();
    }
}
