package salesforce.ui.pages.campaign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

public class MenuPage extends BasePage {

    @FindBy(xpath = "//div[@role=\'menu\']//a[./div[@title=\'Delete\']]")
    private WebElement deleteBtn;


//    public DeleteConfirmationPage clickDeleteBtn() {
//        deleteBtn.click();
//        return new DeleteConfirmationPage();
//    }

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(deleteBtn));
    }

}
