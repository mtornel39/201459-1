/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioaprobadosuspendido;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class EjercicioAprobadoSuspendido {

    public static void main(String[] args) {

       int calificacion; 
       Scanner sc = new Scanner(System.in);       
       System.out.println("Ingrese La calificacion a evaluar: ");
       
       calificacion = sc.nextInt();
       
        if (calificacion>10 || calificacion<=0) {
            
            System.out.println("Calificacion incorrecta");
            
        } else{
            
            if (calificacion<5) {
                
                System.out.println("SUSPENDIDO");
            } else if (calificacion <=8) {
                 System.out.println("NOTABLE");

            } else {
                
                System.out.println("SOBRESALIENTE");
            }
    
            
            
        }
        
        
        //System.out.println(calificacion);
       
        //for (int i = 0; i < 10; i++) {
          //  System.out.println(i);
   //     }
 
        

    }
}
