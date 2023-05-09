/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author RubénEzequiel
 */
public class CortarNombre {
    public static void main(String[] args) {
     Scanner s = new Scanner (System.in);
     System.out.println ("Ingrese su nombre y apellido");
     String nombre = s. nextLine ();
     int posicion = nombre.indexOf (' ');
                  
     System.out.println ("posicion 1:" +posicion);
     String primeraPalabra = nombre.substring (0, posicion);
     System.out.println ("Nombre:" +primeraPalabra);
     String segundaPalabra = nombre. substring (posicion);
     System.out.println ("Apellido:"+segundaPalabra);
         
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    }
}
