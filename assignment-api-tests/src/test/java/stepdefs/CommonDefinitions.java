package stepdefs;

import endpoints.BaseEndpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonDefinitions {

    private final World world;
    private final BaseEndpoints be = new BaseEndpoints();

    public CommonDefinitions(World world) {
        this.world = world;
    }

    @Given("^the Swagger Petstore API is available$")
    public void the_swagger_petstore_api_is_available() {
        String url = be.getBaseUrl() + "swagger.json";
        be.sendRequest(null, BaseEndpoints.GET_REQUEST, url, null).then().statusCode(200);
    }

    @Then("^the requests response will contain the value '(.*?)' for the '(.*?)' field$")
    public void i_will_be_able_to_run_connected_step_definitions(String val, String key) {
        be.verifyResponseKeyValues(key, val, world.getResponse());
    }

}
