/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Alumnos
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        int numero1=6;
        int numero2=0;
        
        try {
    
         double division = numero1/numero2;
         System.out.println(division);

    
            
        } 
        
            catch (Exception e) {
                
                System.out.println(e.getMessage());
                System.out.println("No se puede dividir por 0");
                
                
        }
       
        
        
    }
}
