package salesforce.converter;

import com.google.gson.Gson;
import salesforce.entities.BillingAddress;

/**
 * This class converts a string to a BillingAddress object.
 */
public class StringToBillingAddress implements StringToObjectConverter {
    /**
     * Converts a String to an object of type BillingAddress.
     *
     * @param string with the value to convert
     * @return an object of type BillingAddress
     */
    @Override
    public Object convertStringToObject(final String string) {
        return new Gson().fromJson(string, BillingAddress.class);
    }
}
