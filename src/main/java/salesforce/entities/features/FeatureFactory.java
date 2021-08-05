package salesforce.entities.features;

/**
 * This class creates the corresponding feature.
 */
public class FeatureFactory {
    /**
     * Creates a feature given a type.
     *
     * @param featureType a String with the required feature type
     * @return the corresponding feature
     */
    public Features getFeature(String featureType) {
        if (featureType.equalsIgnoreCase(FeaturesNames.Campaign.getName())) {
            return new Campaign();
        } else if (featureType.equalsIgnoreCase(FeaturesNames.Account.getName())) {
            return new Account();
        }
        return null;
    }
}
