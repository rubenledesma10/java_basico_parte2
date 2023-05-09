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
public class Ejercicio7 {
    public static void main(String[] args) throws IOException {
        char car1;
        char car2;
        System.out.println("Ingrese el primer caracter: ");
        car1 = (char) System.in.read();
        System.in.read();
        System.out.println("Ingrese el segundo caracter");
        car2 = (char) System.in.read();
        if (car1 == car2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
