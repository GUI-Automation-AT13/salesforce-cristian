package rest.salesforce.com.hooks;

import api.ApiRequestBuilder;
import api.ApiResponse;
import org.apache.log4j.Logger;
import salesforce.FeaturesId;
import salesforce.SalesforceApiResponse;
import salesforce.entities.features.Account;
import salesforce.entities.features.Asset;

public class Hooks {
    public Logger LOGGER = Logger.getLogger(getClass());
    private ApiRequestBuilder requestBuilder;
    private SalesforceApiResponse salesforceApiResponse;
    private ApiResponse apiResponse;
    private FeaturesId featuresID;
    private ApiResponse tokenApiResponse;
    Account accountToSend = new Account();
    Asset assetToSend = new Asset();
//    Contact contactToSend = new Contact();
//    Contract contractToSend = new Contract();
//    Order orderToSend = new Order();
    final String accountName = "New Account used for testing";
    final String assetName = "asset name from java";
    final String firstNameContact = "Juan Pablo";
    final String lastNameContact = "Gonzales";
    final String contractStatus = "Draft";
    final String contractStartDate = "2021-06-27";
    final String orderStatus = "Draft";
    final String orderEffectiveDate = "2021-07-28";
    String token;

    public Hooks(ApiRequestBuilder requestBuilder, SalesforceApiResponse salesforceApiResponse, ApiResponse apiResponse,
                 FeaturesId featuresID, ApiResponse tokenApiResponse) {
        this.requestBuilder = requestBuilder;
        this.salesforceApiResponse = salesforceApiResponse;
        this.apiResponse = apiResponse;
        this.featuresID = featuresID;
        this.tokenApiResponse = tokenApiResponse;
    }

//    @Before(order = 0)
//    public void generateToken() throws JsonProcessingException {
//        LOGGER.info("********************* TOKEN *********************");
//        ApiRequestBuilder apiRequestBuilder = new ApiRequestBuilder();
//        apiRequestBuilder
//                .addBaseUri(Setup.AUTH_URL.toName())
//                .addEndpoint(Setup.SETUP_OAUTH_TOKEN.toName())
//                .addQueryParams(Setup.GRANT_TYPE.toName(), Setup.PASSWORD.toName())
//                .addQueryParams(Setup.SETUP_CLIENT_ID.toName(), Setup.CLIENT_ID.toName())
//                .addQueryParams(Setup.SETUP_CLIENT_SECRET.toName(), Setup.CLIENT_SECRET.toName())
//                .addQueryParams(Setup.SETUP_USERNAME.toName(), Setup.SALESFORCE_USERNAME.toName())
//                .addQueryParams(Setup.SETUP_PASSWORD.toName(), Setup.PASSWORD_TOKEN.toName())
//                .addHeader(Setup.ACCEPT.toName(), Setup.APPLICATION_JSON.toName())
//                .addHeader(Setup.CONTENT_TYPE.toName(), Setup.APPLICATION_WWW_FORM.toName())
//                .addMethod(ApiMethod.POST);
//        ApiManager.executeWithoutLog(apiRequestBuilder.build(), tokenApiResponse);
//        token = tokenApiResponse.getPath(Setup.TOKEN_TYPE.toName()) + " " + tokenApiResponse.getPath(Setup.ACCESS_TOKEN.toName());
//        LOGGER.info("********************* TOKEN *********************");
//    }
//
//    @Before(order = 1)
//    public void setUp() {
//        LOGGER.info("********************* Setup *********************");
//        requestBuilder
//                .addHeader(Setup.SETUP_AUTHORIZATION.toName(),token)
//                .addBaseUri(Setup.BASE_URL.toName());
//    }
//
//    @Before(value = "@CreateAccount", order = 2)
//    public void createAnAccount() throws JsonProcessingException {
//        LOGGER.info("********************* Create Account *********************");
//        accountToSend.setName(accountName);
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_ACCOUNTS.toName())
//                .addBody(new ObjectMapper().writeValueAsString(accountToSend))
//                .addMethod(ApiMethod.POST)
//                .build();
//        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
//        salesforceApiResponse.setId(apiResponse.getBody(SalesforceApiResponse.class).getId());
//        featuresID.setAccountId(salesforceApiResponse.getId());
//    }
//
//    @After(value = "@DeleteAccount")
//    public void deleteAnAccount() {
//        LOGGER.info("********************* Delete Account *********************");
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_ACCOUNT.toName())
//                .addPathParams(Params.PARAM_ACCOUNT_ID.toName(), featuresID.getAccountId())
//                .addMethod(ApiMethod.DELETE)
//                .build();
//        ApiManager.execute(requestBuilder.build(), apiResponse);
//    }
//
//    @Before(value = "@CreateAsset", order = 3)
//    public void createAnAsset() throws JsonProcessingException {
//        LOGGER.info("********************* Create Asset *********************");
//        assetToSend.setName(assetName);
//        assetToSend.setAccountId(featuresID.getAccountId());
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_ASSETS.toName())
//                .addBody(new ObjectMapper().writeValueAsString(assetToSend))
//                .addMethod(ApiMethod.POST)
//                .build();
//        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
//        salesforceApiResponse.setId(apiResponse.getBody(SalesforceApiResponse.class).getId());
//        featuresID.setAssetId(salesforceApiResponse.getId());
//    }
//
//    @After("@DeleteAsset")
//    public void deleteAnAsset() {
//        LOGGER.info("********************* Delete Asset *********************");
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_ASSET.toName())
//                .addPathParams(Params.PARAM_ASSET_ID.toName(), featuresID.getAssetId())
//                .addMethod(ApiMethod.DELETE)
//                .build();
//        ApiManager.execute(requestBuilder.build(), apiResponse);
//    }

//    @Before("@CreateContact")
//    public void createAContact() throws JsonProcessingException {
//        LOGGER.info("********************* Create Contact *********************");
//        contactToSend.setFirstName(firstNameContact);
//        contactToSend.setLastName(lastNameContact);
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_CONTACTS.toName())
//                .addBody(new ObjectMapper().writeValueAsString(contactToSend))
//                .addMethod(ApiMethod.POST)
//                .build();
//        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
//        salesforceApiResponse.setId(apiResponse.getBody(SalesforceApiResponse.class).getId());
//        featuresID.setContactId(salesforceApiResponse.getId());
//    }

//    @After("@DeleteContact")
//    public void deleteAContact() {
//        LOGGER.info("********************* Delete Contact *********************");
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_CONTACT.toName())
//                .addPathParams(Params.PARAM_CONTACT_ID.toName(), featuresID.getContactId())
//                .addMethod(ApiMethod.DELETE)
//                .build();
//        ApiManager.execute(requestBuilder.build(), apiResponse);
//    }

//    @Before(value = "@CreateContract", order = 4)
//    public void createAContract() throws JsonProcessingException {
//        LOGGER.info("********************* Create Contract *********************");
//        contractToSend.setStatus(contractStatus);
//        contractToSend.setAccountId(featuresID.getAccountId());
//        contractToSend.setStartDate(contractStartDate);
//        contractToSend.setContractTerm(8);
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_CONTRACTS.toName())
//                .addBody(new ObjectMapper().writeValueAsString(contractToSend))
//                .addMethod(ApiMethod.POST)
//                .build();
//        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
//        salesforceApiResponse.setId(apiResponse.getBody(SalesforceApiResponse.class).getId());
//        featuresID.setContractId(salesforceApiResponse.getId());
//    }

//    @After("@DeleteContract")
//    public void deleteAContract() {
//        LOGGER.info("********************* Delete Contract *********************");
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_CONTRACT.toName())
//                .addPathParams(Params.PARAM_CONTRACT_ID.toName(), featuresID.getContractId())
//                .addMethod(ApiMethod.DELETE)
//                .build();
//        ApiManager.execute(requestBuilder.build(), apiResponse);
//    }

//    @Before(value = "@CreateOrder", order = 5)
//    public void createAnOrder() throws JsonProcessingException {
//        LOGGER.info("********************* Create Order *********************");
//        orderToSend.setStatus(orderStatus);
//        orderToSend.setAccountId(featuresID.getAccountId());
//        orderToSend.setContractId(featuresID.getContractId());
//        orderToSend.setEffectiveDate(orderEffectiveDate);
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_ORDERS.toName())
//                .addBody(new ObjectMapper().writeValueAsString(orderToSend))
//                .addMethod(ApiMethod.POST)
//                .build();
//        ApiManager.executeWithBody(requestBuilder.build(), apiResponse);
//        salesforceApiResponse.setId(apiResponse.getBody(SalesforceApiResponse.class).getId());
//        featuresID.setOrderId(salesforceApiResponse.getId());
//    }

//    @After("@DeleteOrder")
//    public void deleteAnOrder() {
//        LOGGER.info("********************* Delete Order *********************");
//        requestBuilder
//                .clearPathParams()
//                .addEndpoint(EndPoints.ENDPOINT_ORDER.toName())
//                .addPathParams(Params.PARAM_ORDER_ID.toName(), featuresID.getOrderId())
//                .addMethod(ApiMethod.DELETE)
//                .build();
//        ApiManager.execute(requestBuilder.build(), apiResponse);
//    }
}

