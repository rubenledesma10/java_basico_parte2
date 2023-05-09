/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author RubénEzequiel
 */
public class Intercambio {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        System.out.println ("a = " + a); 
        System.out.println ("b = " + b);
        int c = a; 
        a = b;
        b = c;
        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
                        
    }
    
}
