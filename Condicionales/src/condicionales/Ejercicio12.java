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
public class Ejercicio12 {
    public static void main(String[] args) {
        int hora;
        int minutos;
        int segundos;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la hora");
        hora = s.nextInt();
        System.out.println("Ingrese los minutos");
        minutos = s.nextInt();
        System.out.println("Ingrese los segundos");
        segundos = s.nextInt();
        if (hora >= 0 && hora < 24 && minutos < 60 && segundos >= 0 && segundos < 60) {
            System.out.println("Hora correcta: ");
            System.out.println("La hora es: " + hora + ":" + minutos + ":" + segundos + ".");
        } else {
            System.out.println("Hora incorrecta: ");
        }
    }
}

