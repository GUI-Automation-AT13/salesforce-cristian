package salesforce;

import java.util.List;

/**
 * This class creates a Salesforce response object.
 */
public class SalesforceApiResponse {
    public String id;
    public boolean success;
    public List<Object> errors;

    /**
     * Gets Salesforce API response's id.
     *
     * @return a String with the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets Salesforce API response's id.
     *
     * @param id a String with the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets if the Salesforce API response is successful.
     *
     * @return a boolean with the answer
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the Salesforce API response's is success status.
     *
     * @param success a boolean with the success status to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Gets a list of errors from the Salesforce API response.
     *
     * @return a list with the errors
     */
    public List<Object> getErrors() {
        return errors;
    }

    /**
     * Sets a list of errors to the Salesforce API response.
     *
     * @param errors a list with the errors to set
     */
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }
}

