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
public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        char car1;
        System.out.println("Ingrese un caracter");
        car1 = (char) System.in.read();
        if (Character.isDigit(car1)) {
            System.out.println("Es un numero");
        } else {
            System.out.println("No es un numero");
        }

    }
}

