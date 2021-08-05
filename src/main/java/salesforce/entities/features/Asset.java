package salesforce.entities.features;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import salesforce.entities.Attribute;

/**
 * This class is for Asset entity.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Asset implements Features {
    public Attribute attributes;
    @JsonProperty("Id")
    public String id;
    @JsonProperty("ContactId")
    public String contactId;
    @JsonProperty("AccountId")
    public String accountId;
    @JsonProperty("ParentId")
    public Object parentId;
    @JsonProperty("RootAssetId")
    public String rootAssetId;
    @JsonProperty("Product2Id")
    public String product2Id;
    @JsonProperty("ProductCode")
    public Object productCode;
    @JsonProperty("IsCompetitorProduct")
    public Boolean isCompetitorProduct;
    @JsonProperty("CreatedDate")
    public Date createdDate;
    @JsonProperty("CreatedById")
    public String createdById;
    @JsonProperty("LastModifiedDate")
    public Date lastModifiedDate;
    @JsonProperty("LastModifiedById")
    public String lastModifiedById;
    @JsonProperty("SystemModstamp")
    public Date systemModStamp;
    @JsonProperty("IsDeleted")
    public Boolean isDeleted;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("SerialNumber")
    public String serialNumber;
    @JsonProperty("InstallDate")
    public String installDate;
    @JsonProperty("PurchaseDate")
    public String purchaseDate;
    @JsonProperty("UsageEndDate")
    public String usageEndDate;
    @JsonProperty("LifecycleStartDate")
    public Object lifecycleStartDate;
    @JsonProperty("LifecycleEndDate")
    public Object lifecycleEndDate;
    @JsonProperty("Status")
    public String status;
    @JsonProperty("Price")
    public Double price;
    @JsonProperty("Quantity")
    public Double quantity;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("OwnerId")
    public String ownerId;
    @JsonProperty("AssetProvidedById")
    public Object assetProvidedById;
    @JsonProperty("AssetServicedById")
    public Object assetServicedById;
    @JsonProperty("IsInternal")
    public Boolean isInternal;
    @JsonProperty("AssetLevel")
    public Integer assetLevel;
    @JsonProperty("StockKeepingUnit")
    public Object stockKeepingUnit;
    @JsonProperty("HasLifecycleManagement")
    public Boolean hasLifecycleManagement;
    @JsonProperty("CurrentMrr")
    public Object currentMrr;
    @JsonProperty("CurrentLifecycleEndDate")
    public Object currentLifecycleEndDate;
    @JsonProperty("CurrentQuantity")
    public Object currentQuantity;
    @JsonProperty("CurrentAmount")
    public Object currentAmount;
    @JsonProperty("TotalLifecycleAmount")
    public Object totalLifecycleAmount;
    @JsonProperty("LastViewedDate")
    public Date lastViewedDate;
    @JsonProperty("LastReferencedDate")
    public Date lastReferencedDate;

    /**
     * Gets attributes of Asset.
     *
     * @return attributes of Asset.
     */
    public Attribute getAttributes() {
        return attributes;
    }

    /**
     * Sets attributes of Asset.
     *
     * @param attributes of Asset.
     */
    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    /**
     * Gets id of Asset.
     *
     * @return id of Asset.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id of Asset.
     *
     * @param id of Asset.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets contactId of Asset.
     *
     * @return contactId of Asset.
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets contactId of Asset.
     *
     * @param contactId of Asset.
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * Gets accountId of Asset.
     *
     * @return accountId of Asset.
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets accountId of Asset.
     *
     * @param accountId of Asset.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets parentId of Asset.
     *
     * @return parentId of Asset.
     */
    public Object getParentId() {
        return parentId;
    }

    /**
     * Sets parentId of Asset.
     *
     * @param parentId of Asset.
     */
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets rootAssetId of Asset.
     *
     * @return rootAssetId of Asset.
     */
    public String getRootAssetId() {
        return rootAssetId;
    }

    /**
     * Sets rootAssetId of Asset.
     *
     * @param rootAssetId of Asset.
     */
    public void setRootAssetId(String rootAssetId) {
        this.rootAssetId = rootAssetId;
    }

    /**
     * Gets product2Id of Asset.
     *
     * @return product2Id of Asset.
     */
    public String getProduct2Id() {
        return product2Id;
    }

    /**
     * Sets product2Id of Asset.
     *
     * @param product2Id of Asset.
     */
    public void setProduct2Id(String product2Id) {
        this.product2Id = product2Id;
    }

    /**
     * Gets productCode of Asset.
     *
     * @return productCode of Asset.
     */
    public Object getProductCode() {
        return productCode;
    }

    /**
     * Sets productCode of Asset.
     *
     * @param productCode of Asset.
     */
    public void setProductCode(Object productCode) {
        this.productCode = productCode;
    }

    /**
     * Gets isCompetitorProduct of Asset.
     *
     * @return isCompetitorProduct of Asset.
     */
    public Boolean getIsCompetitorProduct() {
        return isCompetitorProduct;
    }

    /**
     * Sets isCompetitorProduct of Asset.
     *
     * @param isCompetitorProduct of Asset.
     */
    public void setIsCompetitorProduct(Boolean isCompetitorProduct) {
        this.isCompetitorProduct = isCompetitorProduct;
    }

    /**
     * Gets createdDate of Asset.
     *
     * @return createdDate of Asset.
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets createdDate of Asset.
     *
     * @param createdDate of Asset.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Gets createdById of Asset.
     *
     * @return createdById of Asset.
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets createdById of Asset.
     *
     * @param createdById of Asset.
     */
    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    /**
     * Gets lastModifiedDate of Asset.
     *
     * @return lastModifiedDate of Asset.
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets lastModifiedDate of Asset.
     *
     * @param lastModifiedDate of Asset.
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Gets lastModifiedById of Asset.
     *
     * @return lastModifiedById of Asset.
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets lastModifiedById of Asset.
     *
     * @param lastModifiedById of Asset.
     */
    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    /**
     * Gets systemModStamp of Asset.
     *
     * @return systemModStamp of Asset.
     */
    public Date getSystemModStamp() {
        return systemModStamp;
    }

    /**
     * Sets systemModStamp of Asset.
     *
     * @param systemModStamp of Asset.
     */
    public void setSystemModStamp(Date systemModStamp) {
        this.systemModStamp = systemModStamp;
    }

    /**
     * Gets isDeleted of Asset.
     *
     * @return isDeleted of Asset.
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets isDeleted of Asset.
     *
     * @param isDeleted of Asset.
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * Gets name of Asset.
     *
     * @return name of Asset.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of Asset.
     *
     * @param name of Asset.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets serialNumber of Asset.
     *
     * @return serialNumber of Asset.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets serialNumber of Asset.
     *
     * @param serialNumber of Asset.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets installDate of Asset.
     *
     * @return installDate of Asset.
     */
    public String getInstallDate() {
        return installDate;
    }

    /**
     * Sets installDate of Asset.
     *
     * @param installDate of Asset.
     */
    public void setInstallDate(String installDate) {
        this.installDate = installDate;
    }

    /**
     * Gets purchaseDate of Asset.
     *
     * @return purchaseDate of Asset.
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets purchaseDate of Asset.
     *
     * @param purchaseDate of Asset.
     */
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * Gets usageEndDate of Asset.
     *
     * @return usageEndDate of Asset.
     */
    public String getUsageEndDate() {
        return usageEndDate;
    }

    /**
     * Sets usageEndDate of Asset.
     *
     * @param usageEndDate of Asset.
     */
    public void setUsageEndDate(String usageEndDate) {
        this.usageEndDate = usageEndDate;
    }

    /**
     * Gets lifecycleStartDate of Asset.
     *
     * @return lifecycleStartDate of Asset.
     */
    public Object getLifecycleStartDate() {
        return lifecycleStartDate;
    }

    /**
     * Sets lifecycleStartDate of Asset.
     *
     * @param lifecycleStartDate of Asset.
     */
    public void setLifecycleStartDate(Object lifecycleStartDate) {
        this.lifecycleStartDate = lifecycleStartDate;
    }

    /**
     * Gets lifecycleEndDate of Asset.
     *
     * @return lifecycleEndDate of Asset.
     */
    public Object getLifecycleEndDate() {
        return lifecycleEndDate;
    }

    /**
     * Sets lifecycleEndDate of Asset.
     *
     * @param lifecycleEndDate of Asset.
     */
    public void setLifecycleEndDate(Object lifecycleEndDate) {
        this.lifecycleEndDate = lifecycleEndDate;
    }

    /**
     * Gets status of Asset.
     *
     * @return status of Asset.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status of Asset.
     *
     * @param status of Asset.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets price of Asset.
     *
     * @return price of Asset.
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets price of Asset.
     *
     * @param price of Asset.
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Gets quantity of Asset.
     *
     * @return quantity of Asset.
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity of Asset.
     *
     * @param quantity of Asset.
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets description of Asset.
     *
     * @return description of Asset.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description of Asset.
     *
     * @param description of Asset.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets ownerId of Asset.
     *
     * @return ownerId of Asset.
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets ownerId of Asset.
     *
     * @param ownerId of Asset.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Gets assetProvidedById of Asset.
     *
     * @return assetProvidedById of Asset.
     */
    public Object getAssetProvidedById() {
        return assetProvidedById;
    }

    /**
     * Sets assetProvidedById of Asset.
     *
     * @param assetProvidedById of Asset.
     */
    public void setAssetProvidedById(Object assetProvidedById) {
        this.assetProvidedById = assetProvidedById;
    }

    /**
     * Gets assetServicedById of Asset.
     *
     * @return assetServicedById of Asset.
     */
    public Object getAssetServicedById() {
        return assetServicedById;
    }

    /**
     * Sets assetServicedById of Asset.
     *
     * @param assetServicedById of Asset.
     */
    public void setAssetServicedById(Object assetServicedById) {
        this.assetServicedById = assetServicedById;
    }

    /**
     * Gets isInternal of Asset.
     *
     * @return isInternal of Asset.
     */
    public Boolean getIsInternal() {
        return isInternal;
    }

    /**
     * Sets isInternal of Asset.
     *
     * @param isInternal of Asset.
     */
    public void setIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
    }

    /**
     * Gets assetLevel of Asset.
     *
     * @return assetLevel of Asset.
     */
    public Integer getAssetLevel() {
        return assetLevel;
    }

    /**
     * Sets assetLevel of Asset.
     *
     * @param assetLevel of Asset.
     */
    public void setAssetLevel(Integer assetLevel) {
        this.assetLevel = assetLevel;
    }

    /**
     * Gets stockKeepingUnit of Asset.
     *
     * @return stockKeepingUnit of Asset.
     */
    public Object getStockKeepingUnit() {
        return stockKeepingUnit;
    }

    /**
     * Sets stockKeepingUnit of Asset.
     *
     * @param stockKeepingUnit of Asset.
     */
    public void setStockKeepingUnit(Object stockKeepingUnit) {
        this.stockKeepingUnit = stockKeepingUnit;
    }

    /**
     * Gets hasLifecycleManagement of Asset.
     *
     * @return hasLifecycleManagement of Asset.
     */
    public Boolean getHasLifecycleManagement() {
        return hasLifecycleManagement;
    }

    /**
     * Sets hasLifecycleManagement of Asset.
     *
     * @param hasLifecycleManagement of Asset.
     */
    public void setHasLifecycleManagement(Boolean hasLifecycleManagement) {
        this.hasLifecycleManagement = hasLifecycleManagement;
    }

    /**
     * Gets currentMrr of Asset.
     *
     * @return currentMrr of Asset.
     */
    public Object getCurrentMrr() {
        return currentMrr;
    }

    /**
     * Sets currentMrr of Asset.
     *
     * @param currentMrr of Asset.
     */
    public void setCurrentMrr(Object currentMrr) {
        this.currentMrr = currentMrr;
    }

    /**
     * Gets currentLifecycleEndDate of Asset.
     *
     * @return currentLifecycleEndDate of Asset.
     */
    public Object getCurrentLifecycleEndDate() {
        return currentLifecycleEndDate;
    }

    /**
     * Sets currentLifecycleEndDate of Asset.
     *
     * @param currentLifecycleEndDate of Asset.
     */
    public void setCurrentLifecycleEndDate(Object currentLifecycleEndDate) {
        this.currentLifecycleEndDate = currentLifecycleEndDate;
    }

    /**
     * Gets currentQuantity of Asset.
     *
     * @return currentQuantity of Asset.
     */
    public Object getCurrentQuantity() {
        return currentQuantity;
    }

    /**
     * Sets currentQuantity of Asset.
     *
     * @param currentQuantity of Asset.
     */
    public void setCurrentQuantity(Object currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    /**
     * Gets currentAmount of Asset.
     *
     * @return currentAmount of Asset.
     */
    public Object getCurrentAmount() {
        return currentAmount;
    }

    /**
     * Sets currentAmount of Asset.
     *
     * @param currentAmount of Asset.
     */
    public void setCurrentAmount(Object currentAmount) {
        this.currentAmount = currentAmount;
    }

    /**
     * Gets totalLifecycleAmount of Asset.
     *
     * @return totalLifecycleAmount of Asset.
     */
    public Object getTotalLifecycleAmount() {
        return totalLifecycleAmount;
    }

    /**
     * Sets totalLifecycleAmount of Asset.
     *
     * @param totalLifecycleAmount of Asset.
     */
    public void setTotalLifecycleAmount(Object totalLifecycleAmount) {
        this.totalLifecycleAmount = totalLifecycleAmount;
    }

    /**
     * Gets lastViewedDate of Asset.
     *
     * @return lastViewedDate of Asset.
     */
    public Date getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets lastViewedDate of Asset.
     *
     * @param lastViewedDate of Asset.
     */
    public void setLastViewedDate(Date lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    /**
     * Gets lastReferencedDate of Asset.
     *
     * @return lastReferencedDate of Asset.
     */
    public Date getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets lastReferencedDate of Asset.
     *
     * @param lastReferencedDate of Asset.
     */
    public void setLastReferencedDate(Date lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }
}

