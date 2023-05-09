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
public class Ejercicio6 {
    public static void main(String[] args) {
        //declaracion de variables
     Scanner num = new Scanner(System.in);
        float a;
        float b;
        float c;
        System.out.println("La formula para el problema es a/b");
        System.out.println("Ingrese el valor de a");
        a = num.nextFloat();
        System.out.println("Ingrese el valor de b");
        b = num.nextFloat();
        if (b == 0) {
            System.out.println("Imposible realizar la division");
        } else {
            c = a / b;
            System.out.println("El resultado de la division es:" + c);
        }
    }
}

