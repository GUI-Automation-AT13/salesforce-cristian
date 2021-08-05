package salesforce.entities.features;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * This class builds a Campaign json body.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Campaign implements Features {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Attributes attributes;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isDeleted;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String parentId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String startDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String endDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expectedRevenue;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String budgetedCost;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String actualCost;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expectedResponse;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String numberSent;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isActive;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String numberOfLeads;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String numberOfConvertedLeads;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String numberOfContacts;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String numberOfResponses;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String numberOfOpportunities;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String numberOfWonOpportunities;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String amountAllOpportunities;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String amountWonOpportunities;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ownerId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdById;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastModifiedDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastModifiedById;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String systemModstamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastActivityDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastViewedDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String lastReferencedDate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String campaignMemberRecordTypeId;

    /**
     * Gets the attributes.
     *
     * @return the attributes.
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes.
     *
     * @param attributes to be set.
     */
    public void setAttributes(final Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Gets the Id.
     *
     * @return the Id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id to be set.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Gets the IsDeleted.
     *
     * @return the IsDeleted.
     */
    public String isDeleted() {
        return isDeleted;
    }

    /**
     * Sets the deleted.
     *
     * @param deleted to be set.
     */
    public void setDeleted(final String deleted) {
        isDeleted = deleted;
    }

    /**
     * Gets the Name.
     *
     * @return the Name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name to be set.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Gets the ParentId.
     *
     * @return the ParentId.
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the parentId.
     *
     * @param parentId to be set.
     */
    public void setParentId(final String parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets the Type.
     *
     * @return the Type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type to be set.
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Gets the Status.
     *
     * @return the Status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status to be set.
     */
    public void setStatus(final String status) {
        this.status = status;
    }

    /**
     * Gets the StartDate.
     *
     * @return the StartDate.
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the startDate.
     *
     * @param startDate to be set.
     */
    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets the EndDate.
     *
     * @return the EndDate.
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the endDate.
     *
     * @param endDate to be set.
     */
    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }

    /**
     * Gets the ExpectedRevenue.
     *
     * @return the ExpectedRevenue.
     */
    public String getExpectedRevenue() {
        return expectedRevenue;
    }

    /**
     * Sets the expectedRevenue.
     *
     * @param expectedRevenue to be set.
     */
    public void setExpectedRevenue(final String expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    /**
     * Gets the BudgetedCost.
     *
     * @return the BudgetedCost.
     */
    public String getBudgetedCost() {
        return budgetedCost;
    }

    /**
     * Sets the budgetedCost.
     *
     * @param budgetedCost to be set.
     */
    public void setBudgetedCost(final String budgetedCost) {
        this.budgetedCost = budgetedCost;
    }

    /**
     * Gets the ActualCost.
     *
     * @return the ActualCost.
     */
    public String getActualCost() {
        return actualCost;
    }

    /**
     * Sets the actualCost.
     *
     * @param actualCost to be set.
     */
    public void setActualCost(final String actualCost) {
        this.actualCost = actualCost;
    }

    /**
     * Gets the ExpectedResponse.
     *
     * @return the ExpectedResponse.
     */
    public String getExpectedResponse() {
        return expectedResponse;
    }

    /**
     * Sets the expectedResponse.
     *
     * @param expectedResponse to be set.
     */
    public void setExpectedResponse(final String expectedResponse) {
        this.expectedResponse = expectedResponse;
    }

    /**
     * Gets the NumberSent.
     *
     * @return the NumberSent.
     */
    public String getNumberSent() {
        return numberSent;
    }

    /**
     * Sets the numberSent.
     *
     * @param numberSent to be set.
     */
    public void setNumberSent(final String numberSent) {
        this.numberSent = numberSent;
    }

    /**
     * Gets the IsActive.
     *
     * @return the IsActive.
     */
    public String isActive() {
        return isActive;
    }

    /**
     * Sets the active.
     *
     * @param active to be set.
     */
    public void setActive(final String active) {
        this.isActive = active;
    }

    /**
     * Gets the Description.
     *
     * @return the Description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description to be set.
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets the NumberOfLeads.
     *
     * @return the NumberOfLeads.
     */
    public String getNumberOfLeads() {
        return numberOfLeads;
    }

    /**
     * Sets the numberOfLeads.
     *
     * @param numberOfLeads to be set.
     */
    public void setNumberOfLeads(final String numberOfLeads) {
        this.numberOfLeads = numberOfLeads;
    }

    /**
     * Gets the NumberOfConvertedLeads.
     *
     * @return the NumberOfConvertedLeads.
     */
    public String getNumberOfConvertedLeads() {
        return numberOfConvertedLeads;
    }

    /**
     * Sets the numberOfConvertedLeads.
     *
     * @param numberOfConvertedLeads to be set.
     */
    public void setNumberOfConvertedLeads(final String numberOfConvertedLeads) {
        this.numberOfConvertedLeads = numberOfConvertedLeads;
    }

    /**
     * Gets the NumberOfContacts.
     *
     * @return the NumberOfContacts.
     */
    public String getNumberOfContacts() {
        return numberOfContacts;
    }

    /**
     * Sets the numberOfContacts.
     *
     * @param numberOfContacts to be set.
     */
    public void setNumberOfContacts(final String numberOfContacts) {
        this.numberOfContacts = numberOfContacts;
    }

    /**
     * Gets the NumberOfResponses.
     *
     * @return the NumberOfResponses.
     */
    public String getNumberOfResponses() {
        return numberOfResponses;
    }

    /**
     * Sets the numberOfResponses.
     *
     * @param numberOfResponses to be set.
     */
    public void setNumberOfResponses(final String numberOfResponses) {
        this.numberOfResponses = numberOfResponses;
    }

    /**
     * Gets the NumberOfOpportunities.
     *
     * @return the NumberOfOpportunities.
     */
    public String getNumberOfOpportunities() {
        return numberOfOpportunities;
    }

    /**
     * Sets the numberOfOpportunities.
     *
     * @param numberOfOpportunities to be set.
     */
    public void setNumberOfOpportunities(final String numberOfOpportunities) {
        this.numberOfOpportunities = numberOfOpportunities;
    }

    /**
     * Gets the NumberOfWonOpportunities.
     *
     * @return the NumberOfWonOpportunities.
     */
    public String getNumberOfWonOpportunities() {
        return numberOfWonOpportunities;
    }

    /**
     * Sets the numberOfWonOpportunities.
     *
     * @param numberOfWonOpportunities to be set.
     */
    public void setNumberOfWonOpportunities(final String numberOfWonOpportunities) {
        this.numberOfWonOpportunities = numberOfWonOpportunities;
    }

    /**
     * Gets the AmountAllOpportunities.
     *
     * @return the AmountAllOpportunities.
     */
    public String getAmountAllOpportunities() {
        return amountAllOpportunities;
    }

    /**
     * Sets the amountAllOpportunities.
     *
     * @param amountAllOpportunities to be set.
     */
    public void setAmountAllOpportunities(final String amountAllOpportunities) {
        this.amountAllOpportunities = amountAllOpportunities;
    }

    /**
     * Gets the AmountWonOpportunities.
     *
     * @return the AmountWonOpportunities.
     */
    public String getAmountWonOpportunities() {
        return amountWonOpportunities;
    }

    /**
     * Sets the amountWonOpportunities.
     *
     * @param amountWonOpportunities to be set.
     */
    public void setAmountWonOpportunities(final String amountWonOpportunities) {
        this.amountWonOpportunities = amountWonOpportunities;
    }

    /**
     * Gets the OwnerId.
     *
     * @return the OwnerId.
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the ownerId.
     *
     * @param ownerId to be set.
     */
    public void setOwnerId(final String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Gets the CreatedDate.
     *
     * @return the CreatedDate.
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the createdDate.
     *
     * @param createdDate to be set.
     */
    public void setCreatedDate(final String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets the CreatedById.
     *
     * @return the CreatedById.
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets the createdById.
     *
     * @param createdById to be set.
     */
    public void setCreatedById(final String createdById) {
        this.createdById = createdById;
    }

    /**
     * Gets the LastModifiedDate.
     *
     * @return the LastModifiedDate.
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the lastModifiedDate.
     *
     * @param lastModifiedDate to be set.
     */
    public void setLastModifiedDate(final String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets the LastModifiedById.
     *
     * @return the LastModifiedById.
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the lastModifiedById.
     *
     * @param lastModifiedById to be set.
     */
    public void setLastModifiedById(final String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    /**
     * Gets the SystemModstamp.
     *
     * @return the SystemModstamp.
     */
    public String getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the systemModstamp.
     *
     * @param systemModstamp to be set.
     */
    public void setSystemModstamp(final String systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    /**
     * Gets the LastActivityDate.
     *
     * @return the LastActivityDate.
     */
    public String getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the lastActivityDate.
     *
     * @param lastActivityDate to be set.
     */
    public void setLastActivityDate(final String lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     * Gets the LastViewedDate.
     *
     * @return the LastViewedDate.
     */
    public String getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets the lastViewedDate.
     *
     * @param lastViewedDate to be set.
     */
    public void setLastViewedDate(final String lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    /**
     * Gets the LastReferencedDate.
     *
     * @return the LastReferencedDate.
     */
    public String getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets the lastReferencedDate.
     *
     * @param lastReferencedDate to be set.
     */
    public void setLastReferencedDate(final String lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    /**
     * Gets the CampaignMemberRecordTypeId.
     *
     * @return the CampaignMemberRecordTypeId.
     */
    public String getCampaignMemberRecordTypeId() {
        return campaignMemberRecordTypeId;
    }

    /**
     * Sets the campaignMemberRecordTypeId.
     *
     * @param campaignMemberRecordTypeId to be set.
     */
    public void setCampaignMemberRecordTypeId(final String campaignMemberRecordTypeId) {
        this.campaignMemberRecordTypeId = campaignMemberRecordTypeId;
    }
}
