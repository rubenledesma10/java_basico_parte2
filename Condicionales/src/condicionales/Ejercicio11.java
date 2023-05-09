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
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("Ingrese el primer numero");
        n1 = s.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = s.nextInt();
        System.out.println("Ingrese el tercer numero");
        n3 = s.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es:" + n1);
            } else {
                System.out.println("El mayor es:" + n3);
            }
        } else if (n2 > n3) {
            System.out.println("El mayor es:" + n2);
        } else {
            System.out.println("El mayor es: " + n3);
        }
    }
}