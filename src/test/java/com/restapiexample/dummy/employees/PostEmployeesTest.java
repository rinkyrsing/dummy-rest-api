package com.restapiexample.dummy.employees;

import com.restapiexample.dummy.model.StudentPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostEmployeesTest extends TestBase {

    @Test
    public void createEmployees(){

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setName("Ana");
        studentPojo.setSalary("525");
        studentPojo.setAge("33");
        studentPojo.setId("36");

        Response response = given()
                .header("Content-Type","application/json")
                .body(studentPojo)
                .when()
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();



    }
}
