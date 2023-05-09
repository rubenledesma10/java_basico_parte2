package integrador_condicionales;

import java.util.Scanner;


public class Integrador_condicionales {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double sueldoRepositores = 15890 * 1.10;
        double sueldoCajeros = 25630.89;
        double sueldoSupervisores = 35560.20 - (35560*0.11);
        
        System.out.println("De quien quiere saber el sueldo? Introduzca el numero segun el empleado");
        System.out.println("1. Repositores");
        System.out.println("2. Cajeros");
        System.out.println("3. Supervisores");
        
        int empleado = sc.nextInt();
        String sueldo;
        
        switch (empleado){
            case 1: sueldo="Repositor";
                System.out.println("El sueldo de un repositor es de $" +sueldoRepositores);
            break;
            case 2: sueldo="Cajeros";
                System.out.println("El sueldo de un cajero es de " +sueldoCajeros);
            break;
            case 3: sueldo ="Supervisores";
                System.out.println("El sueldo de un supervisor es de "+sueldoSupervisores);
            break;  
            default: System.out.println("No existe esa opcion, vuelva a intentarlo");
            break;
            
        }
        
        
        
    }
    
}
