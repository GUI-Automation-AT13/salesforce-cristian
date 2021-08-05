package salesforce.ui.pages.campaign;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;
import salesforce.utils.strategy.FeatureNew;
import salesforce.utils.supplier.VoidSupplier;

/**
 * This class is for create a new Campaign element.
 */
public class FormToCreateCampaign extends BasePage implements FeatureNew {

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

    public FormToCreateCampaign() {
        super();
    }

    private static final String INPUT_XPATH = "//label/span[text()='%s']/../..//input";

    private static final HashMap<String, String> inputFieldNames = new HashMap<>();

    static {
        inputFieldNames.put("Campaign Name", "Campaign Name");
        inputFieldNames.put("Start Date", "Start Date");
        inputFieldNames.put("End Date", "End Date");
        inputFieldNames.put("Expected Revenue in Campaign", "Expected Revenue in Campaign");
        inputFieldNames.put("Budgeted Cost in Campaign", "Budgeted Cost in Campaign");
        inputFieldNames.put("Actual Cost in Campaign", "Actual Cost in Campaign");
        inputFieldNames.put("Num Sent in Campaign", "Num Sent in Campaign");
        inputFieldNames.put("Description", "Description");
    }

    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisibilityOfElement(saveButton);
        webElementAction.waitForVisibilityOfElement(campaignNameTextBox);
        webElementAction.waitForVisibilityOfElement(startDateTextBox);
        webElementAction.waitForVisibilityOfElement(endDateTextBox);
        webElementAction.waitForVisibilityOfElement(expectedRevenueInCampaignTextBox);
        webElementAction.waitForVisibilityOfElement(budgetedCostInCampaignTextBox);
        webElementAction.waitForVisibilityOfElement(actualCostInCampaignTextBox);
        webElementAction.waitForVisibilityOfElement(numSentInCampaignTextBox);
        webElementAction.waitForVisibilityOfElement(descriptionTextArea);
    }

    /**
     * Sets the inputs fields.
     *
     * @param fieldName the name field to set.
     * @param value     the value of the field.
     * @return a this object.
     */
    public FormToCreateCampaign setInputField(final String fieldName, final String value) {
        webElementAction.setTextInputField(driver.findElement(By.xpath(
                String.format(INPUT_XPATH, inputFieldNames.get(fieldName)))), value);
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
     * Sets Expected response element.
     *
     * @param expectedResponse is a expected response of new campaign.
     * @return this class.
     */
    public FormToCreateCampaign setExpectedResponse(final String expectedResponse) {
        webElementAction.setTextInputField(expectedResponseTextBox, expectedResponse);
        return this;
    }

    /**
     * Sets description element.
     *
     * @param description is a description of new campaign.
     * @return this class.
     */
    public FormToCreateCampaign setDescription(final String description) {
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

    @Override
    public void fillUpField(Map<String, String> table) {
        HashMap<String, VoidSupplier> actionsContractMap = mapActionsCampaign(table);
        table.keySet().forEach(key -> actionsContractMap.get(key).run());
    }

    @Override
    public CampaignCreatedPage clickSaveButton() {
        webElementAction.clickButton(saveButton);
        return new CampaignCreatedPage();
    }

    /**
     * Saves actions in New work type page in map.
     *
     * @param campaignMap is map
     * @return a map with action of fields
     */
    private HashMap<String, VoidSupplier> mapActionsCampaign(final Map<String, String> campaignMap) {
        HashMap<String, VoidSupplier> mapActions = new HashMap<>();
        mapActions.put("Campaign Name", () -> setInputField(
                "Campaign Name",
                campaignMap.get("Campaign Name")));
        mapActions.put("Start Date", () -> setInputField(
                "Start Date",
                campaignMap.get("Start Date")));
        mapActions.put("End Date", () -> setInputField(
                "End Date",
                campaignMap.get("End Date")));
        mapActions.put("Expected Revenue in Campaign", () -> setInputField(
                "Expected Revenue in Campaign",
                campaignMap.get("Expected Revenue in Campaign")));
        mapActions.put("Budgeted Cost in Campaign", () -> setInputField(
                "Budgeted Cost in Campaign",
                campaignMap.get("Budgeted Cost in Campaign")));
        mapActions.put("Actual Cost in Campaign", () -> setInputField(
                "Actual Cost in Campaign",
                campaignMap.get("Actual Cost in Campaign")));
        mapActions.put("Num Sent in Campaign", () -> setInputField(
                "Num Sent in Campaign",
                campaignMap.get("Num Sent in Campaign")));
        mapActions.put("Description", () -> setInputField(
                "Description",
                campaignMap.get("Description")));
        return mapActions;
    }
}
