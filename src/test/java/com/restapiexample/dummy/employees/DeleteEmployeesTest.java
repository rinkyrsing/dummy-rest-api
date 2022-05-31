package com.restapiexample.dummy.employees;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployeesTest extends TestBase {

    @Test
    public void deleteUsers() {

        Response response = given()
                .when()
                .delete("/delete/2");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}