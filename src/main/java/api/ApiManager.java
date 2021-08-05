package api;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Manages the creation of RequestSpecification and execution of an ApiRequest salesforce.entities.
 */
public class ApiManager {

    /**
     * Executes a ApiRequest without body.
     *
     * @param apiRequest Contains all data of request.
     * @param apiResponse after execution of request.
     */
    public static void execute(ApiRequest apiRequest, ApiResponse apiResponse) {
        Response response = buildRequest(apiRequest).request(apiRequest.getMethod().name(),
                apiRequest.getEndpoint());
        apiResponse.setResponse(response);
    }

    /**
     * Executes a ApiRequest without body without log.
     *
     * @param apiRequest Contains all data of request.
     * @param apiResponse after execution of request.
     */
    public static void executeWithoutLog(ApiRequest apiRequest, ApiResponse apiResponse) {
        Response response = buildRequestWithoutLog(apiRequest)
                .request(apiRequest.getMethod().name(), apiRequest.getEndpoint());
        apiResponse.setResponse(response);
    }

    /**
     * Builds a RequestSpecification.
     *
     * @param apiRequest Contains all data of request.
     * @return RequestSpecification.
     */
    private static RequestSpecification buildRequest(final ApiRequest apiRequest) {
        return given()
                .headers(apiRequest.getHeaders())
                .queryParams(apiRequest.getQueryParams())
                .pathParams(apiRequest.getPathParams())
                .baseUri(apiRequest.getBaseUri())
                .contentType(ContentType.JSON)
                .log()
                .all();
    }

    /**
     * Builds a RequestSpecification without log.
     *
     * @param apiRequest Contains all data of request.
     * @return RequestSpecification without log.
     */
    private static RequestSpecification buildRequestWithoutLog(final ApiRequest apiRequest) {
        return given()
                .headers(apiRequest.getHeaders())
                .queryParams(apiRequest.getQueryParams())
                .pathParams(apiRequest.getPathParams())
                .baseUri(apiRequest.getBaseUri())
                .contentType(ContentType.JSON);
    }

    /**
     * Executes a ApiRequest with body.
     *
     * @param apiRequest Contains all data of request.
     */
    public static void executeWithBody(ApiRequest apiRequest, ApiResponse apiResponse) {
        Response response = buildRequest(apiRequest)
                .body(apiRequest.getBody())
                .request(apiRequest.getMethod().name(), apiRequest.getEndpoint());
        apiResponse.setResponse(response);
    }
}

