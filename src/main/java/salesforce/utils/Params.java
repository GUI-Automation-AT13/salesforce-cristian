package salesforce.utils;

import static core.config.Configuration.dotenv;

/**
 * This class sets the params names from the dotenv file.
 */
public enum Params {
    PARAM_ACCOUNT_ID(dotenv.get("PARAM_ACCOUNT_ID")),
    PARAM_ASSET_ID(dotenv.get("PARAM_ASSET_ID")),
    PARAM_CONTACT_ID(dotenv.get("PARAM_CONTACT_ID")),
    PARAM_CONTRACT_ID(dotenv.get("PARAM_CONTRACT_ID")),
    PARAM_ORDER_ID(dotenv.get("PARAM_ORDER_ID"));

    private String name;

    Params(String name) {
        this.name =  name;
    }

    /**
     * Gets the param's name.
     *
     * @return a String with the name
     */
    public String toName() {
        return name;
    }

}

