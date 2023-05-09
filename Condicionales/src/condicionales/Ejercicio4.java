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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int n = s.nextInt();
        if (n >= 1 && n <= 10000) {
            if (n % 10 == 1) {
                System.out.println("El numero " + n + " termina en 1");
            } else {
                System.out.println("El numero " + n + " no termina en 1");
            }}
            else {System.out.println("No es numero entre 1 y 10000");}
        
    }
}

