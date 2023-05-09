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
public class Ejercicio2 {

    public static Scanner sc;

    public static void main(String[] args) {
        {
            sc = new Scanner(System.in);
            int N;
            int NUMERO_01, NUMERO_02, OP_SUMA, OP_RESTA = 0, OP_MULTIPLICACION = 0;
            float OP_DIVISION;
            NUMERO_01 = LEER_NUMERO("NUMERO_01");
            NUMERO_02 = LEER_NUMERO("NUMERO_02");
            OP_SUMA = SUMA(NUMERO_01, NUMERO_02);
            OP_DIVISION = DIVISION(NUMERO_01, NUMERO_02);
            IMPRIMIR_RESULTADOS(OP_SUMA, OP_RESTA, OP_MULTIPLICACION, OP_DIVISION);
        }
    }

    public static int LEER_NUMERO(String NOMBRE_NUMERO) {
        int NUMERO;
        System.out.println("INDIQUE EL " + NOMBRE_NUMERO + " : ");
        NUMERO = sc.nextInt();
        return NUMERO;
    }

    public static int SUMA(int NUMERO_01, int NUMERO_02) {
        int SUMA;
        SUMA = NUMERO_01 + NUMERO_02;
        return SUMA;
    }

    public static int RESTA(int NUMERO_01, int NUMERO_02) {
        int RESTA;
        RESTA = NUMERO_01 - NUMERO_02;
        return RESTA;

    }

    public static int MULTIPLICACION(int NUMERO_01, int NUMERO_02) {
        int MULTIPLICACION;
        MULTIPLICACION = NUMERO_01 * NUMERO_02;
        return MULTIPLICACION;
    }

    public static float DIVISION(int NUMERO_01, int NUMERO_02) {
        float DIVISION;
        DIVISION = NUMERO_01 / NUMERO_02;
        return DIVISION;

    }

    public static void IMPRIMIR_RESULTADOS(int SUMA, int RESTA, int MULTIPLICACION, float DIVISION) {
        System.out.println("Los resultados son: ");
        System.out.println("SUMA: " + SUMA);
        System.out.println("RESTA: " + RESTA);
        System.out.println("MULTIPLICACION: " + MULTIPLICACION);
        System.out.println("DIVISION: " + DIVISION);
    }
}
