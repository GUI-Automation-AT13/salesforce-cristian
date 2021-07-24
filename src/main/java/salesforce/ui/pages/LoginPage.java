package salesforce.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class returns a instance of LoginPage.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement userNameTxtBox;

    @FindBy(id = "password")
    private WebElement passwordTxtBox;

    @FindBy(id = "Login")
    private WebElement loginBtn;

    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisibilityOfElement(loginBtn);
    }

    /**
     * Sets user name of credentials.
     *
     * @param userName is a parameter for login.
     * @return this Object.
     */
    public LoginPage setUserName(final String userName) {
        webElementAction.setTextInputField(userNameTxtBox, userName);
        return this;
    }

    /**
     * Sets password of credentials.
     *
     * @param password is a parameter for login.
     * @return this Object.
     */
    public LoginPage setPassword(final String password) {
        webElementAction.setTextInputField(passwordTxtBox, password);
        return this;
    }

    /**
     * Clicks the login button.
     *
     * @return A homePage.
     */
    public HomePage clickLoginBtn() {
        loginBtn.click();
        return new HomePage(driver);
    }
}
