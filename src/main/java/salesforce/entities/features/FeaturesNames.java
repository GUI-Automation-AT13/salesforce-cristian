package salesforce.entities.features;

/**
 * This enum class is to get corresponding feature's name.
 */
public enum FeaturesNames {
    Account("Account"),
    Asset("Asset"),
    Contact("Contact"),
    Contract("Contract"),
    Order("Order"),
    Campaign("Campaign");

    String name;

    FeaturesNames(String name) {
        this.name = name;
    }

    /**
     * Gets the enum's name.
     *
     * @return a String with the enum's name
     */
    public String getName() {
        return name;
    }
}

