package api;

/**
 * Gives request types.
 */
public enum ApiMethod {
    GET("GET"),
    POST("POST"),
    DELETE("DELETE"),
    PUT("PUT"),
    PATCH("PATCH");

    private String name;

    ApiMethod(String name) {
        this.name =  name;
    }

    /**
     * Gets enum's name.
     *
     * @return a String with the name
     */
    public String toName() {
        return name;
    }

}
