package com.example.springwithjpa;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class producttest {
   // @Test
    @BeforeAll
    public static void before()
    {
        baseURI="http://localhost:8085";
    }
    @Test
    public void testGetAllProducts() {
        given()
                .when()
                .get("/getproduct")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0)).log().all(); // Ensure that the response contains products
    }
    @Test
    public void testGetproductByid(){
        given()
                .when()
                .get("/6")
                .then()
                .statusCode(200)
               .body("id", equalTo(6))
                .body("name", notNullValue())  .
                body("price", notNullValue());

    }
    @Test
    public void  addproduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", "7");
        requestBody.put("name","fashionbag");
        requestBody.put("catogory", "bag");
        requestBody.put("price", "10000");
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestBody.toString()).when().post("/add").
                then().
                statusCode(200).log().all();
    }
    @Test
    public void  updateproduct(){
        JSONObject requestBody = new JSONObject();

        requestBody.put("name","plasticbootle");
        requestBody.put("catogory", "unibottle");
        requestBody.put("price", "1000");
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(requestBody.toString()).when().put("/addbyid/6").
                then().
                statusCode(200).log().all();
    }
    @Test
    public void deleteProductById() {

        given()
                .contentType(ContentType.JSON)
                .when()
                .delete("/deletebyid/4")
                .then()
                .statusCode(204)
                .log().all();
    }



}
