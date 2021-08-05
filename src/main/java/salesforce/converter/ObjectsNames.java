package salesforce.converter;

/**
 * This enum is to create corresponding object according to its type.
 */
public enum ObjectsNames {
    Integer("Integer", new StringToInteger()),
    Boolean("Boolean", new StringToBoolean()),
    Double("Double", new StringToDouble()),
    BillingAddress("BillingAddress", new StringToBillingAddress()),
    MailingAddress("MailingAddress", new StringToMailingAddress()),
    Attribute("Attribute", new StringToAttribute()),
    ShippingAddress("ShippingAddress", new StringToShippingAddress()),
    OtherAddress("OtherAddress", new StringToOtherAddress());

    String name;
    StringToObjectConverter stringToObjectConverter;

    ObjectsNames(final String name, final StringToObjectConverter stringToObjectConverter) {
        this.name = name;
        this.stringToObjectConverter = stringToObjectConverter;
    }

    /**
     * Gets the object StringToObjectConverter of the enum.
     *
     * @return the proper object StringToObjectConverter
     */
    public StringToObjectConverter getStringToObjectConverter() {
        return stringToObjectConverter;
    }
}

