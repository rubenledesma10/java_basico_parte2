/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_estructuras_repetitivas;

import java.util.Scanner;

public class ejercicio_4_arbolito_navidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //altura del arbol de navidad (a.n)
        System.out.println("¿Que altura te gustaría que tenga el arbol? Ingresar solamente numeros");
        int altura = teclado.nextInt();
        System.out.println("¿Qué largo te gustaria que tenga el tronco? Ingresar solamente numeros");
        int largo_tronco = teclado.nextInt();
        //bucle para recorrer las filas (altura)
        for (int fila = 0; fila<altura; fila++){
            //bucle para los espacios
            
            for (int espacio=0; espacio<(altura-fila-1); espacio++){
                System.out.print(" ");
            }
            //bucle para los asteriscos
            for(int asterisco=0;asterisco<(fila*2)+1;asterisco++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //tronco
        
        for(int base=0; base<largo_tronco;base++){
            
        //espacios en blanco
        for(int espacio=0;espacio<(altura-2);espacio++){
            System.out.print(" ");
        }
        //barra del tronco
        for(int barra_tronco=0; barra_tronco<3; barra_tronco++){
            System.out.print("|");
        }
            System.out.println("");
    }
    }
}
