package salesforce.converter;

import com.google.gson.Gson;
import salesforce.entities.OtherAddress;

/**
 * This class converts a string to an OtherAddress object.
 */
public class StringToOtherAddress implements StringToObjectConverter {
    /**
     * Converts a String to an object of type OtherAddress.
     *
     * @param string with the value to convert
     * @return an object of type OtherAddress
     */
    @Override
    public Object convertStringToObject(final String string) {
        return new Gson().fromJson(string, OtherAddress.class);
    }
}
