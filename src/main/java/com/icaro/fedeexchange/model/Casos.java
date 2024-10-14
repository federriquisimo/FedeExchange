/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icaro.fedeexchange.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Casos {
    
    
  public List casoOne(int caso){
        String[] conversion1 = {"USD", "COP"};
        String[] conversion2 = {"COP", "USD"};
        String[] conversion3 = {"BRL", "COP"};
        String[] conversion4 = {"COP", "BRL"};
        String[] conversion5 = {"ARS", "COP"};
        String[] conversion6 = {"COP", "ARS"};
        
        // hashmaps relacionando cada conversion con una opcion
        
        HashMap<Integer,List<String>> opciones = new HashMap<>();
        
        opciones.put(1, Arrays.asList(conversion1));
        opciones.put(2, Arrays.asList(conversion2));
        opciones.put(3, Arrays.asList(conversion3));
        opciones.put(4, Arrays.asList(conversion4));
        opciones.put(5, Arrays.asList(conversion5));
        opciones.put(6, Arrays.asList(conversion6));
        
        return opciones.get(caso);
        
  }
    
}
