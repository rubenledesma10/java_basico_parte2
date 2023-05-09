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
public class Ejercicio3B {
    public static void main(String[] args) throws IOException {
        char car;
        System.out.println("Ingrese un caracter");
        car = (char) System.in.read();
        if (car >= 'A' && car <= 'Z') {
            System.out.println("Es una letra mayuscula");
        } else {
            System.out.println("No es una letra mayuscula");
        }
    }
}
