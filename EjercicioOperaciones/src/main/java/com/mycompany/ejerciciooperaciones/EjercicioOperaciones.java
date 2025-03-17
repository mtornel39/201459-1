/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciooperaciones;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class EjercicioOperaciones {

    public static void main(String[] args) {
        
     String numero1;
     int numero2;
     int suma;
     int numero1_entero;
     double division;
     
        System.out.println("Ingresa Numero 1");
        Scanner scanner =new Scanner(System.in);    
        numero1=scanner.nextLine();
        System.out.println("Ingresa Numero 2");
        numero2=scanner.nextInt();
      
        numero1_entero= Integer.parseInt(numero1);
        
        suma=numero1_entero+numero2;
      
        division = numero1_entero/numero2;
        
        
        System.out.println("La suma de "+ numero1 + "+" + numero2 + " es igual a : " +suma);
        System.out.println("La division de "+ numero1 + "con" + numero2 + " es igual a : " +division);

     

    }
}
