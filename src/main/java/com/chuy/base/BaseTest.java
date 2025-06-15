package com.chuy.base;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeClass;
import com.chuy.utils.ConfigReader;
public class BaseTest {
    protected RequestSpecification request;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("base.url");
        request = RestAssured.given()
                .header("x-api-key", ConfigReader.getProperty("api.key"));
    }
}
