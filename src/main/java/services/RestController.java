package services;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestController {

	public Response getApiCall(String uri) {
		RestAssured.baseURI = uri;
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Accept", "application/json");
		Response response = httpRequest.request(Method.GET);
		System.out.println(uri+" Get response is: "+response.getBody().asString());
		return response;
	}
	
	public String getBodyData(Response response) {
		return response.getBody().asString();
	}
	
	public int getResponseCode(Response response) {
		return response.getStatusCode();
	}
	
}
