package api;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Keeps all data that are required to construct the request.
 */
public class ApiRequest {
    private String baseUri;
    private String endpoint;
    private String body;
    private String token;
    private Enum<ApiMethod> method;
    private List<Header> headers;
    private Map<String, String> queryParams;
    private Map<String, String> pathParams;

    /**
     * .
     */
    public ApiRequest() {
        headers = new ArrayList<>();
        queryParams = new HashMap<>();
        pathParams = new HashMap<>();
    }

    /**
     * Gets the base Uri.
     *
     * @return a String with the base Uri
     */
    public String getBaseUri() {
        return baseUri;
    }

    /**
     * Sets the base Uri.
     *
     * @param baseUri a String with the value to set
     */
    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    /**
     * Gets the endpoint.
     *
     * @return a String with the endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the endpoint.
     *
     * @param endpoint a String with the value to set
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Gets the body.
     *
     * @return a String with the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the body.
     *
     * @param body a String with the value to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Gets the token.
     *
     * @return a String with the token
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the token.
     *
     * @param token a String with the value to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Gets the Api method.
     *
     * @return a String with the Api method
     */
    public Enum<ApiMethod> getMethod() {
        return method;
    }

    /**
     * Sets the Api method.
     *
     * @param method a String with the value to set
     */
    public void setMethod(Enum<ApiMethod> method) {
        this.method = method;
    }

    /**
     * Adds the headers.
     *
     * @param headers a List with the headers to add
     */
    public void addHeaders(List<Header> headers) {
        this.headers = headers;
    }

    /**
     * Adds the query parameters.
     *
     * @param queryParams a Map with the query parameters to add
     */
    public void addQueryParams(Map<String, String> queryParams) {
        this.queryParams = queryParams;
    }

    /**
     * Adds the path parameters.
     *
     * @param pathParams a Map with the path parameters to add
     */
    public void addPathParams(Map<String, String> pathParams) {
        this.pathParams = pathParams;
    }

    /**
     * Removes all the values added to the path params Map.
     */
    public void clear() {
        pathParams.clear();
    }

    /**
     * Gets the headers.
     *
     * @return an Object with the headers
     */
    public Headers getHeaders() {
        return new Headers(headers);
    }

    /**
     * Gets the query parameters.
     *
     * @return a Map of Strings with the query parameters
     */
    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    /**
     * Gets the path parameters.
     *
     * @return a Map of Strings with the path parameters
     */
    public Map<String, String> getPathParams() {
        return pathParams;
    }
}
