/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author RubénEzequiel
 */
public class Ejercicio1 {

    public static Scanner sc;

    public static void main(String[] args) {
        {
            sc = new Scanner(System.in);
            int N;
            N = LEER_NUMERO();
            N_VECES(N);

        }

    }

    public static int LEER_NUMERO() {
        int NUMERO = 0;
        System.out.println("Indique el valor del numero: ");
        NUMERO = sc.nextInt();
        return NUMERO;
    }

    public static void N_VECES(int N) {
        int I;
        for (I = 1; I <= N; I++) {
            System.out.println(I + " VECES: MODULO EJECUTANDOSE");
        }
    }
}
