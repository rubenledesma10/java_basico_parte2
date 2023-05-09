/*
Categorias:
MENORES A (6 a 10 años)
MENORES B (11 a 17 años)
JUVENILES (18 a 30 años)
ADULTOS (31 a 50 años)
ADULTOS MAYORES (mayores de 50 años)

Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, se muestre por pantalla
a que categoria debe ser inscripto. Cabe destacar que, al finalizar el dia, para dar fin a las inscripciones, se debe 
ingresar un dni con el valor 0 y un nombre con la palabra fin
 */
package ejercicios_estructuras_repetitivas;

import java.util.Scanner;

public class ejericicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dame tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Dame tu edad: ");
        int edad = teclado.nextInt();
        System.out.println("Dame tu numero de documento: ");
        double dni = teclado.nextDouble();
        
        while (dni != 0 && !nombre.equalsIgnoreCase("fin")){
            if (edad >= 6 && edad <=10) {
                System.out.println("Participas en la CATEGORIA A");
                
            } else {
                if (edad >=11 && edad <=17) {
                    System.out.println("Participas en la CATEGORIA B");
                    
                } else {
                    if (edad >=18 && edad <=30) {
                        System.out.println("Participas en la categoria de JUVENILES");
                       
                    } else {
                        if (edad >= 51) {
                            System.out.println("Participas en la categoria de ADULTOS");
                            
                        } else {
                            System.out.println("Participas en la categoria de ADULTOS MAYORES");
                            
                        }
                    }
                }
            }
                System.out.println("Dame tu nombre: ");
                nombre = teclado.next();
                System.out.println("Dame tu edad: ");
                edad = teclado.nextInt();
                System.out.println("Dame tu numero de documento: ");
                dni = teclado.nextDouble();
    }           
        
    }
}
