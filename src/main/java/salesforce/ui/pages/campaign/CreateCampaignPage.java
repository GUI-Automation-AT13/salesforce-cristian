package salesforce.ui.pages.campaign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;

/**
 * This class is for create a new Campaign element.
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

    @FindBy(xpath = "//button[@title='Save & New']")
    private WebElement saveAndNewButton;

    @FindBy(xpath = "//button[@title='Cancel']")
    private WebElement cancelButton;

    public CreateCampaignPage() {
        super();
    }

    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisibilityOfElement(saveButton);
    }

    /**
     * Sets campaign name element.
     *
     * @param campaignName is a element.
     * @return this class.
     */
    public CreateCampaignPage setCampaignName(final String campaignName) {
        webElementAction.setTextInputField(campaignNameTextBox, campaignName);
        return this;
    }

    /**
     * Clicks active check element.
     */
    public void clickActive() {
        activeCheck.click();
    }

    /**
     * Clicks type combobox element.
     */
    public void clickType() {
        typeComboBox.click();
    }

    /**
     * Clicks status combobox element.
     */
    public void clickStatus() {
        statusComboBox.click();
    }

    /**
     * Sets startDate element.
     *
     * @param startDate is a start date of new campaign.
     * @return this class.
     */
    public CreateCampaignPage setStartDate(final String startDate) {
        webElementAction.setTextInputField(startDateTextBox, startDate);
        return this;
    }

    /**
     * Sets endDate element.
     *
     * @param endDate is a end date of new campaign.
     * @return this class.
     */
    public CreateCampaignPage setEndDate(final String endDate) {
        webElementAction.setTextInputField(endDateTextBox, endDate);
        return this;
    }

    /**
     * Sets expected revenue element.
     *
     * @param expectedRevenue is a expected revenue of new campaign.
     * @return this class.
     */
    public CreateCampaignPage setExpectedRevenueCampaign(final String expectedRevenue) {
        webElementAction.setTextInputField(expectedRevenueInCampaignTextBox, expectedRevenue);
        return this;
    }

    /**
     * Sets budget cost element.
     *
     * @param budgetedCost is a budgeted cost of new campaign.
     * @return this class.
     */
    public CreateCampaignPage setBudgetedCost(final String budgetedCost) {
        webElementAction.setTextInputField(budgetedCostInCampaignTextBox, budgetedCost);
        return this;
    }

    /**
     * Sets actual cost element.
     *
     * @param actualCost is a actual cost of new campaign.
     * @return this class.
     */
    public CreateCampaignPage setActualCost(final String actualCost) {
        webElementAction.setTextInputField(actualCostInCampaignTextBox, actualCost);
        return this;
    }

    /**
     * Sets Expected response element.
     *
     * @param expectedResponse is a expected response of new campaign.
     * @return this class.
     */
    public CreateCampaignPage setExpectedResponse(final String expectedResponse) {
        webElementAction.setTextInputField(expectedResponseTextBox, expectedResponse);
        return this;
    }

    /**
     * Sets num sent campaign element.
     *
     * @param numSentCampaign is a num sent campaign of new campaign.
     * @return this class.
     */
    public CreateCampaignPage setNumSentCampaign(final String numSentCampaign) {
        webElementAction.setTextInputField(numSentInCampaignTextBox, numSentCampaign);
        return this;
    }

    /**
     * Sets description element.
     *
     * @param description is a description of new campaign.
     * @return this class.
     */
    public CreateCampaignPage setDescription(final String description) {
        webElementAction.setTextInputField(descriptionTextArea, description);
        return this;
    }

    /**
     * Returns a page of Campaign created.
     *
     * @return Object of new CampaignCreatedPage.
     */
    public CampaignCreatedPage clickSaveBtn() {
        saveButton.click();
        return new CampaignCreatedPage();
    }
}
