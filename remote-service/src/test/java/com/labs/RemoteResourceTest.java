package com.labs;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class RemoteResourceTest {
	
	@Test
	public void testHelloEndpoint() {
		given()
				.when().get("/hello-remote")
				.then()
				.statusCode(200)
				.body(is("Hello from remote service"));
	}
	
}