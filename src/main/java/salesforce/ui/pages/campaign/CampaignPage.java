package salesforce.ui.pages.campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

/**
 * .
 */
public class CampaignPage extends BasePage {

    @FindBy(css = ".forceActionLink > div")
    private WebElement createCampaignBtn;

    /**
     * .
     *
     * @return .
     */
    public CreateCampaignPage clickCreateCampaignBtn() {
        createCampaignBtn.click();
        return new CreateCampaignPage();
    }

    @Override
    protected void waitForPageLoaded() {
        wait.until(ExpectedConditions.visibilityOf(createCampaignBtn));
    }

    public WebElement getCreateCampaignBtn() {
        return createCampaignBtn;
    }

    @FindBy(css = ".slds-theme--success")
    private WebElement alertSuccess;

    @FindBy(xpath = "//a[@id='detailTab__item']")
    private WebElement detailsTab;

    //    @FindBy(xpath = "//span[normalize-space()='Dr. Contact Test']")
    @FindBy(xpath = "//div[contains(@class,'entityNameTitle slds-line-height--reset')]/../..//span[@data-aura-class='uiOutputText']")
    private WebElement spanPrincipalNameText;
    @FindBy(xpath = "//lightning-formatted-name[@data-output-element-id='output-field']")
    private WebElement spanDetailNameText;


    private static final String SPAN_TEXT = "//span[normalize-space()='%s']";

    /**
     * Gets the alert text.
     *
     * @return the text value.
     */
    public String getTextAlertSuccess() {
        return alertSuccess.getText();
    }

    /**
     * .
     *
     * @return .
     */
    public String getContactNameText() {
        return spanPrincipalNameText.getText();
    }

    /**
     * Gets the entity or company name text.
     *
     * @param fieldName .
     * @return a String with the entity or company name text.
     */
    public String getNamesText(final String fieldName) {
        return webElementAction.getTextOfElement(driver.findElement(By.xpath(
                String.format(SPAN_TEXT, fieldName))));
    }

    /**
     * .
     */
    public void clickDetailTab() {
        webElementAction.clickElement(detailsTab);
    }

    /**
     * .
     *
     * @return .
     */
    public String getPrincipalName() {
        return webElementAction.getTextOfElement(spanPrincipalNameText);
    }

    /**
     * .
     *
     * @return .
     */
    public String getDetailName() {
        return webElementAction.getTextOfElement(spanDetailNameText);
    }
}
