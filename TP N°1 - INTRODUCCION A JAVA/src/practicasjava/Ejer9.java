package practicasjava;

import java.util.Scanner;

public class Ejer9 {
 
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        String frase;
        int longitud;
        
        System.out.println("Ingrese la frase deseada: ");
        frase = s.nextLine();
        
        longitud = frase.length();
        
        if(longitud == 8){
            System.out.println("CORECTO");
        } else {
            System.out.println("INCORRECTO");
        }
                
        
    }
    
}
