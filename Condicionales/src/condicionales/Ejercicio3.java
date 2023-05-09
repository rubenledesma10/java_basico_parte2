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
public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        //declaracion de variables
        char car;
        System.out.println("Ingrese un caracter");
        car = (char) System.in.read();
        //desarrollo
        if (Character.isUpperCase(car)) {
            System.out.println("Es una letra mayuscula");
        } else {
            System.out.println("Es una letra minuscula");
        }
    }
}
