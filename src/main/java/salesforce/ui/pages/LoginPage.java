package salesforce.ui.pages;

import core.Manager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This class returns a instance of LoginPage.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement userNameTextBox;

    @FindBy(id = "password")
    private WebElement passwordTextBox;

    @FindBy(id = "Login")
    private WebElement loginButton;

    public LoginPage(Manager manager) {
        super(manager);
    }

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
    }

    private LoginPage setUserName(final String userName) {
        userNameTextBox.sendKeys(userName);
        return this;
    }

    private LoginPage setPassword(final String password) {
        passwordTextBox.sendKeys(password);
        return this;
    }

    private void clickLoginButton() {
        loginButton.click();
    }

    /**
     * Executes the login action.
     *
     * @param userName is a param of user.
     * @param password is a password of user.
     * @return intance of HomePage object.
     */
    public HomePage loginSuccessful(final String userName, final String password) {
        setUserName(userName);
        setPassword(password);
        clickLoginButton();
        Manager manager = Manager.getInstance();
        return new HomePage(manager);
    }
}
