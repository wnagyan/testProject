package com.maycur.reflex;

import com.alibaba.fastjson.JSONObject;
import com.maycur.intf.annotation.RequestMapping;
import com.sun.net.httpserver.HttpsConfigurator;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.util.Map;

public class ReflexTests {

    public static void main(String[] args) {
        String param = "{\n" +
                "    \"code\": 0,\n" +
                "    \"data\": {},\n" +
                "    \"msg\": \"shhshhs\"\n" +
                "}";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:9100/invoice/test"))
                .method("POST", BodyPublishers.ofString(param))
                .headers("Content-Type", "application/json")
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(JSONObject.toJSON(response.body()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
