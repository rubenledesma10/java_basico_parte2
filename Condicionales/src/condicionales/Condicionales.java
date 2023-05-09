/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;

import java.util.Scanner;


public class Condicionales {

   
    public static void main(String[] args) {
        /*int num1=15;
        int num2=10;
        
        if (num2 > num1) {
            System.out.println("Es numero 2 es mayor");
        } else {
            if (num1==num2){
                System.out.println("son iguales");
            } else {
                System.out.println("El numero 1 es mayor que el numero 2");
            }
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int dia = sc.nextInt();
        String nombreDia;
        
        switch (dia) {
            case 1: nombreDia="Lunes";
            break;
            case 2: nombreDia="Martes";
            break;
            case 3: nombreDia="Miercoles";
            break;
            case 4: nombreDia="Jueves";
            break;
            case 5: nombreDia="Viernes";
            break;
            case 6: nombreDia="Sabado";
            break;
            case 7: nombreDia="Domingo";
            break;
            default: nombreDia="numero de dia invalido";
            
        }
        
        System.out.println("El dia de la semana que elegiste fue el " +nombreDia);
    }
    
}
