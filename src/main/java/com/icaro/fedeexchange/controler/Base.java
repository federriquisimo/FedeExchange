/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icaro.fedeexchange.controler;
 import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
/**
 *
 * @author USUARIO
 */
public class Base {
    

  
    public JsonObject leerBase(){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/eb275c86b58ceb083ba1f316/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            
            return JsonParser.parseString(response.body().toString()).getAsJsonObject() ;
            
        } catch (Exception e) {
            throw new RuntimeException("Error en la busqueda");
        }
    }
    
     public JsonObject leerCodigos(){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/eb275c86b58ceb083ba1f316/codes");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            
            return JsonParser.parseString(response.body().toString()).getAsJsonObject() ;
            
        } catch (Exception e) {
            throw new RuntimeException("Error en la busqueda");
        }
    }
    
   
        
        
    }
    

    

