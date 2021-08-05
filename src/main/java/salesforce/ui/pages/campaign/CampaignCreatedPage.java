package salesforce.ui.pages.campaign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import salesforce.ui.pages.BasePage;
import salesforce.utils.strategy.CreatedFeature;
import salesforce.utils.supplier.StringSupplier;

/**
 * This class for elements of Campaign page created.
 */
public class CampaignCreatedPage extends BasePage implements CreatedFeature {

    @FindBy(css = ".slds-theme--success")
    private WebElement alertSuccess;
    @FindBy(css = "[class='slds-media__body'] span[class='custom-truncate uiOutputText']")
    private WebElement createdCampaingTitle;
    private By createdCampaignOptionBtn = By
            .xpath("//ul[contains(@class,\'branding-actions\')]/li/div//a[@role=\'button\']");
    @FindBy(xpath = "//a[@data-tab-name='detailTab']")
    private WebElement detailsTab;
    @FindBy(xpath = "//div/div/span[text()=\"Campaign Name\"]/../..//span/span")
    private WebElement campaignNameCreated;
    private By createBy = By.xpath("//span[text()='Created By']/../../div/span/span");
    private static final String BASE_XPATH = "//div[./div[./span[text()='%s']]]";
    private static final HashMap<String, String> XPATH_COMPLEMENTS = new HashMap<>();

    static {
        XPATH_COMPLEMENTS.put("Campaign Name", "//span//span");
        XPATH_COMPLEMENTS.put("Start Date", "//span//span");
        XPATH_COMPLEMENTS.put("End Date", "//span//span");
        XPATH_COMPLEMENTS.put("Expected Revenue in Campaign", "//span//span");
        XPATH_COMPLEMENTS.put("Budgeted Cost in Campaign", "//span//span");
        XPATH_COMPLEMENTS.put("Actual Cost in Campaign", "//span//span");
        XPATH_COMPLEMENTS.put("Num Sent in Campaign", "//span//span");
        XPATH_COMPLEMENTS.put("Description", "//span//span");
    }

    /**
     * Gets the text inside the element.
     *
     * @param field represents the text to be introduced
     * @return the text set on the field requested contract
     */
    public String getTextByFieldName(final String field) {
        String xpathComplement = XPATH_COMPLEMENTS.get(field);
        String xpath = String.format(BASE_XPATH, field).concat(xpathComplement);
        By xpathLocator = By.xpath(xpath);
        return webElementAction.getTextOfByFieldByLocator(xpathLocator);
    }

    @Override
    protected void waitForPageLoaded() {
        webElementAction.waitForVisibilityOfElement(alertSuccess);
        webElementAction.waitForVisibilityOfElement(createdCampaingTitle);
        webElementAction.waitForVisibilityOfElement(detailsTab);
    }

    /**
     * Returns title text of page when was created.
     *
     * @return text of element title.
     */
    public String getCreatedCampaignTitleText() {
        return webElementAction.getTextOfElement(createdCampaingTitle);
    }

    /**
     * Gets the alert text.
     *
     * @return the text value.
     */
    public String getTextAlertSuccess() {
        return webElementAction.getTextOfElement(alertSuccess);
    }

    /**
     * Clicks details menu tabs.
     */
    public void clickDetailTab() {
        webElementAction.clickElement(detailsTab);
    }

    /**
     * Returns text of elements.
     *
     * @return text of element campaign created.
     */
    public String getCampaignNameCreatedText() {
        return webElementAction.getTextOfElement(campaignNameCreated);
    }

    /**
     * Returns created by.
     *
     * @return text of elements created by.
     */
    public String getCreatedByText() {
        return webElementAction.getTextOfByFieldByLocator(createBy);
    }

    /**
     * Waits elements of details part.
     */
    public void waitElementCampaignNameCreated() {
        webElementAction.waitForVisibilityOfElement(campaignNameCreated);
    }

    @Override
    public List<String> getValueField(Map<String, String> table) {
        List<String> result = new ArrayList<>();
        HashMap<String, StringSupplier> actionsCampaignMap = getTxtFields();
        table.keySet().forEach(key -> result.add(actionsCampaignMap.get(key).getAsString()));
        return result;
    }

    /**
     * Gets text fields of workType.
     *
     * @return a map with methods of CreatedWorkType
     */
    private HashMap<String, StringSupplier> getTxtFields() {
        clickDetailTab();
        waitElementCampaignNameCreated();
        HashMap<String, StringSupplier> mapValues = new HashMap<>();
        mapValues.put("Campaign Name", () -> getTextByFieldName("Campaign Name"));
        mapValues.put("Start Date", () -> getTextByFieldName("Start Date"));
        mapValues.put("End Date", () -> getTextByFieldName("End Date"));
        mapValues.put("Expected Revenue in Campaign", () -> getTextByFieldName("Expected Revenue in Campaign"));
        mapValues.put("Budgeted Cost in Campaign", () -> getTextByFieldName("Budgeted Cost in Campaign"));
        mapValues.put("Actual Cost in Campaign", () -> getTextByFieldName("Actual Cost in Campaign"));
        mapValues.put("Num Sent in Campaign", () -> getTextByFieldName("Num Sent in Campaign"));
        mapValues.put("Description", () -> getTextByFieldName("Description"));
        return mapValues;
    }
}
