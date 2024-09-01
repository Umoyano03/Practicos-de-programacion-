package practicasjava;

import java.util.Scanner;

public class Ejer10 {
        public static void main(String[] args){
            
        Scanner s = new Scanner(System.in);
        
        String frase, cadena1;
        int longitud;
        
        System.out.println("Ingrese su frase: ");
        frase = s.nextLine();
        
        longitud = frase.length();
        cadena1 = frase.substring(0,1);
        
        if(cadena1.equals("a") || cadena1.equals("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }    


}
        
