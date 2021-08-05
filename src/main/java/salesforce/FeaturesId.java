package salesforce;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * This class creates an object with the feature's ids.
 */
public class FeaturesId {
    public String accountId;
    public String assetId;
    public String contactId;
    public String contractId;
    public String orderId;
    public String campaignId;

    /**
     * Gets the account's id.
     *
     * @return a String with the id
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the account's id.
     *
     * @param accountId a String with the value to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets the asset's id.
     *
     * @return a String with the id
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the asset's id.
     *
     * @param assetId a String with the value to set
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * Gets the contact's id.
     *
     * @return a String with the id
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the contact's id.
     *
     * @param contactId a String with the value to set
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * Gets the contract's id.
     *
     * @return a String with the id
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the contract's id.
     *
     * @param contractId a String with the value to set
     */
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    /**
     * Gets the order's id.
     *
     * @return a String with the id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the order's id.
     *
     * @param orderId a String with the value to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Gets the campaign's id.
     *
     * @return a String with the id
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the campaign's id.
     *
     * @param campaignId a String with the value to set
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Sets a specified field of the request.
     *
     * @param fieldName a String with the field's name
     * @param fieldValue a String with the field's value
     * @throws InvocationTargetException when target not found
     * @throws IllegalAccessException when illegal access found
     * @throws NoSuchMethodException when method not found
     */
    public void setField(final String fieldName, final String fieldValue)
            throws InvocationTargetException, IllegalAccessException,
            NoSuchMethodException {
        Field[] attributes = this.getClass().getDeclaredFields();
        for (Field attribute : attributes) {
            if (attribute.getName().equals(fieldName)) {
                PropertyUtils.setSimpleProperty(this, attribute.getName(), fieldValue);
            }
        }
    }

    /**
     * Gets a specified field of the request.
     *
     * @param fieldName a String with the field's name
     * @throws InvocationTargetException when target not found
     * @throws IllegalAccessException when illegal access found
     * @throws NoSuchMethodException when method not found
     */
    public String getField(final String fieldName)
            throws InvocationTargetException, IllegalAccessException,
            NoSuchMethodException {
        Field[] attributes = this.getClass().getDeclaredFields();
        for (Field attribute : attributes) {
            if (attribute.getName().equals(fieldName)) {
                return PropertyUtils.getSimpleProperty(this, fieldName).toString();
            }
        }
        return null;
    }

    /**
     * Changes a name to match field's name.
     *
     * @param name a String with the name of the endpoint or the param
     * @return a String with the field's name
     */
    public String nameConverter(final String name) {
        String newName = name;
        char firstChar = newName.charAt(0);
        char myChar = "/".charAt(0);
        if (firstChar == myChar) {
            newName = newName.substring(1) + "Id";
        }
        char[] chars = newName.toCharArray();
        chars[0] = Character.toLowerCase(chars[0]);
        newName = new String(chars);
        return newName;
    }

    /**
     * Creates a map with all the request's fields.
     *
     * @return a Map with the fields
     * @throws InvocationTargetException when target not found
     * @throws IllegalAccessException when illegal access found
     * @throws NoSuchMethodException when method not found
     */
    public Map createMapFields()
            throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Map mapFields = new HashMap();
        Field[] attributes = this.getClass().getDeclaredFields();
        for (Field attribute : attributes) {
            if (PropertyUtils.getSimpleProperty(this, attribute.getName()) != null) {
                mapFields.put(attribute.getName(), PropertyUtils
                        .getSimpleProperty(this, attribute.getName()).toString());
            }
        }
        return mapFields;
    }
}

