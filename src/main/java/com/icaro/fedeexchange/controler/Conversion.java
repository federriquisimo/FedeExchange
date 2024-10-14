/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icaro.fedeexchange.controler;

/**
 *
 * @author USUARIO
 */
public class Conversion {
    ;
   
    
    public String  convertir(double value, String from, String to ){
        
     Base base = new Base();
     
     double origen = base.leerBase().getAsJsonObject("conversion_rates").get(from).getAsDouble();
     double fin = base.leerBase().getAsJsonObject("conversion_rates").get(to).getAsDouble();
     
     return String.format("El valor %.3f",value) + " ["+ from +"]"+ String.format(" ] equivale a un valor de %.3f", fin/origen*value) + " ["+ to + "]";
     
     
    
   
    
    
}
    
}
