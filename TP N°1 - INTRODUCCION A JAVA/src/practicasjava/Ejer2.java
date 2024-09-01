package practicasjava;

import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int nro1,nro2, resultado;
        
        System.out.println("Ingrese el 1° número: ");
        nro1 = s.nextInt();
        
        System.out.println("Ingrese el 2° número: ");
        nro2 = s.nextInt();
        
        resultado = nro1 + nro2;
        
        System.out.println("El resultado de la suma es: " + resultado);
        
    }
    
}
