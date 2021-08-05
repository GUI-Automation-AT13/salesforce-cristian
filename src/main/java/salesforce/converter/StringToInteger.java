package salesforce.converter;

/**
 * This class converts a string to an Integer object.
 */
public class StringToInteger implements StringToObjectConverter {
    /**
     * Converts a String to an object of type Integer.
     *
     * @param string with the value to convert
     * @return an object of type Integer
     */
    @Override
    public Object convertStringToObject(final String string) {
        return Integer.valueOf(string);
    }
}

