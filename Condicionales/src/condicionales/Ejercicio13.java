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
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mes;
        System.out.println("Ingrese el numero de mes");
        mes = s.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Mes incorrecto");
        } else {
            switch (mes) {
                case 1 ->
                    System.out.println("Enero");
                case 2 ->
                    System.out.println("Febrero");
                case 3 ->
                    System.out.println("Marzo");
                case 4 ->
                    System.out.println("Abril");
                case 5 ->
                    System.out.println("Mayo");
                case 6 ->
                    System.out.println("Junio");
                case 7 ->
                    System.out.println("Julio");
                case 8 ->
                    System.out.println("Agosto");
                case 9 ->
                    System.out.println("Septiembre");
                case 10 ->
                    System.out.println("Octubre");
                case 11 ->
                    System.out.println("Noviembre");
                case 12 ->
                    System.out.println("Diciembre");
            }

            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println("Es un mes de 30 dias");
            } else if (mes == 2) {
                System.out.println("Es un mes de 28 dias");
            } else {
                {
                    System.out.println("Es un mes de 31 dias");
                }
            }
        }
    }
}

     
   
