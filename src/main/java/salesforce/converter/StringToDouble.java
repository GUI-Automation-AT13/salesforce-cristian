package salesforce.converter;


/**
 * This class converts a string to a Double object.
 */
public class StringToDouble implements StringToObjectConverter {
    /**
     * Converts a String to an object of type Double.
     *
     * @param string with the value to convert
     * @return an object of type Double
     */
    @Override
    public Object convertStringToObject(final String string) {
        return Double.valueOf(string);
    }
}
