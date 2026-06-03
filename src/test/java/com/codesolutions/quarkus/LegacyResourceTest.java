package com.codesolutions.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class LegacyResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/legacy")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus REST - legacy modernization base (Code Solutions example)"));
    }

}