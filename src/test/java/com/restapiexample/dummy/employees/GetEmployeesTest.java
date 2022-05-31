package com.restapiexample.dummy.employees;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetEmployeesTest extends TestBase {

    @Test
    public void getAllEmployeesInfo(){

        Response response = given()
                .when()
                    .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    @Test
    public void getSingleEmployeesId(){

        Response response = given()
                .when()
                .get("/employee/1");
        response.then().statusCode(200);
        response.prettyPrint();

    }








}
