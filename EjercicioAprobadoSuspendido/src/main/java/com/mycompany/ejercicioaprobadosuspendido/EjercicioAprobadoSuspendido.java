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
       
        if (calificacion>10) {
            
            System.out.println("Calificacion incorrecta");
            
        }
       
        //System.out.println(calificacion);
       
        
        

    }
}
