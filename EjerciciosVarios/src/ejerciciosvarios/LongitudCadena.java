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
public class LongitudCadena {
    public static void main(String[] args) {
   Scanner s = new Scanner (System.in);
   System.out.println ("Ingrese un texto");
   String texto = s.nextLine();
   int longitud = texto.length ();
   System.out.println ("Longitud de la cadena:"+longitud);
        
    }
    
}
