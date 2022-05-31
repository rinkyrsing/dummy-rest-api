package com.restapiexample.dummy.employees;

import com.restapiexample.dummy.model.EmployeesPojo;
import com.restapiexample.dummy.model.StudentPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutEmployeeTest extends TestBase {

    @Test
    public void UpdateEmployees() {

        EmployeesPojo employeesPojo = new EmployeesPojo();
        employeesPojo.setId("21");
        employeesPojo.setEmployee_name("dhyani");
        employeesPojo.setEmployee_salary("50000");
        employeesPojo.setEmployee_age("30");
        employeesPojo.setProfile_image(" ");


        Response response = given()
                .header("Content-Type", "application/json")
                .body(employeesPojo)
                .when()
                .put("/update/21");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}