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
public class Ejercicio2 {
    public static void main(String[] args) {
        //declaracion de variables
        Scanner s = new Scanner(System.in);
        int n;
        //desarrollo
        System.out.println("Ingrese un numero:");
        n = s.nextInt();
        if (n % 10 == 0) {
            System.out.println("Si es multiplo de 10");
        } else {
            System.out.println("No es multiplo de 10");
        }
    }
}
