package salesforce.converter;

import com.google.gson.Gson;
import salesforce.entities.Attribute;

/**
 * This class converts a string to an Attribute object.
 */
public class StringToAttribute implements StringToObjectConverter {
    /**
     * Converts a String to an object of type Attribute.
     *
     * @param string with the value to convert
     * @return an object of type Attribute
     */
    @Override
    public Object convertStringToObject(final String string) {
        return new Gson().fromJson(string, Attribute.class);
    }
}

