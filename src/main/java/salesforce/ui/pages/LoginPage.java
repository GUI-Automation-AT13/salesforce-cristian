package salesforce.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * This class return a instance of LoginPage.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement userNameTextBox;

    @FindBy(id = "password")
    private WebElement passwordTextBox;

    @FindBy(id = "Login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
    }

    private void setUserName(final String userName) {
        userNameTextBox.sendKeys(userName);
    }

    private void setPassword(final String password) {
        passwordTextBox.sendKeys(password);
    }

    private void clickLoginButton() {
        loginButton.click();
    }

    /**
     * Executes the login action.
     *
     * @param userName .
     * @param password .
     * @return .
     */
    public HomePage loginSuccessful(final String userName, final String password) {
        setUserName(userName);
        setPassword(password);
        clickLoginButton();
        return new HomePage(driver);
    }
}
