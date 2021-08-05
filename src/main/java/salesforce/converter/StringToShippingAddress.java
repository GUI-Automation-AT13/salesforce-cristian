package salesforce.converter;

import com.google.gson.Gson;
import salesforce.entities.ShippingAddress;

/**
 * This class converts a string to a ShippingAddress object.
 */
public class StringToShippingAddress implements StringToObjectConverter {
    /**
     * Converts a String to an object of type ShippingAddress.
     *
     * @param string with the value to convert
     * @return an object of type ShippingAddress
     */
    @Override
    public Object convertStringToObject(final String string) {
        return new Gson().fromJson(string, ShippingAddress.class);
    }
}
