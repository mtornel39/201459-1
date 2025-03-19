/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioacertarnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class EjercicioAcertarNumero {

    public static void main(String[] args) {

        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // Entre 0 y 100
        
        String opcion;
        int intentos=0;
        
       // System.out.println(numeroAleatorio);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        do{    
        System.out.println("Eliga un numero entre 0 y 100");
        int numero_elegido = sc.nextInt();
        intentos ++;
        if (numeroAleatorio==numero_elegido) {
            
            System.out.println("Felicidades Acertaste, en el intento numero " + intentos);
            
        } else if (numeroAleatorio>numero_elegido) {
            
            System.out.println("El numero secreto es mayor");
        } else{
            
            System.out.println("El numero secreto es menor");
        } 
            System.out.println("Quiere seguir intentandolo S/N");
            opcion=sc1.nextLine();
        
        } while(opcion.equals("S"));
        
       
            
                    
    }
 
}


