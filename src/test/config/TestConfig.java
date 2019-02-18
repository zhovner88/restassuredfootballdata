package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;

public class TestConfig {

    public static RequestSpecification videoGameRequestSpec;

    @BeforeClass
    public static void setup() {

        videoGameRequestSpec = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setPort(8080)
                .setBasePath("/app/")
                .setContentType(ContentType.JSON)
                .build();

        RestAssured.requestSpecification = videoGameRequestSpec;

    }

}
