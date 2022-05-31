package com.restapiexample.dummy.employees;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class VerificationTest extends TestBase {

    static ValidatableResponse response;

    @BeforeClass
    public static void init(){
        response= given()
                .when()
                .get("/employees")
                .then().statusCode(200);
    }

   // 1. total records are 24
    @Test
    public void test001() {

            List<String > data = response.extract().path("data.id");
           // List<String> totalRecords = response.extract().path("data.length");
           // String records =  response.extract().path(".['data']");//to get all id
            System.out.println("------------------StartingTest---------------------------");
            System.out.println("Total records of employees : " + data);
           // System.out.println("Total records of employees : " + totalRecords);
            System.out.println("------------------End of Test---------------------------");
    }
    //2. Data[23].id = 24
    @Test
    public void test002() {
        int dataId =  response.extract().path("data[23].id");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The data[23] id is : " + dataId);
        System.out.println("------------------End of Test---------------------------");
    }
    //3. Data[23].employee_name = “Doris Wilder”
    @Test
    public void test003() {
        String name =  response.extract().path("data[23].employee_name");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The data[23] employee name is : " + name);
        System.out.println("------------------End of Test---------------------------");
    }
    //4. message = “Successfully! All records has been fetched.”
    @Test
    public void test004() {
        String message =  response.extract().path("message");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The message is : " + message);
        System.out.println("------------------End of Test---------------------------");
    }
     //6. status = success
    @Test
    public void test005() {
        String status =  response.extract().path("status");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The status is : " + status);
        System.out.println("------------------End of Test---------------------------");
    }

    //6. id = 3 has employee_salary = 86000
    @Test
    public void test006() {
        int empSalary =  response.extract().path("data[2].employee_salary");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The id 3 has employee salary : " + empSalary);
        System.out.println("------------------End of Test---------------------------");
    }
    //7. id = 6 has employee_age = 61
    @Test
    public void test007() {
        int empAge =  response.extract().path("data[5].employee_age");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The id 6 has employee age : " + empAge);
        System.out.println("------------------End of Test---------------------------");
    }
    //8. id = 11 has employee_name = Jena Gaines
    @Test
    public void test008() {
        String  empName =  response.extract().path("data[10].employee_name");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The id 3 has employee name : " + empName);
        System.out.println("------------------End of Test---------------------------");
    }









    }




