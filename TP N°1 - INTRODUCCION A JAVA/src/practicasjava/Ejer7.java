package practicasjava;

import java.util.Scanner;

public class Ejer7 {
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        int nro1, nro2;
        
        System.out.println("Ingrese el primer número: ");
        nro1 = s.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        nro2 = s.nextInt();
        
        if(nro1 > nro2){
            System.out.println("El número " + nro1 + " es el mayor");
        } else {
            System.out.println("El número " + nro2 + " es el mayor");
        }
    }
    
}
