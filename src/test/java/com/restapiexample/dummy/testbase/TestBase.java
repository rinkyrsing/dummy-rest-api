package com.restapiexample.dummy.testbase;

import com.restapiexample.dummy.utils.TestUtils;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase extends TestUtils {

    @BeforeClass
    public static void inIt() {
        //This is environment
        RestAssured.baseURI = "http://dummy.restapiexample.com";
        //RestAssured.port = 8080;
        RestAssured.basePath = "/api/v1";
    }
}
