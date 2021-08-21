package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import services.RestController;

public class ApiSteps {

	Constants constants = new Constants();
	RestController restController = new RestController();
	Response response;
	String uri = "";

	@Given("I set listallCustomer api endpoint")
	public void i_set_listall_customer_api_endpoint() {
		uri = Constants.all_customer;
	}

	@Given("I send ListAllCustomer get API request")
	public void i_send_list_all_customer_get_api_request() {
		response = restController.getApiCall(uri);
	}

	@Then("I receive status code as {string}")
	public void i_receive_status_code_as(String status) {
		System.out.println("Status code: " + restController.getResponseCode(response));
		assertEquals(restController.getResponseCode(response), Integer.parseInt(status));
	}

	@Then("I validate the response body")
	public void i_validate_the_response_body() {
		System.out.println(restController.getBodyData(response));
		assertTrue(restController.getBodyData(response).contains("id"));
		assertTrue(restController.getBodyData(response).contains("email"));
		assertTrue(restController.getBodyData(response).contains("first_name"));
		assertTrue(restController.getBodyData(response).contains("last_name"));
	}

	@Given("I set CustomerFound1 api endpoint")
	public void i_set_customer_found1_api_endpoint() {
		uri = Constants.customer1;
	}

	@Given("I send CustomerView get API request")
	public void i_send_customer_found_get_api_request() {
		response = restController.getApiCall(uri);
	}

	@Then("I validate the response body for {string}")
	public void i_validate_the_response_body_for(String customer) {
		System.out.println(restController.getBodyData(response));
		assertTrue(restController.getBodyData(response).contains(customer));
	}
	
	@Given("I set CustomerFound2 api endpoint")
	public void i_set_customer_found2_api_endpoint() {
		uri = Constants.customer2;
	}
	
	@Given("I set CustomerFound3 api endpoint")
	public void i_set_customer_found3_api_endpoint() {
		uri = Constants.customer3;
	}
	
	@Given("I set CustomerFound4 api endpoint")
	public void i_set_customer_found4_api_endpoint() {
		uri = Constants.customer4;
	}
	
	@Given("I set CustomerFound5 api endpoint")
	public void i_set_customer_found5_api_endpoint() {
		uri = Constants.customer5;
	}
	
	@Given("I set CustomerFound6 api endpoint")
	public void i_set_customer_found6_api_endpoint() {
		uri = Constants.customer6;
	}
	
	@Given("I set UnknownCustomer api endpoint")
	public void i_set_unknown_customer_api_endpoint() {
		uri = Constants.unknown;
	}

}
