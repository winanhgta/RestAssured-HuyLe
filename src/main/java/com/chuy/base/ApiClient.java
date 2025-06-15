package com.chuy.base;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
public class ApiClient {
    private final RequestSpecification request;

    public ApiClient(RequestSpecification request) {
        this.request = request;
    }

    public Response get(String endpoint) {
        return given()
                .spec(request)
                .get(endpoint);
    }
}
