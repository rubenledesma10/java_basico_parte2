/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondicionales;

import java.util.Scanner;

/**
 *
 * @author RubénEzequiel
 */
public class Ejercicio1 {
    public static void main(String[] args) {
    //declaro las variables
     Scanner s = new Scanner (System.in);
     int n; 
        System.out.println("Ingrese un numero:");
        n = s.nextInt ();
        if (n % 2 == 0 ) {
            System.out.println("Par");
        } else {System.out.println("Impar");
        }
    }
}
