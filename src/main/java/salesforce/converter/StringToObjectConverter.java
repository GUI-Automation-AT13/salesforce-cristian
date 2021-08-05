package salesforce.converter;


/**
 * This interface implements a method to convert a String to an Object.
 */
public interface StringToObjectConverter {
    /**
     * Converts a String to an Object.
     *
     * @param string to convert
     * @return an Object
     */
    Object convertStringToObject(final String string);
}
