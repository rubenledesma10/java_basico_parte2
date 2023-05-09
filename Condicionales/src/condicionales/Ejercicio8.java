/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondicionales;

import java.io.IOException;

/**
 *
 * @author RubénEzequiel
 */
public class Ejercicio8 {
    public static void main(String[] args) throws IOException {
        char car1;
        char car2;
        System.out.println("Ingrese el primer caracter: ");
        car1 = (char) System.in.read();
        System.in.read();
        System.out.println("Ingrese el segundo caracter");
        car2 = (char) System.in.read();
        if (Character.isLowerCase(car1)) {
            if (Character.isLowerCase(car2)) {
                System.out.println("Las dos son letras minusuclas");
            } else {
                System.out.println("La primera es letra minuscula pero la segunda no");
            }
        } else if (Character.isLowerCase(car2)) {
            System.out.println("La segunda es una letra minuscula pero la primera no");
        } else {
            System.out.println("Ninguna es letra minuscula");
        }
    }
}
   

