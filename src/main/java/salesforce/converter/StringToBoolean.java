package salesforce.converter;


/**
 * This class converts a string to a Boolean object.
 */
public class StringToBoolean implements StringToObjectConverter {
    /**
     * Converts a String to an object of type Boolean.
     *
     * @param string with the value to convert
     * @return an object of type Boolean
     */
    @Override
    public Object convertStringToObject(final String string) {
        return Boolean.valueOf(string);
    }
}
