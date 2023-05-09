/*
 Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra "salir"
 */
package ejercicios_estructuras_repetitivas;

import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame una palabra");
        String palabra = teclado.nextLine();

        while (!palabra.equals("salir")){
            System.out.println("La palabra que ingresaste fue " + palabra);
            System.out.println("Dame otra palabra: ");
            palabra = teclado.nextLine();
        }

    }
}
