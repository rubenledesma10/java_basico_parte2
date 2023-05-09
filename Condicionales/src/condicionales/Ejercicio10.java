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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dividendo;
        double divisor;
        System.out.println("Ingrese el dividendo");
        dividendo = s.nextDouble();
        System.out.println("Ingrese el divisor");
        divisor = s.nextDouble();
        if (divisor == 0) {
            System.out.println("No se puede divir por cero");
        } else {
            System.out.println(dividendo + "/" + divisor + "-" + dividendo / divisor);
            System.out.printf("%.2f/%.2f=%.2f%n", dividendo, divisor, dividendo / divisor);
        }

    }
}
