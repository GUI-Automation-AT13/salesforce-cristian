package api;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import io.restassured.response.Response;

/**
 * Wrappers a Response entity.
 */
public class ApiResponse {

    private Response response;

    public ApiResponse(Response response) {
        this.response = response;
    }

    public ApiResponse() {
    }

    /**
     * Gets the response.
     *
     * @return an object with the response
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the response.
     *
     * @param response an object to set the response
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * Gets the status of the code.
     *
     * @return an int with the status code
     */
    public int getStatusCode() {
        return response.getStatusCode();
    }

    /**
     * Gets a body.
     *
     * @param cls is type of entity.
     * @param <T> is type of entity.
     * @return Body response as class.
     */
    public <T> T getBody(Class<T> cls) {
        return response.getBody().as(cls);
    }

    /**
     * Validates the schema of feature.
     *
     * @param schema schema of the feature.
     */
    public void validateBodySchema(String schema) {
        response.then().log().body().assertThat().body(matchesJsonSchemaInClasspath(schema));
    }

    /**
     * Gets the json's path.
     *
     * @param path a String with the url path
     * @return a String with the json's path
     */
    public String getPath(String path) {
        return response.getBody().jsonPath().getJsonObject(path);
    }
}
