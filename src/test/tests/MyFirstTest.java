package tests;

import config.Endpoints;
import config.TestConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class MyFirstTest extends TestConfig {


    @Test
    public void myFirstTest () {

        given()
                .filters(new RequestLoggingFilter(),
                        new ResponseLoggingFilter())
        .when()
                .get(Endpoints.GET_VIDEOGAMES + "1")
        .then()
                .assertThat()
                .statusCode(200);

    }

}
