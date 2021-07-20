package salesforce.ui.pages.campaign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import salesforce.ui.pages.BasePage;

/**
 * .
 */
public class CreateCampaignPage extends BasePage {

    @FindBy(xpath = "//label/span[text()=\"Campaign Name\"]/../..//input")
    private WebElement campaignNameTextBox;

    @FindBy(xpath = "//label/span[text()=\"Active\"]/../..//input")
    private WebElement activeCheck;

    @FindBy(xpath = "")
    private WebElement typeComboBox;

    @FindBy(xpath = "")
    private WebElement statusComboBox;

    @FindBy(xpath = "//label/span[text()=\"Start Date\"]/../..//input")
    private WebElement startDateTextBox;

    @FindBy(xpath = "//label/span[text()=\"End Date\"]/../..//input")
    private WebElement endDateTextBox;

    @FindBy(xpath = "//label/span[text()=\"Expected Revenue in Campaign\"]/../..//input")
    private WebElement expectedRevenueInCampaignTextBox;

    @FindBy(xpath = "//label/span[text()=\"Budgeted Cost in Campaign\"]/../..//input")
    private WebElement budgetedCostInCampaignTextBox;

    @FindBy(xpath = "//label/span[text()=\"Actual Cost in Campaign\"]/../..//input")
    private WebElement actualCostInCampaignTextBox;

    @FindBy(xpath = "//label/span[text()=\"Expected Response (%)\"]/../..//input")
    private WebElement expectedResponseTextBox;

    @FindBy(xpath = "//label/span[text()=\"Num Sent in Campaign\"]/../..//input")
    private WebElement numSentInCampaignTextBox;

    @FindBy(xpath = "//label/span[text()=\"Parent Campaign\"]/../..//input")
    private WebElement parentCampaignTextBox;

    @FindBy(xpath = "//label/span[text()=\"Description\"]/../..//textarea")
    private WebElement descriptionTextArea;

    @FindBy(xpath = "//button[@title=\'Save\']")
    private WebElement saveButton;

    @FindBy(xpath = "//button[@title=\'Save\']")
    private WebElement saveAndNewButton;

    @FindBy(xpath = "//button[@title=\'Save\']")
    private WebElement cancelButton;

    public CreateCampaignPage() {
        super();
    }

    @Override
    protected void waitForPageLoaded() {
        //wait.until(ExpectedConditions.visibilityOf(saveButton));
        webElementAction.waitForVisibilityOfElement(saveButton);
    }

    public CreateCampaignPage setCampaignName(final String campaignName) {
        webElementAction.setTextInputField(campaignNameTextBox, campaignName);
        return this;
    }

    public void clickActive() {
        activeCheck.click();
    }

    public void clickType() {
        statusComboBox.click();
    }

    public void clickStatus() {
        statusComboBox.click();
    }

    public CreateCampaignPage setStartDate(final String startDate) {
        webElementAction.setTextInputField(startDateTextBox, startDate);
        return this;
    }

    public CreateCampaignPage setEndDate(final String endDate) {
        webElementAction.setTextInputField(endDateTextBox, endDate);
        return this;
    }

    public CreateCampaignPage setExpectedRevenueCampaign(final String expectedRevenue) {
        webElementAction.setTextInputField(expectedRevenueInCampaignTextBox, expectedRevenue);
        return this;
    }

    public CreateCampaignPage setBudgetedCost(final String budgetedCost) {
        webElementAction.setTextInputField(budgetedCostInCampaignTextBox, budgetedCost);
        return this;
    }

    public CreateCampaignPage setActualCost(final String actualCost) {
        webElementAction.setTextInputField(actualCostInCampaignTextBox, actualCost);
        return this;
    }

    public CreateCampaignPage setExpectedResponse(final String expectedResponse) {
        webElementAction.setTextInputField(expectedResponseTextBox, expectedResponse);
        return this;
    }

    public CreateCampaignPage setNumSentCampaign(final String numSentCampaign) {
        webElementAction.setTextInputField(numSentInCampaignTextBox, numSentCampaign);
        return this;
    }

    public CreateCampaignPage setDescription(final String description) {
        webElementAction.setTextInputField(descriptionTextArea, description);
        return this;
    }

    public CampaignCreatedPage clickSaveBtn() {
        saveButton.click();
        return new CampaignCreatedPage();
    }

}
