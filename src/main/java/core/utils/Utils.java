package core.utils;

import static core.config.Configuration.dotenv;

/**
 * This class Utils gives enum with user and password.
 */
public enum Utils {
    USER(dotenv.get("USER")),
    PASSWORD(dotenv.get("PASSWORD"));

    private String name;

    Utils(String name) {
        this.name =  name;
    }

    /**
     * Gets the name of the field.
     *
     * @return a String with the name of the fiel
     */
    public String toName() {
        return name;
    }

}
