/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ampolletas;

/**
 *
 * @author Manuel Tornel
 */
public class Ampolletas {

    public static void main(String[] args) {

        Bombilla b1 = new Bombilla();
        Bombilla b2= new  Bombilla();
        
        System.out.println("la bombilla esta: " + b1.estado);
        b1.encender();
        System.out.println("la bombilla esta: " + b1.estado);

    }
}
