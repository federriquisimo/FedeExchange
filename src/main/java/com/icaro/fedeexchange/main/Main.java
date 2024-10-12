/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icaro.fedeexchange.main;

import com.icaro.fedeexchange.controler.Base;
import com.google.gson.JsonObject;
/**
 *
 * @author USUARIO
 */
public class Main {
    JsonObject jo = new JsonObject();
    
    public static void main(String[] args) {
    Base base = new Base();
        System.out.println(base.leerBase());        
        System.out.println(base.leerBase().get("conversion_rates").getClass());
        System.out.println((base.leerBase().getAsJsonObject("conversion_rates").get("COP").getAsDouble()) );
        System.out.println(base.leerCodigos());
        System.out.println(base.leerCodigos().getClass());
        System.out.println(base.leerCodigos().get("supported_codes").getClass());
         System.out.println(base.leerCodigos().getAsJsonArray("supported_codes").get(0).getAsJsonArray().get(1) );
        
    }
    
}
