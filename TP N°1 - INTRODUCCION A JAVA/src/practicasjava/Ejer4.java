package practicasjava;

import java.util.Scanner;

public class Ejer4 {
 
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        String frase, mayus, minus;
        
        System.out.println("Ingrese su frase: ");
        frase = s.nextLine();
        
        mayus = frase.toUpperCase();
        minus = frase.toLowerCase();
        
        System.out.println("Mayúsculas: " + mayus);
        System.out.println("Minúsculas: " + minus);
    }
    
}
