package ru.yandex.market;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class API_Rest {

    @Test
    public void testGet(){
        Response response1 =
                given()
                        .when()
                        .get("https://market.yandex.ru/")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
                response1.print();
    }
}
