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
public class CortarCadena {
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println ("Ingrese un texto");
    String texto = s. nextLine ();
    int longitud = texto.length ();
    System.out.println ("La longitud de la cadena es:"+longitud);
   
       int mitad = longitud / 2;
  
   String parte1 = texto.substring (0, mitad);
   System.out.println ("Primer parte de la cadena:"+parte1);
      String parte2 = texto.substring (mitad, longitud);
   System.out.println ("Segunda parte de la cadena:"+parte2);
        
            
     
   
    }
}
