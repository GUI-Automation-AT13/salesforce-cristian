package accounts;

import base.BaseTest;
import org.testng.annotations.Test;
import salesforce.ui.pages.HomePage;

/**
 * .
 */
public class CreateAccountsTest extends BaseTest {

    @Test
    public void testCreateAccountWithRequiredFields() {
        HomePage homePage = loginPage.loginSuccessful("", "");
    }

}
