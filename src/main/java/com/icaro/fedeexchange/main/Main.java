/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icaro.fedeexchange.main;

import java.util.Scanner;
import com.icaro.fedeexchange.controler.Base;
import com.google.gson.JsonObject;
import com.icaro.fedeexchange.controler.Conversion;
import com.icaro.fedeexchange.model.Casos;
import com.icaro.fedeexchange.vista.Menu;
import java.io.IOException;
import java.util.List;


/**
 *
 * @author USUARIO
 */
public class Main {
    JsonObject jo = new JsonObject();
    
    public static void main(String[] args) {
        double v =0;
        String from ;
        String to;
        int opcion = 0;
        
        Base base = new Base();
        Conversion conversion = new Conversion();
        Casos caso = new Casos();
           
        
        boolean esEntero = false;
        boolean horaSalida = false;
        
        
        // Se escoge la opcion de conversion
        
         while (horaSalida==false){
             
            // Lanza en menu            
            Menu menu = new Menu();
            menu.menu();

            while (esEntero==false){

                // Create a Scanner object
               try{

                   Scanner entrada = new Scanner(System.in);   
                   opcion = entrada.nextInt();
                   
                   if (opcion<1 || opcion>7){
                       esEntero = false;
                       System.out.println("El valor debe ser un entero entre 1 y 7");
                   } else if (opcion==7){
                       System.exit(0);
                   }else{
                           esEntero = true;
                           System.out.println("Ls opcion escogida es la : "+ opcion);
                           }
             }catch(Exception e){
                 
                 System.out.println("El valor debe ser un entero entre 1 y 7");

             }

        }
            
             from = (String) caso.casoOne(opcion).get(0);
             to = (String) caso.casoOne(opcion).get(1);

            // valida el valor a convertir
            try{
                 System.out.println("Ingresa la cantidad de "+from+" a convertir a "+to);
                 Scanner entrada = new Scanner(System.in);   
                 v = entrada.nextDouble();
                 

                  System.out.println("El valor a covertir es "+ v +" " +from);

                 }catch(Exception e){
                 System.out.println("El valor debe ser una cantidad numérica");

           }


            //convierte el valor 

            System.out.println(conversion.convertir(v, from, to));

             esEntero = false;
            

            //BRL, ARS, COP, USD
             
            // Inicia otra conversion
             System.out.println("Presiona cualquier numero +  ENTER para otra conversión");
             Scanner entrada = new Scanner(System.in);   
             Object regresa = entrada.next();
             
        
        
         }
        
    }
    
}
