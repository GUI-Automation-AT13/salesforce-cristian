package salesforce.converter;


import com.google.gson.Gson;
import salesforce.entities.MailingAddress;

/**
 * This class converts a string to a MailingAddress object.
 */
public class StringToMailingAddress implements StringToObjectConverter {
    /**
     * Converts a String to an object of type MailingAddress.
     *
     * @param string with the value to convert
     * @return an object of type MailingAddress
     */
    @Override
    public Object convertStringToObject(final String string) {
        return new Gson().fromJson(string, MailingAddress.class);
    }
}

